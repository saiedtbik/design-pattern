import java.util.Map;

public class ElementCssRender extends Render {
    private Map<String, String> cssPropertiesMap;
    private Render render;

    public ElementCssRender(Map<String, String> cssPropertiesMap, Render render) {
        this.cssPropertiesMap = cssPropertiesMap;
        this.render = render;
    }

    @Override
    public String draw() {
        String result = addCssAttribute(render, cssPropertiesMap);
        return result;
    }

    private String addCssAttribute(Render elementRender, Map<String, String> cssPropertiesMap) {
        StringBuilder result = new StringBuilder(render.draw());
        for (String cssKey : cssPropertiesMap.keySet()) {
            result.append(";")
                    .append(cssKey)
                    .append(" : ")
                    .append(cssPropertiesMap.get(cssKey));
        }
        return result.toString();
    }
}
