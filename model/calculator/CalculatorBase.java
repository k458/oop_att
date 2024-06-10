package model.calculator;

import model.OperationType;

public abstract class CalculatorBase {
    public abstract float calculate(float argument1, float argument2, OperationType operationType);
}
