package Common.Config;

import Common.Utils.Log;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Queue;

public class Config {

    private static final String CONFIG = "Config.properties";
    private static final ThreadLocal<Properties> propTL = new ThreadLocal<>();
    private static Properties props = new Properties();

    public Properties getConfig() throws IOException {
        FileInputStream stream = new FileInputStream(CONFIG);
        if (props.isEmpty()){
            try {
                props.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
//            } finally {
//                if (stream != null){
//                    stream.close();
//                }
            }
        }
        return props;
    }

    public static String getProp(String propKey) {
        if (propTL.get() == null) {
            propTL.set(props);
        }
        return propTL.get().getProperty(propKey);
    }

    public static void getTimeOut(){
        Settings.SHORT_TIMEOUT_SECOND = Integer.parseInt(getProp("SHORT_TIMEOUT_SECOND"));
        Settings.LONG_TIMEOUT_SECOND = Integer.parseInt(getProp("LONG_TIMEOUT_SECOND"));
    }

}
