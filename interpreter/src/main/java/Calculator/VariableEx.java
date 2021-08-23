package Calculator;

import java.util.Map;

public class VariableEx extends  Expression {
    private String name;
    public VariableEx(String name) {
        this.name = name ;
    }

    @Override
    public int evaluate(Map<String,Integer> variableValuesMap) {
       return variableValuesMap.get(name);
    }
}
