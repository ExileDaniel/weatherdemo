
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class WeatherJsonResponse {

    @Expose
    private Actual actual;
    @SerializedName("buien radar")
    private BuienRadar buienRadar;
    @Expose
    private Forecast forecast;

    public Actual getActual() {
        return actual;
    }

    public void setActual(Actual actual) {
        this.actual = actual;
    }

    public BuienRadar getBuienRadar() {
        return buienRadar;
    }

    public void setBuienRadar(BuienRadar buienRadar) {
        this.buienRadar = buienRadar;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

}
