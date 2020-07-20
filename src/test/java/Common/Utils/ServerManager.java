package Common.Utils;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;

public class ServerManager {
    private static ThreadLocal<AppiumDriverLocalService> server = new ThreadLocal<>();

    public AppiumDriverLocalService getServer(){ return server.get();}

    public void startServer(){
        AppiumDriverLocalService server = windowsGetAppiumService();
        server.start();
        try{
            if (server == null || server.isRunning()){
                server.start();
            }
        } catch (Exception e) {
            throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started!!!");
        }
        this.server.set(server);
    }

    public AppiumDriverLocalService windowsGetAppiumService(){
        GlobalParams params = new GlobalParams();
        return AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE));
    }

}
