package danielkoval.weatherdemo.presenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import danielkoval.weatherdemo.model.entities.FiveDayForecast;

public class ForecastMapper {
    public static List<IForecastItem> mapForecast(List<FiveDayForecast> fiveDayForecast) {
        List<IForecastItem> result = new ArrayList<>();

        for (FiveDayForecast rawForecastItem : fiveDayForecast) {
            ForecastItem forecastItem = new ForecastItem();
            forecastItem.setDate(getFormattedDate(rawForecastItem));
            forecastItem.setImageUrl(rawForecastItem.getIconurl());
            forecastItem.setRainChance(getFormattedRainChance(rawForecastItem));
            forecastItem.setTempRange(getFormattedTempRange(rawForecastItem));
            forecastItem.setWind(getFormattedWind(rawForecastItem));
            result.add(forecastItem);
        }

        return result;
    }

    private static String getFormattedDate(FiveDayForecast rawForecastItem) {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String inputDateString = rawForecastItem.getDay().split("T")[0];
        Date date = null;

        try {
            date = inputDateFormat.parse(inputDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dateFormat.format(date);
    }

    private static String getFormattedRainChance(FiveDayForecast rawForecastItem) {
        return String.format(Locale.getDefault(), "%d %% precipitation", rawForecastItem.getRainChance());
    }

    private static String getFormattedTempRange(FiveDayForecast rawForecastItem) {
        String minTempFormatted = String.format(Locale.getDefault(), rawForecastItem.getMintemperatureMin() < 0 ? "-%d" : "+%d", rawForecastItem.getMintemperatureMin());
        String maxTempFormatted = String.format(Locale.getDefault(), rawForecastItem.getMaxtemperatureMax() < 0 ? "-%d" : "+%d", rawForecastItem.getMaxtemperatureMax());
        return String.format(Locale.getDefault(), "%s..%s \u00b0C", minTempFormatted, maxTempFormatted);
    }

    private static String getFormattedWind(FiveDayForecast rawForecastItem) {
        return String.format(Locale.getDefault(), "%d m/s %s", rawForecastItem.getWind(), rawForecastItem.getWindDirection().toUpperCase());
    }
}
