package tech.hashincludebrain.weatherapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priyabrata Naskar on 18-05-2021.
 */
public class Weather {
    /**
     * "weather": [{
     * 		        "id": 800,
     * 		        "main": "Clear",
     * 		        "description": "clear sky",
     *              "icon": "https://cdn.glitch.com/6e8889e5-7a72-48f0-a061-863548450de5%2F01d.png?1499366022009"
     *        }],
     */

    @SerializedName("main")
    private String weatherName;

    @SerializedName("icon")
    private String weatherIconResource;

    /**
     *
     * @return weather name. e.g: Rainy
     */
    public String getWeatherName() {
        return weatherName;
    }

    /**
     *
     * @param weatherName
     */
    public void setWeatherName(String weatherName) {
        this.weatherName = weatherName;
    }

    /**
     *
     * @return weather image URL
     */
    public String getWeatherIconResource() {
        return weatherIconResource;
    }

    /**
     *
     * @param weatherIconResource
     */
    public void setWeatherIconResource(String weatherIconResource) {
        this.weatherIconResource = weatherIconResource;
    }
}
