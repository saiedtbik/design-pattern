import java.util.HashMap;

public class Mian {

    public static void main(String[] args) {
        HashMap<String, String> buttonProperties = new HashMap<>();
        buttonProperties.put("id", "id12");
        buttonProperties.put("name", "button1");
        Button button = new Button(buttonProperties);

        ButtonRender buttonRender = new ButtonRender(button);
        System.out.println(buttonRender.draw());


        HashMap<String,String> cssProperties = new HashMap<>();
        cssProperties.put("color","red");
        cssProperties.put("size","12");
        ElementCssRender elementCssRender = new ElementCssRender(cssProperties,new ButtonRender(button));
        System.out.println(elementCssRender.draw());

    }
}
