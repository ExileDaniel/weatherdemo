package danielkoval.weatherdemo.model.network;

import android.annotation.SuppressLint;

import org.reactivestreams.Subscriber;

import danielkoval.weatherdemo.presenter.IWeatherResultReceiver;
import danielkoval.weatherdemo.model.entities.WeatherJsonResponse;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherCaller extends DisposableObserver<WeatherJsonResponse>{
    private IWeatherResultReceiver weatherReceiver;

    public WeatherCaller(IWeatherResultReceiver weatherReceiver) {
        this.weatherReceiver = weatherReceiver;
    }

    @SuppressLint("CheckResult")
    public void loadWeather() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.buienradar.nl/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        retrofit.create(WeatherService.class).getWeather()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(this);
    }

    @Override
    public void onNext(WeatherJsonResponse o) {
        if (!isDisposed()) {
            weatherReceiver.onWeatherReceived(o);
        }
    }

    @Override
    public void onError(Throwable e) {
        if (!isDisposed()) {
            weatherReceiver.onWeatherNonReceived(e.getMessage());
        }
    }

    @Override
    public void onComplete() {
    }

    public void cancelLoading() {
        dispose();
    }
}
