package service;

import model.OperationType;

public class OperationService {
    public static String opertationToString(OperationType operation) {
        switch (operation) {
            case PLUS:
                return "+";
            case MIN:
                return "-";
            case MULT:
                return "*";
            case DIV:
                return "/";
        }
        return null;
    }
}
