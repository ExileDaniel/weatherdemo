
package danielkoval.weatherdemo.model.entities;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FiveDayForecast {
    @Expose
    private String day;
    @SerializedName("folder temperature")
    private String folderTemperature;
    @Expose
    private String iconurl;
    @Expose
    private Long maxtemperatureMax;
    @Expose
    private Long maxtemperatureMin;
    @Expose
    private String mintemperature;
    @Expose
    private Long mintemperatureMax;
    @Expose
    private Long mintemperatureMin;
    @Expose
    private Double mmRainMax;
    @Expose
    private Double mmRainMin;
    @Expose
    private Long rainChance;
    @Expose
    private Long sunChance;
    @Expose
    private String weatherdescription;
    @Expose
    private Long wind;
    @Expose
    private String windDirection;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getFolderTemperature() {
        return folderTemperature;
    }

    public void setFolderTemperature(String folderTemperature) {
        this.folderTemperature = folderTemperature;
    }

    public String getIconurl() {
        return iconurl;
    }

    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    public Long getMaxtemperatureMax() {
        return maxtemperatureMax;
    }

    public void setMaxtemperatureMax(Long maxtemperatureMax) {
        this.maxtemperatureMax = maxtemperatureMax;
    }

    public Long getMaxtemperatureMin() {
        return maxtemperatureMin;
    }

    public void setMaxtemperatureMin(Long maxtemperatureMin) {
        this.maxtemperatureMin = maxtemperatureMin;
    }

    public String getMintemperature() {
        return mintemperature;
    }

    public void setMintemperature(String mintemperature) {
        this.mintemperature = mintemperature;
    }

    public Long getMintemperatureMax() {
        return mintemperatureMax;
    }

    public void setMintemperatureMax(Long mintemperatureMax) {
        this.mintemperatureMax = mintemperatureMax;
    }

    public Long getMintemperatureMin() {
        return mintemperatureMin;
    }

    public void setMintemperatureMin(Long mintemperatureMin) {
        this.mintemperatureMin = mintemperatureMin;
    }

    public Double getMmRainMax() {
        return mmRainMax;
    }

    public void setMmRainMax(Double mmRainMax) {
        this.mmRainMax = mmRainMax;
    }

    public Double getMmRainMin() {
        return mmRainMin;
    }

    public void setMmRainMin(Double mmRainMin) {
        this.mmRainMin = mmRainMin;
    }

    public Long getRainChance() {
        return rainChance;
    }

    public void setRainChance(Long rainChance) {
        this.rainChance = rainChance;
    }

    public Long getSunChance() {
        return sunChance;
    }

    public void setSunChance(Long sunChance) {
        this.sunChance = sunChance;
    }

    public String getWeatherdescription() {
        return weatherdescription;
    }

    public void setWeatherdescription(String weatherdescription) {
        this.weatherdescription = weatherdescription;
    }

    public Long getWind() {
        return wind;
    }

    public void setWind(Long wind) {
        this.wind = wind;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

}
