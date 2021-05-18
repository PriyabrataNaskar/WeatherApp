package tech.hashincludebrain.weatherapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Priyabrata Naskar on 18-05-2021.
 */
public class Coord {
    /**
     * 	"coord": {
     * 		"lon": 139,
     * 		"lat": 35
     *        },
     */
    @SerializedName("lon")
    private String longitude;
    @SerializedName("lat")
    private String latitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
