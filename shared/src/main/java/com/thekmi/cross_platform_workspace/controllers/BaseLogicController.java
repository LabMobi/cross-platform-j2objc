package com.thekmi.cross_platform_workspace.controllers;

import com.thekmi.cross_platform_workspace.CoreLib;
import com.thekmi.cross_platform_workspace.callbacks.NetworkCallback;
import com.thekmi.cross_platform_workspace.enums.RestType;

import java.util.Hashtable;

public class BaseLogicController {

    public BaseLogicController()
    {
    }

    public void makeApiCall()
    {
        String url = "https://raizen.herokuapp.com/api/config";
        Hashtable<String, Object> params = new Hashtable<>();
        CoreLib.getInstance().getNetworkManager().makeRequest(url, null, params, new NetworkCallback() {
            @Override
            public void onGotData(String data) {

            }

            @Override
            public void onGotError(int code, String errorMsg) {

            }
        }, RestType.GET);
    }
}
