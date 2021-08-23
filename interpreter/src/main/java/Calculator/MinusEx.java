package Calculator;

import java.util.Map;

public class MinusEx extends Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public MinusEx(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int evaluate(Map<String,Integer> variableValuesMap) {
        return leftOperand.evaluate(variableValuesMap) - rightOperand.evaluate(variableValuesMap);
    }
}
