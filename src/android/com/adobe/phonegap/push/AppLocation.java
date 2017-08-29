package com.adobe.phonegap.push;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/**
 * Created by vinicius.barbosa on 15/08/2016.
 */
public class AppLocation {
    public String type;
    public ArrayList<LatLng> polygon;
    public LatLng center;
    public double radius;

    public AppLocation() {
        type = "";
        polygon = null;
        center = null;
        radius = -1;
    }
}
