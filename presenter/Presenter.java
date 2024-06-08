package presenter;
import java.util.Scanner;

import model.*;
import service.CalculateService;
import view.*;

public class Presenter {

    public void Launch(){
        Inputter inputter = new Inputter();
        Logger logger = new Logger();
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        while (true){
            float argument1;
            inputter.getInput(InputType.FLOAT, scanner);
            if (inputter.isCancel()) continue;
            if (inputter.isLog()) {
                printer.print(logger.getLog());
                continue;
            }
            argument1 = inputter.getFloat();

            OperationType operation;
            inputter.getInput(InputType.OPERATION, scanner);
            if (inputter.isCancel()) continue;
            if (inputter.isLog()) {
                printer.print(logger.getLog());
                continue;
            }
            operation = inputter.getOperation();

            float argument2;
            inputter.getInput(InputType.FLOAT, scanner);
            if (inputter.isCancel()) continue;
            if (inputter.isLog()) {
                printer.print(logger.getLog());
                continue;
            }
            argument2 = inputter.getFloat();

            float result = CalculateService.calculate(argument1, argument2, operation);
            printer.printOperation(argument1, argument2, result, operation);
            logger.logOperation(argument1, argument2, result, operation);
        }
    }
}
