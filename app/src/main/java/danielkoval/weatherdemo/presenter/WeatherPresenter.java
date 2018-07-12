package danielkoval.weatherdemo.presenter;

import danielkoval.weatherdemo.model.entities.WeatherJsonResponse;
import danielkoval.weatherdemo.model.network.WeatherCaller;
import danielkoval.weatherdemo.view.IWeatherView;

public class WeatherPresenter implements IWeatherResultReceiver{
    private IWeatherView view;
    private WeatherCaller caller;

    public WeatherPresenter(IWeatherView view) {
        this.view = view;
    }

    public void retrieveWeather() {
        caller = new WeatherCaller(this);
        caller.loadWeather();
    }

    public void abandonRetrievingWeather() {
        caller.cancelLoading();
    }

    @Override
    public void onWeatherReceived(WeatherJsonResponse weatherJsonResponse) {
        if (weatherJsonResponse == null || weatherJsonResponse.getForecast() == null
                || weatherJsonResponse.getForecast().getFiveDayForecast() == null
                || weatherJsonResponse.getForecast().getFiveDayForecast().isEmpty()) {
            onWeatherNonReceived("Forecast is empty");
            return;
        }

        view.onWeatherReceived(ForecastMapper.mapForecast(weatherJsonResponse.getForecast().getFiveDayForecast()));
    }

    @Override
    public void onWeatherNonReceived(String errorMessage) {
        view.onWeatherNonReceived(errorMessage);
    }
}
