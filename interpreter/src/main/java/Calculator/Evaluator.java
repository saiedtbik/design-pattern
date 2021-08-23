package Calculator;

import java.util.Map;
import java.util.Stack;

public class Evaluator {
    Stack<Expression> treeStack;
    public Evaluator(String sentence) {
        treeStack = new Stack<>();
        for (String token : sentence.split(" ")) {
            switch (token) {
                case "+": {
                    Expression rightExpression = treeStack.pop();
                    Expression leftExpression = treeStack.pop();
                    treeStack.push(new PlusEx(leftExpression, rightExpression));
                    break;
                }
                case "-": {
                    Expression rightExpression = treeStack.pop();
                    Expression leftExpression = treeStack.pop();
                    treeStack.push(new MinusEx(leftExpression, rightExpression));
                    break;
                }
                default: {
                    treeStack.push(new VariableEx(token));
                }
            }
        }
    }

    public int interpret(Map<String, Integer> variableValues) {
        Expression expression = treeStack.pop();
        return expression.evaluate(variableValues);
    }

}
