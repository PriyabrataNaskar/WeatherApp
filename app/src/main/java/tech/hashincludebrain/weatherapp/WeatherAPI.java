package tech.hashincludebrain.weatherapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Priyabrata Naskar on 17-05-2021.
 */
public class WeatherAPI {
    private static Retrofit retrofit = null;

    /**
     * Singleton Class
     * @return retrofit object
     */
    public static Retrofit getRetrofit(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder().
                    baseUrl(Constants.BASE_URL).
                    addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
