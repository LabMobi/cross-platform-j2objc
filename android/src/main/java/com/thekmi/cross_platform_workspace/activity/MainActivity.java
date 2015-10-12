package com.thekmi.cross_platform_workspace.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.thekmi.cross_platform_workspace.CoreLib;
import com.thekmi.cross_platform_workspace.R;
import com.thekmi.cross_platform_workspace.enums.EnvironmentType;
import com.thekmi.cross_platform_workspace.enums.InterfaceId;
import com.thekmi.cross_platform_workspace.implementations.GpsImplementation;
import com.thekmi.cross_platform_workspace.implementations.NavigationImplementation;
import com.thekmi.cross_platform_workspace.implementations.NetworkImplementation;
import com.thekmi.cross_platform_workspace.implementations.ShareImplementation;
import com.thekmi.cross_platform_workspace.implementations.StorageImplementation;
import com.thekmi.cross_platform_workspace.managers.InterfaceManager;
import com.thekmi.cross_platform_workspace.managers.NetworkManager;

public class MainActivity extends FragmentActivity {

    private CoreLib coreLib;
    private NetworkManager networkManager;
    private InterfaceManager interfaceManager;

    private NetworkImplementation networkImplementation;
    private NavigationImplementation navigationImplementation;
    private StorageImplementation storageImplementation;
    private GpsImplementation gpsImplementation;
    private ShareImplementation shareImplementation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init () {
        //Initialize the app:
        if (coreLib == null)
        {
            //Get a reference to Raizen Lib:
            coreLib = CoreLib.getInstance();
        }

        if (networkManager == null)
        {
            //Get a reference to the Network Manager:
            networkManager = coreLib.getNetworkManager();
        }

        if (interfaceManager == null)
        {
            //Get a reference to the Interface Manager:
            interfaceManager = coreLib.getInterfaceManager();
        }

        if (networkImplementation == null)
        {
            //Create a new NetworkImplementation:
            networkImplementation = new NetworkImplementation (getApplicationContext());

            networkImplementation.setNetworkManager(networkManager);
            interfaceManager.registerInterface(InterfaceId.NETWORK, networkImplementation);
        }

        if(navigationImplementation == null){
            navigationImplementation = new NavigationImplementation (this);
            interfaceManager.registerInterface(InterfaceId.NAVIGATION, navigationImplementation);
        }

        if(storageImplementation == null){
            storageImplementation = new StorageImplementation (this);
            interfaceManager.registerInterface(InterfaceId.STORAGE, storageImplementation);
        }

        if(gpsImplementation == null)
        {
            gpsImplementation = new GpsImplementation();
            interfaceManager.registerInterface(InterfaceId.GPS, gpsImplementation);
        }

        if(shareImplementation == null)
        {
            shareImplementation = new ShareImplementation(this);
            interfaceManager.registerInterface(InterfaceId.SHARE, shareImplementation);
        }

        coreLib.initLib(EnvironmentType.DEV);
    }
}
