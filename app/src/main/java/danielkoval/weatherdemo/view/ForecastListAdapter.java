package danielkoval.weatherdemo.view;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import danielkoval.weatherdemo.R;
import danielkoval.weatherdemo.presenter.IForecastItem;

public class ForecastListAdapter extends BaseAdapter {
    private List<IForecastItem> forecast;

    ForecastListAdapter(@NonNull List<IForecastItem> forecast) {
        this.forecast = forecast;
    }

    @Override
    public int getCount() {
        return forecast.size();
    }

    @Override
    public IForecastItem getItem(int i) {
        return forecast.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = View.inflate(viewGroup.getContext(), R.layout.forecast_item, null);
            viewHolder = new ViewHolder();
            viewHolder.icon = view.findViewById(R.id.icon);
            viewHolder.date = view.findViewById(R.id.date_txt);
            viewHolder.temp = view.findViewById(R.id.temp_txt);
            viewHolder.wind = view.findViewById(R.id.wind_txt);
            viewHolder.rain = view.findViewById(R.id.rain_txt);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        IForecastItem item = getItem(i);

        viewHolder.date.setText(item.getDate());
        viewHolder.temp.setText(item.getTempRange());
        viewHolder.wind.setText(item.getWind());
        viewHolder.rain.setText(item.getRainChance());
        Picasso.with(viewGroup.getContext()).load(item.getImageUrl()).into(viewHolder.icon);

        return view;
    }

    private static class ViewHolder {
        ImageView icon;
        TextView date, temp, wind, rain;
    }
}
