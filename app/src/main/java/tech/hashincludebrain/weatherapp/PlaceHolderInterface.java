package tech.hashincludebrain.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Priyabrata Naskar on 17-05-2021.
 */

public interface PlaceHolderInterface {

    @GET("api/current")
    Call<ResponseModel> getWeather(@Query("lat") String lat,@Query("lon") String lon);

}
