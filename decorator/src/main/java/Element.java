import java.util.List;
import java.util.Map;

public abstract class Element {
    private Map<String,String> propertiesMap;

    public Map<String, String> getPropertiesMap() {
        return propertiesMap;
    }

    public void setPropertiesMap(Map<String, String> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }

    public Element(Map<String, String> propertiesMap) {
        this.propertiesMap = propertiesMap;
    }
}
