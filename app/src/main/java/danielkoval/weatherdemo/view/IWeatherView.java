package danielkoval.weatherdemo.view;

import java.util.List;

import danielkoval.weatherdemo.presenter.IForecastItem;

public interface IWeatherView {
    void onWeatherReceived(List<IForecastItem> forecast);
    void onWeatherNonReceived(String errorMessage);
}
