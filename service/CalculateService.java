package service;

import model.OperationType;

public class CalculateService {
    public static float calculate(float argument1, float argument2, OperationType operation) {
        switch (operation) {
            case PLUS:
                return argument1 + argument2;
            case MINUS:
                return argument1 - argument2;
            case MULT:
                return argument1 * argument2;
            case DIV:
                return argument1 / argument2;
        }
        return 0f;
    }
}
