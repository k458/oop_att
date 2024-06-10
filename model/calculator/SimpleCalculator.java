package model.calculator;

import model.OperationType;
import model.calculateOperations.ICalculateOperation;
import model.calculateOperations.OperationDiv;
import model.calculateOperations.OperationMinus;
import model.calculateOperations.OperationMult;
import model.calculateOperations.OperationPlus;

public class SimpleCalculator extends CalculatorBase {

    private ICalculateOperation calcPlus;
    private ICalculateOperation calcMinus;
    private ICalculateOperation calcMult;
    private ICalculateOperation calcDiv;

    public SimpleCalculator() {
        calcPlus = new OperationPlus();
        calcMinus = new OperationMinus();
        calcMult = new OperationMult();
        calcDiv = new OperationDiv();
    }

    @Override
    public float calculate(float argument1, float argument2, OperationType operationType) {
        switch (operationType) {
            case PLUS:
                return calcPlus.calculate(argument1, argument2);
            case MINUS:
                return calcMinus.calculate(argument1, argument2);
            case MULT:
                return calcMult.calculate(argument1, argument2);
            case DIV:
                return calcDiv.calculate(argument1, argument2);
            default:
                return 0f;
        }
    }

}
