package com.thekmi.cross_platform_workspace.interfaces;

import com.google.j2objc.annotations.ObjectiveCName;
import com.thekmi.cross_platform_workspace.enums.PageId;

public interface AppNavigationInterface {
    @ObjectiveCName(value="goToPage:(PageIdEnum *)pageId")
    public void goToPage(PageId page);
}
