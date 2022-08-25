import { WebPlugin } from '@capacitor/core';

import type { DeviceInfo, RootJailBreakDetectorPlugin } from './definitions';

export class RootJailBreakDetectorWeb extends WebPlugin implements RootJailBreakDetectorPlugin {
  isRunningOnEmulator(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }
  async isRooted(): Promise<{ isRooted: boolean }> {
    throw new Error('Method not implemented.');
  }

  async isRootedWithBusyBox(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isRootedWithEmulator(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isRootedWithBusyBoxWithEmulator(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isDetectRootManagementAppsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isDetectPotentiallyDangerousAppsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isTestKeysRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckForBusyBoxBinaryRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckForSuBinaryRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckSuExistsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckForRWPathsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckForDangerousPropsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckForRootNativeRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isDetectRootCloakingAppsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isSelinuxFlagInEnabled(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isExistBuildTagsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async doesSuperuserApkExistRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isExistSUPathRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckDirPermissionsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckExecutingCommandsRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckInstalledPackagesRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isCheckforOverTheAirCertificatesRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async isRunningOnEmulatorRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async simpleCheckEmulatorRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async simpleCheckSDKBF86Rooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async simpleCheckQRREFPHRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async simpleCheckBuildRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async checkGenymotionRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async checkGenericRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }
  
  async checkGoogleSDKRooted(): Promise<{ isRooted: boolean; }> {
    throw new Error('Method not implemented.');
  }

  async getDeviceInfo(): Promise<DeviceInfo> {
    throw new Error('Method not implemented.');
  }
}
