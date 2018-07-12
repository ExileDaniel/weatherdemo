
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
public class Longterm {

    @Expose
    private String enddate;
    @Expose
    private String forecast;
    @Expose
    private String startdate;

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

}
