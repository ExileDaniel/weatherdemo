package danielkoval.weatherdemo.presenter;

public interface IForecastItem {
    String getDate();
    String getTempRange();
    String getImageUrl();
    String getRainChance();
    String getWind();
}
