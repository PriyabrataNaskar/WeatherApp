package tech.hashincludebrain.weatherapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priyabrata Naskar on 18-05-2021.
 */
public class Main {
    /**
     * "main": {
     * 		"temp": 26.95,
     * 		"feels_like": 27.49,
     * 		"temp_min": 26.67,
     * 		"temp_max": 27.22,
     * 		"pressure": 1007,
     * 		"humidity": 52
     *        },
     */

    @SerializedName("temp")
    private double temp;

    @SerializedName("temp_min")
    private double tempMin;

    @SerializedName("temp_max")
    private double tempMax;

    /**
     *
     * @return temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     *
     * @param temp
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     *
     * @return tempMin
     */
    public double getTempMin() {
        return tempMin;
    }

    /**
     *
     * @param tempMin
     */
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     *
     * @return tempMax
     */
    public double getTempMax() {
        return tempMax;
    }

    /**
     *
     * @param tempMax
     */
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }
}
