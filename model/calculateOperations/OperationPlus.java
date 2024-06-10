package model.calculateOperations;

public class OperationPlus implements ICalculateOperation {
    @Override
    public float calculate(float argument1, float argument2) {
        return argument1 + argument2;
    }
}
