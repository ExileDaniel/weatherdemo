package danielkoval.weatherdemo;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import danielkoval.weatherdemo.model.entities.WeatherJsonResponse;
import danielkoval.weatherdemo.model.network.WeatherCaller;
import danielkoval.weatherdemo.presenter.IForecastItem;
import danielkoval.weatherdemo.presenter.IWeatherResultReceiver;
import danielkoval.weatherdemo.presenter.WeatherPresenter;
import danielkoval.weatherdemo.view.IWeatherView;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.observers.TestObserver;
import io.reactivex.plugins.RxJavaPlugins;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @BeforeClass
    public static void setUpRxSchedulers() {
        final Scheduler immediate = new Scheduler() {
            @Override
            public Disposable scheduleDirect(@NonNull Runnable run, long delay, @NonNull TimeUnit unit) {
                // this prevents StackOverflowErrors when scheduling with a delay
                return super.scheduleDirect(run, 0, unit);
            }

            @Override
            public Worker createWorker() {
                return new ExecutorScheduler.ExecutorWorker(new Executor() {
                    @Override
                    public void execute(@android.support.annotation.NonNull Runnable runnable) {
                        runnable.run();
                    }
                });
            }
        };

        Function f = new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> schedulerCallable) {
                return immediate;
            }
        };

        RxJavaPlugins.setInitIoSchedulerHandler(f);
        RxJavaPlugins.setInitComputationSchedulerHandler(f);
        RxJavaPlugins.setInitNewThreadSchedulerHandler(f);
        RxJavaPlugins.setInitSingleSchedulerHandler(f);
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(f);
    }

    @Test
    public void networkTest() {
        WeatherCaller caller = new WeatherCaller(new IWeatherResultReceiver() {
            @Override
            public void onWeatherReceived(WeatherJsonResponse weatherJsonResponse) {
                assertNotNull(weatherJsonResponse);
                assertNotNull(weatherJsonResponse.getForecast());
                assertNotNull(weatherJsonResponse.getForecast().getFiveDayForecast());
                assertTrue(weatherJsonResponse.getForecast().getFiveDayForecast().size() == 5);
            }

            @Override
            public void onWeatherNonReceived(String errorMessage) {
                assertNotNull(errorMessage);
            }
        });
        caller.loadWeather();
    }

    @Test
    public void presenterTest() {
        WeatherPresenter presenter = new WeatherPresenter(new IWeatherView() {
            @Override
            public void onWeatherReceived(List<IForecastItem> forecast) {
                assertNotNull(forecast);
                assertTrue(!forecast.isEmpty());
                assertTrue(forecast.size() == 5);
            }

            @Override
            public void onWeatherNonReceived(String errorMessage) {
                assertNotNull(errorMessage);
            }
        });

        presenter.retrieveWeather();
    }
}