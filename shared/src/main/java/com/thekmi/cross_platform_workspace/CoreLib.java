package com.thekmi.cross_platform_workspace;

import com.google.gson.Gson;
import com.google.j2objc.annotations.ObjectiveCName;
import com.thekmi.cross_platform_workspace.enums.EnvironmentType;
import com.thekmi.cross_platform_workspace.managers.InterfaceManager;
import com.thekmi.cross_platform_workspace.managers.NetworkManager;

public class CoreLib {
    private InterfaceManager interfaceManager;
    private NetworkManager networkManager;
    private Gson gson;

    private static CoreLib instance;

    private CoreLib()
    {
        networkManager = new NetworkManager();
        interfaceManager = new InterfaceManager();
        gson = new Gson();
    }

    public static CoreLib getInstance()
    {
        if(instance == null)
        {
            instance = new CoreLib();
        }
        return instance;
    }

    @ObjectiveCName(value = "initLib:(EnvironmentTypeEnum *)env")
    public void initLib(EnvironmentType env)
    {
        networkManager.setEnvironmentType(env);
    }

    public NetworkManager getNetworkManager()
    {
        return networkManager;
    }

    public InterfaceManager getInterfaceManager()
    {
        return interfaceManager;
    }

    public Gson getGson(){ return gson; }
}
