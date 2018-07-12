
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Stationmeasurement {

    @Expose
    private Object airpressure;
    @Expose
    private Dayhistory dayhistory;
    @Expose
    private Double feeltemperature;
    @Expose
    private String graphurl;
    @SerializedName("ground temperature")
    private Double groundTemperature;
    @Expose
    private Double humidity;
    @Expose
    private String iconurl;
    @Expose
    private Double lat;
    @Expose
    private Double lon;
    @Expose
    private Double precipitation;
    @Expose
    private Double rainFallLast24Hour;
    @Expose
    private Double rainFallLastHour;
    @Expose
    private String region;
    @Expose
    private String station;
    @Expose
    private Long stationid;
    @Expose
    private Double sunpower;
    @Expose
    private Double temperature;
    @Expose
    private String timestamp;
    @Expose
    private Object visibility;
    @Expose
    private String weatherdescription;
    @SerializedName("wind direction")
    private String windDirection;
    @SerializedName("wind speed")
    private Double windSpeed;
    @SerializedName("wind speed bft")
    private Long windSpeedBft;
    @Expose
    private Long winddirectiondegrees;
    @Expose
    private Double windgusts;

    public Object getAirpressure() {
        return airpressure;
    }

    public void setAirpressure(Object airpressure) {
        this.airpressure = airpressure;
    }

    public Dayhistory getDayhistory() {
        return dayhistory;
    }

    public void setDayhistory(Dayhistory dayhistory) {
        this.dayhistory = dayhistory;
    }

    public Double getFeeltemperature() {
        return feeltemperature;
    }

    public void setFeeltemperature(Double feeltemperature) {
        this.feeltemperature = feeltemperature;
    }

    public String getGraphurl() {
        return graphurl;
    }

    public void setGraphurl(String graphurl) {
        this.graphurl = graphurl;
    }

    public Double getGroundTemperature() {
        return groundTemperature;
    }

    public void setGroundTemperature(Double groundTemperature) {
        this.groundTemperature = groundTemperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Double precipitation) {
        this.precipitation = precipitation;
    }

    public Double getRainFallLast24Hour() {
        return rainFallLast24Hour;
    }

    public void setRainFallLast24Hour(Double rainFallLast24Hour) {
        this.rainFallLast24Hour = rainFallLast24Hour;
    }

    public Double getRainFallLastHour() {
        return rainFallLastHour;
    }

    public void setRainFallLastHour(Double rainFallLastHour) {
        this.rainFallLastHour = rainFallLastHour;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Long getStationid() {
        return stationid;
    }

    public void setStationid(Long stationid) {
        this.stationid = stationid;
    }

    public Double getSunpower() {
        return sunpower;
    }

    public void setSunpower(Double sunpower) {
        this.sunpower = sunpower;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object getVisibility() {
        return visibility;
    }

    public void setVisibility(Object visibility) {
        this.visibility = visibility;
    }

    public String getWeatherdescription() {
        return weatherdescription;
    }

    public void setWeatherdescription(String weatherdescription) {
        this.weatherdescription = weatherdescription;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Long getWindSpeedBft() {
        return windSpeedBft;
    }

    public void setWindSpeedBft(Long windSpeedBft) {
        this.windSpeedBft = windSpeedBft;
    }

    public Long getWinddirectiondegrees() {
        return winddirectiondegrees;
    }

    public void setWinddirectiondegrees(Long winddirectiondegrees) {
        this.winddirectiondegrees = winddirectiondegrees;
    }

    public Double getWindgusts() {
        return windgusts;
    }

    public void setWindgusts(Double windgusts) {
        this.windgusts = windgusts;
    }

}
