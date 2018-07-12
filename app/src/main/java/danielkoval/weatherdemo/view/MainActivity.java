package danielkoval.weatherdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import danielkoval.weatherdemo.R;
import danielkoval.weatherdemo.presenter.IForecastItem;
import danielkoval.weatherdemo.presenter.WeatherPresenter;

public class MainActivity extends AppCompatActivity implements IWeatherView {
    private ProgressBar progressBar;
    private ListView listView;
    private WeatherPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progress_bar);
        listView = findViewById(R.id.list_view);
        presenter = new WeatherPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listView.setAdapter(null);
        progressBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.retrieveWeather();
            }
        }, 2000);

        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.abandonRetrievingWeather();
    }

    @Override
    public void onWeatherReceived(List<IForecastItem> forecast) {
        progressBar.setVisibility(View.GONE);
        listView.setAdapter(new ForecastListAdapter(forecast));
        Toast.makeText(this, "Weather received", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onWeatherNonReceived(String errorMessage) {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }
}
