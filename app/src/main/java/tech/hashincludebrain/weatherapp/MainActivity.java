package tech.hashincludebrain.weatherapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView weatherName;
    ImageView weatherImage;
    TextView tempTextView;
    TextView windSpeedTextView;
    TextView maxTempTextView;
    TextView minTempTextView;
    TextView longTextView;
    TextView latTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherName = findViewById(R.id.weather_name);
        weatherImage = findViewById(R.id.weather_image);

        tempTextView = findViewById(R.id.temp_text);

        windSpeedTextView = findViewById(R.id.wind_speed);

        maxTempTextView = findViewById(R.id.max_temp);
        minTempTextView = findViewById(R.id.min_temp);

        longTextView = findViewById(R.id.longitude);
        latTextView = findViewById(R.id.latitude);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PlaceHolderInterface service = retrofit.create(PlaceHolderInterface.class);
        Call<ResponseModel> call = service.getWeather("35", "139");
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if (!response.isSuccessful()) {
                    Toast.makeText(getApplicationContext(), " " + response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getApplicationContext(), "Successful ", Toast.LENGTH_SHORT).show();
                assert response.body() != null;
                response.body().getCoord();
                Weather weather = response.body().getWeathers().get(0);
                weatherName.setText(weather.getWeatherName());

                Glide.with(getApplicationContext()).load(weather.getWeatherIconResource()).centerCrop().into(weatherImage);

                Main main = response.body().getMain();
                tempTextView.setText("Temp: " + String.valueOf(main.getTemp()));
                maxTempTextView.setText("Max Temp: " + String.valueOf(main.getTempMax()));
                minTempTextView.setText("Min Temp: " + String.valueOf(main.getTempMin()));
                Wind wind = response.body().getWind();
                windSpeedTextView.setText("Wind Speed: " + String.valueOf(wind.getSpeed()));

                Coord coord = response.body().getCoord();
                latTextView.setText("Latitude: " + coord.getLatitude());
                longTextView.setText("Longitude: " + coord.getLongitude());
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}