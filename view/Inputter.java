package view;

import java.util.Scanner;
import model.OperationType;

public class Inputter {

    private String input = "";
    private float inputFloat;
    private boolean isCancel = false;
    private boolean isLog = false;
    private OperationType operation;

    public void getInput(InputType inputType, Scanner scanner) {
        if (inputType == InputType.OPERATION) System.out.println("Input operator:");
        else if (inputType == InputType.FLOAT) System.out.println("Input number:");
        while (true) {
            if (scanner.hasNextLine()) input = scanner.nextLine();
            else continue;
            isCancel = false;
            isLog = false;
            if (input.length() == 0) {
                System.out.println("ERROR: input is too short");
                continue;
            }
            if (input.length() == 1){
                if (input.charAt(0) == 'c' || input.charAt(0) == 'C'){
                    isCancel = true;
                    break;
                }
                if (input.charAt(0) == 'l' || input.charAt(0) == 'L'){
                    isLog = true;
                    break;
                }
            }
            if (inputType == InputType.OPERATION){
                switch (input.charAt(0)) {
                    case '+':
                        operation = OperationType.PLUS;
                        break;
                    case '-':
                        operation = OperationType.MIN;
                        break;
                    case '*':
                        operation = OperationType.MULT;
                        break;
                    case '/':
                        operation = OperationType.DIV;
                        break;
                    default:
                        System.out.print("ERROR: not an operator!");
                        continue;
                }
                break;
            }
            else if (inputType == InputType.FLOAT){
                try {
                    inputFloat = Float.valueOf(input);
                } catch (Exception e) {
                    System.out.println("ERROR: not a number!");
                    continue;
                }
                break;
            }
            break;
        }
    }

    public boolean isCancel() {
        return isCancel;
    }

    public boolean isLog() {
        return isLog;
    }

    public float getFloat() {
        return inputFloat;
    }

    public OperationType getOperation(){
        return operation;
    }
}
