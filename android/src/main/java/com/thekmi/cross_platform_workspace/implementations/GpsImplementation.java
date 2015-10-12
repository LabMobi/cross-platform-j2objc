package com.thekmi.cross_platform_workspace.implementations;

import android.location.Location;

import com.thekmi.cross_platform_workspace.interfaces.GpsInterface;
import com.thekmi.cross_platform_workspace.models.GpsModel;
import com.thekmi.cross_platform_workspace.utils.GpsManager;

public class GpsImplementation implements GpsInterface {

    /**
     * Returns last location of the device.
     * @return
     */
    @Override
    public GpsModel getLastLocation() {

        Location location = GpsManager.getInstance().getLastLocation();

        if(location != null)
        {
            GpsModel gpsModel = new GpsModel();
            gpsModel.setLatitude(String.valueOf(location.getLatitude()));
            gpsModel.setLongitude(String.valueOf(location.getLongitude()));

            return gpsModel;
        }

        return null;
    }
}
