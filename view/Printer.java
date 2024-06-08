package view;

import model.OperationType;
import service.OperationService;

public class Printer {

    private StringBuilder sb;

    public Printer() {
        sb = new StringBuilder();
    }

    public void printOperation(float argument1, float argument2, float result, OperationType operation) {
        sb.append(argument1);
        sb.append(OperationService.opertationToString(operation));
        sb.append(argument2);
        sb.append('=');
        sb.append(result);
        System.out.println(sb.toString());
        sb.setLength(0);
    }
    public void print(String s){
        System.out.println(s);
    }
}
