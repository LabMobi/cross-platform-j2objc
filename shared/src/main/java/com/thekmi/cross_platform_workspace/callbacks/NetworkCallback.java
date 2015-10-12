package com.thekmi.cross_platform_workspace.callbacks;

public interface NetworkCallback {
    public void onGotData(String data);
    public void onGotError(int code, String errorMsg);
}
