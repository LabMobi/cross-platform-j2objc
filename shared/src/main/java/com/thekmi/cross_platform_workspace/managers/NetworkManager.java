package com.thekmi.cross_platform_workspace.managers;

import com.google.gson.Gson;
import com.google.j2objc.annotations.ObjectiveCName;
import com.thekmi.cross_platform_workspace.CoreLib;
import com.thekmi.cross_platform_workspace.callbacks.NetworkCallback;
import com.thekmi.cross_platform_workspace.enums.EnvironmentType;
import com.thekmi.cross_platform_workspace.enums.InterfaceId;
import com.thekmi.cross_platform_workspace.enums.RestType;
import com.thekmi.cross_platform_workspace.interfaces.NetworkInterface;

import java.util.Hashtable;

public class NetworkManager {
    private NetworkInterface networkInterface;
    private Gson gson;

    private EnvironmentType environmentType;
    private Hashtable<String, Object> requests;

    public NetworkManager() {
        requests = new Hashtable<>();
    }

    public void setEnvironmentType(EnvironmentType env) {
        environmentType = env;
        networkInterface = (NetworkInterface) CoreLib.getInstance().getInterfaceManager().getInterface(InterfaceId.NETWORK);
        gson = CoreLib.getInstance().getGson();
    }

    public void makeRequest(String url, Hashtable<String, String> headers, Hashtable<String, Object> params, NetworkCallback callback, RestType type)
    {
        String requestID = java.util.UUID.randomUUID().toString();
        while (requests.contains(requestID))
        {
            requestID = java.util.UUID.randomUUID().toString();
        }
        if(callback != null) {
            requests.put(requestID, callback);
        }

        switch(type)
        {
            case GET:
                networkInterface.makeGetRequest(url, headers, params, requestID);
                break;
            case POST:
                networkInterface.makePostRequest(url, headers, params, requestID);
                break;
            case DELETE:
                networkInterface.makeDeleteRequest(url, headers, params, requestID);
                break;
            case PUT:
                networkInterface.makePutRequest(url, headers, params, requestID);
                break;
        }
    }

    @ObjectiveCName(value = "onSuccess:(NSString *)payload forRequest:(NSString *)requestID")
    public void onSuccess(String payload, String requestID)
    {
        NetworkCallback callback = (NetworkCallback) requests.get(requestID);
        if(callback != null)
        {
            try {
                callback.onGotData(payload);
            }
            catch (Exception e)
            {
                callback.onGotError(-1, e.getMessage());
            }
        }
        requests.remove(requestID);
    }

    @ObjectiveCName(value = "onError:(jint)errorCode withMessage:(NSString *)message forRequest:(NSString *)requestID")
    public void onError(int errorCode, String message, String requestID)
    {
        NetworkCallback callback = (NetworkCallback) requests.get(requestID);
        if(callback != null)
        {
            callback.onGotError(errorCode, message);
        }
        requests.remove(requestID);
    }
}
