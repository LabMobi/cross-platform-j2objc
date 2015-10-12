package com.thekmi.cross_platform_workspace.interfaces;


import com.thekmi.cross_platform_workspace.models.GpsModel;
import com.thekmi.cross_platform_workspace.models.ShareModel;

public interface ShareInterface {
    public void nativeShare(ShareModel shareModel);
    public void openMapWithLocation(GpsModel gpsModel);
    public void callPhoneNumber(String phone);
    public void openWebSite(String link);
}
