package view;

import model.OperationType;
import service.OperationService;

public class Logger {

    private StringBuilder sb;

    public Logger() {
        sb = new StringBuilder();
        sb.append('\n');
        sb.append("LOG");
        sb.append('\n');
    }

    public void logOperation(float argument1, float argument2, float result, OperationType operation) {
        sb.append(argument1);
        sb.append(OperationService.opertationToString(operation));
        sb.append(argument2);
        sb.append('=');
        sb.append(result);
        sb.append('\n');
    }

    public String getLog() {
        return sb.toString();
    }
}