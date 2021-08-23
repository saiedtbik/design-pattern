package Calculator;

import java.util.Map;

public class PlusEx extends Expression{
    Expression leftOperand;
    Expression rightOperand;

    public PlusEx(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int evaluate(Map<String,Integer> variableValuesMap) {
        return leftOperand.evaluate(variableValuesMap) + rightOperand.evaluate(variableValuesMap);
    }
}
