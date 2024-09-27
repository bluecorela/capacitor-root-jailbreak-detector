//
//  UIDevice+JailBroken.swift
//  IsJailBroken
//
//  Created by Vineet Choudhary on 07/02/20.
//  Copyright © 2020 Developer Insider. All rights reserved.
//

import Foundation
import UIKit

extension UIDevice {
    var isSimulator: Bool {
        return TARGET_OS_SIMULATOR != 0
    }
    
    var isJailBroken: Bool {
        get {
            if UIDevice.current.isSimulator { return false }

            if JailBrokenHelper.hasCydiaInstalled() { return true }
            
            // Verificar si hay aplicaciones sospechosas instaladas
            if JailBrokenHelper.isContainsSuspiciousApps() { return true }
            
            // Verificar si existen rutas sospechosas del sistema
            if JailBrokenHelper.isSuspiciousSystemPathsExists() { return true }
            
            // Comprobación adicional para rootless: ver si podemos acceder a comandos de sistema o rutas restringidas
            if JailBrokenHelper.isRootlessDetected() { return true }

            return JailBrokenHelper.canEditSystemFiles()
        }
    }
}

private struct JailBrokenHelper {
    static func isRootlessDetected() -> Bool {
        // Verificar acceso a rutas específicas de rootless
        let rootlessPaths = ["/var/jb", "/private/jb"]
        for path in rootlessPaths {
            if FileManager.default.fileExists(atPath: path) {
                return true
            }
        }
        return false
    }
    static func hasCydiaInstalled() -> Bool {
        return UIApplication.shared.canOpenURL(URL(string: "cydia://")!)
    }
    
    static func isContainsSuspiciousApps() -> Bool {
        for path in suspiciousAppsPathToCheck {
            if FileManager.default.fileExists(atPath: path) {
                return true
            }
        }
        return false
    }
    
    static func isSuspiciousSystemPathsExists() -> Bool {
        for path in suspiciousSystemPathsToCheck {
            if FileManager.default.fileExists(atPath: path) {
                return true
            }
        }
        return false
    }
    
    static func canEditSystemFiles() -> Bool {
        let jailBreakText = "Developer Insider"
        do {
            try jailBreakText.write(toFile: jailBreakText, atomically: true, encoding: .utf8)
            return true
        } catch {
            return false
        }
    }
    
    /**
     Add more paths here to check for jail break
     */
    static var suspiciousAppsPathToCheck: [String] {
        return ["/Applications/Cydia.app",
                "/Applications/blackra1n.app",
                "/Applications/FakeCarrier.app",
                "/Applications/Icy.app",
                "/Applications/IntelliScreen.app",
                "/Applications/MxTube.app",
                "/Applications/RockApp.app",
                "/Applications/SBSettings.app",
                "/Applications/WinterBoard.app",
                "/Applications/palera1n.app",
                "/Applications/Sileo.app",
                "/Applications/Zebra.app"
        ]
    }
    
    static var suspiciousSystemPathsToCheck: [String] {
        return ["/Library/MobileSubstrate/DynamicLibraries/LiveClock.plist",
                "/Library/MobileSubstrate/DynamicLibraries/Veency.plist",
                "/private/var/lib/apt",
                "/private/var/lib/apt/",
                "/private/var/lib/cydia",
                "/private/var/lib/palera1n",
                "/private/var/mobile/Library/SBSettings/Themes",
                "/private/var/stash",
                "/private/var/tmp/cydia.log",
                "/System/Library/LaunchDaemons/com.ikey.bbot.plist",
                "/System/Library/LaunchDaemons/com.saurik.Cydia.Startup.plist",
                "/usr/bin/sshd",
                "/usr/libexec/sftp-server",
                "/usr/sbin/sshd",
                "/etc/apt",
                "/bin/bash",
                "/Library/MobileSubstrate/MobileSubstrate.dylib"
        ]
    }
}
