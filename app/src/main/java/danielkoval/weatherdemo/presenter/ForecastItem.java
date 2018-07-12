package danielkoval.weatherdemo.presenter;

public class ForecastItem implements IForecastItem {
    private String date;
    private String tempRange;
    private String imageUrl;
    private String rainChance;
    private String wind;

    public void setDate(String date) {
        this.date = date;
    }

    public void setTempRange(String tempRange) {
        this.tempRange = tempRange;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setRainChance(String rainChance) {
        this.rainChance = rainChance;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public String getTempRange() {
        return tempRange;
    }

    @Override
    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String getRainChance() {
        return rainChance;
    }

    @Override
    public String getWind() {
        return wind;
    }
}
