package model.calculateOperations;

public class OperationMult implements ICalculateOperation{
    @Override
    public float calculate(float argument1, float argument2) {
        return argument1 * argument2;
    }
}
