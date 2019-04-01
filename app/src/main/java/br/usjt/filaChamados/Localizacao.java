package br.usjt.filaChamados;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;

public abstract class Localizacao {

    private LocationManager locationManager;
    private LocationListener locationListener;


    public String toString() {
        return "Localizacao{" +
                "longitude=" + locationManager +
                ", latitude=" + locationListener +
                '}';
    }
}
