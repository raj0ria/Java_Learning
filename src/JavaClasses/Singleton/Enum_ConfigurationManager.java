package JavaClasses.Singleton;

import java.util.HashMap;
import java.util.Map;

public enum Enum_ConfigurationManager {
    INSTANCE;

    private Map<String, String> settings;

    Enum_ConfigurationManager() {
        settings = new HashMap<>();
        settings.put("url", "www.example.com");
        settings.put("timeout", "5000");
        settings.put("maxConnections", "100");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

}

class Main6{
    public static void main(String[] args) {

        Enum_ConfigurationManager enumConfigurationManager = Enum_ConfigurationManager.INSTANCE;

        String url = enumConfigurationManager.getSetting("url");
        String timeout = enumConfigurationManager.getSetting("timeout");

        System.out.println(url +" "+ timeout);
    }
}
