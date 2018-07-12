package danielkoval.weatherdemo.presenter;

import danielkoval.weatherdemo.model.entities.WeatherJsonResponse;

public interface IWeatherResultReceiver {
    void onWeatherReceived(WeatherJsonResponse weatherJsonResponse);
    void onWeatherNonReceived(String errorMessage);
}
