package Calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> variableValues = new HashMap<>();
        String sentence = "w x z + -";
        variableValues.put("w", 12);
        variableValues.put("x", 2);
        variableValues.put("z", 5);
        Evaluator evaluator = new Evaluator(sentence);
        int result = evaluator.interpret(variableValues);
        System.out.println(result);
    }
}
