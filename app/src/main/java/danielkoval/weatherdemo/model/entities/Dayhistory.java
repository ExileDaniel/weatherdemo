
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Dayhistory {

    @Expose
    private Double groundtemperatureMin;
    @Expose
    private Double sunshineHours;
    @Expose
    private Double temperatureMax;
    @Expose
    private Double temperatureMin;
    @Expose
    private String timestamp;
    @Expose
    private Long windDirectionDegreesMax;
    @SerializedName("wind speed BftMax")
    private Long windSpeedBftMax;
    @Expose
    private Double windgustsMax;
    @Expose
    private Double windspeedMax;

    public Double getGroundtemperatureMin() {
        return groundtemperatureMin;
    }

    public void setGroundtemperatureMin(Double groundtemperatureMin) {
        this.groundtemperatureMin = groundtemperatureMin;
    }

    public Double getSunshineHours() {
        return sunshineHours;
    }

    public void setSunshineHours(Double sunshineHours) {
        this.sunshineHours = sunshineHours;
    }

    public Double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(Double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public Double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(Double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getWindDirectionDegreesMax() {
        return windDirectionDegreesMax;
    }

    public void setWindDirectionDegreesMax(Long windDirectionDegreesMax) {
        this.windDirectionDegreesMax = windDirectionDegreesMax;
    }

    public Long getWindSpeedBftMax() {
        return windSpeedBftMax;
    }

    public void setWindSpeedBftMax(Long windSpeedBftMax) {
        this.windSpeedBftMax = windSpeedBftMax;
    }

    public Double getWindgustsMax() {
        return windgustsMax;
    }

    public void setWindgustsMax(Double windgustsMax) {
        this.windgustsMax = windgustsMax;
    }

    public Double getWindspeedMax() {
        return windspeedMax;
    }

    public void setWindspeedMax(Double windspeedMax) {
        this.windspeedMax = windspeedMax;
    }

}
