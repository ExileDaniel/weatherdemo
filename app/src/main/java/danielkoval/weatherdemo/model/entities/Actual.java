
package danielkoval.weatherdemo.model.entities;

import java.util.List;
import com.google.gson.annotations.Expose;
public class Actual {

    @Expose
    private String actualradarurl;
    @Expose
    private List<Stationmeasurement> stationmeasurements;
    @Expose
    private String sunrise;
    @Expose
    private String sunset;

    public String getActualradarurl() {
        return actualradarurl;
    }

    public void setActualradarurl(String actualradarurl) {
        this.actualradarurl = actualradarurl;
    }

    public List<Stationmeasurement> getStationmeasurements() {
        return stationmeasurements;
    }

    public void setStationmeasurements(List<Stationmeasurement> stationmeasurements) {
        this.stationmeasurements = stationmeasurements;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

}
