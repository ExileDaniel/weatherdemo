
package danielkoval.weatherdemo.model.entities;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("fivedayforecast")
    private List<FiveDayForecast> fiveDayForecast;
    @Expose
    private Longterm longterm;
    @Expose
    private Shortterm shortterm;
    @Expose
    private Weatherreport weatherreport;

    public List<FiveDayForecast> getFiveDayForecast() {
        return fiveDayForecast;
    }

    public void setFiveDayForecast(List<FiveDayForecast> fiveDayForecast) {
        this.fiveDayForecast = fiveDayForecast;
    }

    public Longterm getLongterm() {
        return longterm;
    }

    public void setLongterm(Longterm longterm) {
        this.longterm = longterm;
    }

    public Shortterm getShortterm() {
        return shortterm;
    }

    public void setShortterm(Shortterm shortterm) {
        this.shortterm = shortterm;
    }

    public Weatherreport getWeatherreport() {
        return weatherreport;
    }

    public void setWeatherreport(Weatherreport weatherreport) {
        this.weatherreport = weatherreport;
    }

}
