package tech.hashincludebrain.weatherapp;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Priyabrata Naskar on 17-05-2021.
 */
public class ResponseModel {
    @SerializedName("coord")
    private Coord coord;
    @SerializedName("weather")
    private List<Weather> weathers;
    @SerializedName("main")
    private Main main;
    @SerializedName("wind")
    private Wind wind;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
