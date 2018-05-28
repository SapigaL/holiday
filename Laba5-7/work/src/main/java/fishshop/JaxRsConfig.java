package fishshop;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.Map;

        @ApplicationPath("resources")
public class JaxRsConfig extends Application {
    @Override
    public Map<String, Object> getProperties() {
                Map<String, Object> properties = new HashMap<>();
                properties.put("jersey.config.server.provider.packages", "fishshop");
                return properties;
            }
}