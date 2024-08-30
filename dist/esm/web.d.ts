import { WebPlugin } from '@capacitor/core';
import type { DeviceInfo, RootJailBreakDetectorPlugin } from './definitions';
export declare class RootJailBreakDetectorWeb extends WebPlugin implements RootJailBreakDetectorPlugin {
    isRunningOnEmulator(): Promise<{
        isRooted: boolean;
    }>;
    isRooted(): Promise<{
        isRooted: boolean;
    }>;
    isRootedWithBusyBox(): Promise<{
        isRooted: boolean;
    }>;
    isRootedWithEmulator(): Promise<{
        isRooted: boolean;
    }>;
    isRootedWithBusyBoxWithEmulator(): Promise<{
        isRooted: boolean;
    }>;
    isDetectRootManagementAppsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isDetectPotentiallyDangerousAppsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isTestKeysRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckForBusyBoxBinaryRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckForSuBinaryRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckSuExistsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckForRWPathsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckForDangerousPropsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckForRootNativeRooted(): Promise<{
        isRooted: boolean;
    }>;
    isDetectRootCloakingAppsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isSelinuxFlagInEnabled(): Promise<{
        isRooted: boolean;
    }>;
    isExistBuildTagsRooted(): Promise<{
        isRooted: boolean;
    }>;
    doesSuperuserApkExistRooted(): Promise<{
        isRooted: boolean;
    }>;
    isExistSUPathRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckDirPermissionsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckExecutingCommandsRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckInstalledPackagesRooted(): Promise<{
        isRooted: boolean;
    }>;
    isCheckforOverTheAirCertificatesRooted(): Promise<{
        isRooted: boolean;
    }>;
    isRunningOnEmulatorRooted(): Promise<{
        isRooted: boolean;
    }>;
    simpleCheckEmulatorRooted(): Promise<{
        isRooted: boolean;
    }>;
    simpleCheckSDKBF86Rooted(): Promise<{
        isRooted: boolean;
    }>;
    simpleCheckQRREFPHRooted(): Promise<{
        isRooted: boolean;
    }>;
    simpleCheckBuildRooted(): Promise<{
        isRooted: boolean;
    }>;
    checkGenymotionRooted(): Promise<{
        isRooted: boolean;
    }>;
    checkGenericRooted(): Promise<{
        isRooted: boolean;
    }>;
    checkGoogleSDKRooted(): Promise<{
        isRooted: boolean;
    }>;
    getDeviceInfo(): Promise<DeviceInfo>;
}
