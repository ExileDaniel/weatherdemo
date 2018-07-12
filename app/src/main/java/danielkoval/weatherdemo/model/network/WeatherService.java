package danielkoval.weatherdemo.model.network;


import danielkoval.weatherdemo.model.entities.WeatherJsonResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface WeatherService {
    @GET("data/public/2.0/jsonfeed")
    Observable<WeatherJsonResponse> getWeather();
}
