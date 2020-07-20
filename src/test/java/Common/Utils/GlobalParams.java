package Common.Utils;

public class GlobalParams {
    private static ThreadLocal<String> platformName = new ThreadLocal<>();
    private static ThreadLocal<String> udid = new ThreadLocal<>();
    private static ThreadLocal<String> deviceName = new ThreadLocal<>();
    private static ThreadLocal<String> systemPort = new ThreadLocal<>();
    private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<>();

    public void setPlatformName(String platformName1) {
        platformName.set(platformName1);
    }

    public String getPlatformName() {
        return platformName.get();
    }

    public void setUdid(String udid1) {
        if (!udid1.contains("java.lang")) {
            udid.set(udid1);
        }
    }

    public String getUdid() {
        return udid.get();
    }

    public void setDeviceName(String deviceName1) {
        deviceName.set(deviceName1);
    }

    public String getDeviceName() {
        return deviceName.get();
    }

    public void setSystemPort(String systemPort1) {
        if (!systemPort1.contains("java.lang")) {
            systemPort.set(systemPort1);
        }
    }

    public String getSystemPort() {
        return systemPort.get();
    }

    public void setChromeDriverPort(String chromeDriverPort1) {
        chromeDriverPort.set(chromeDriverPort1);
    }

    public String getChromeDriverPort() {
        return chromeDriverPort.get();
    }

    public void initializeGlobalParams() {
        GlobalParams globalParams = new GlobalParams();
        globalParams.setPlatformName(System.getProperty("plaformName", "Android"));
        globalParams.setUdid(System.getProperty("udid", String.valueOf(udid)));
        globalParams.setPlatformName(System.getProperty("deviceName", String.valueOf(deviceName)));
        globalParams.setSystemPort(System.getProperty("systemPort", String.valueOf(systemPort)));
        globalParams.setPlatformName(System.getProperty("chromeDriverPort", String.valueOf(chromeDriverPort)));
    }
}
