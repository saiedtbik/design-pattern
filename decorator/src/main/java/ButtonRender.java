import java.util.Map;

public class ButtonRender extends Render {

    public ButtonRender(Element element) {
        super(element);
    }

    @Override
    public String draw() {
       return createButtonStr(super.getElement().getPropertiesMap());
    }
    String createButtonStr(Map<String,String> properties){
        StringBuilder result = new StringBuilder();
        result.append("<Button ")
               .append("id = ")
               .append(properties.get("id"))
               .append("name = ")
               .append(properties.get("name"));
        return result.toString();
    }
}
