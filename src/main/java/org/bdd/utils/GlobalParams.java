package org.bdd.utils;

public class GlobalParams {
    private static ThreadLocal<String> osversion = new ThreadLocal<String>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private static final ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> playerName = new ThreadLocal<>();
    private static ThreadLocal<String> newPassword = new ThreadLocal<>();
    
    public static String getPlayerName() {
        return playerName.get();
    }

    public static void setPlayerName(String name) {
        playerName.set(name);
    }

	public static String getPlatformName() {
        return platformName.get();
    }

    public static void setPlatformName(String device2) {
        platformName.set(device2);
    }

    public static String getDeviceName() {
        return deviceName.get();
    }

    public static void setDeviceName(String deviceName2) {
        deviceName.set(deviceName2);
    }

    public static String getOsversion() {
        return osversion.get();
    }

    public static void setOsversion(String osversion1) {
        osversion.set(osversion1);
    }
    
    public static String getNewPassword() {
		return newPassword.get();
	}

	public static void setNewPassword(String password) {
		newPassword.set(password);
	}
}



