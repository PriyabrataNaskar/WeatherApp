package tech.hashincludebrain.weatherapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priyabrata Naskar on 18-05-2021.
 */
public class Wind {

    /**     "speed": 4.02,
            "deg": 235,
            "gust": 5.81
     **/
    @SerializedName("speed")
    private double speed;
    @SerializedName("deg")
    private double deg;
    @SerializedName("gust")
    private double gust;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}
