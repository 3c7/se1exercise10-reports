package Controller;

import Commands.Command;
import DTOs.UserInputDTO;
import Exceptions.UserExitException;
import Observer.CountView;
import Observer.ListView;
import Views.ConsoleView;


import java.io.IOException;

/**
 * Created by Nils on 03.01.2016.
 */
public class Client {
    public static void main(String[] args) {
        final ConsoleView consoleView = new ConsoleView();
        final CommandController commandController = new CommandController();
        final ReportController reportController = ReportController.getInstance();
        UserInputDTO userInputDTO;
        Command command;

        // Register Observer
        reportController.addObserver(new ListView());
        reportController.addObserver(new CountView());


        try {
            while (true) {
                userInputDTO = consoleView.readLine();
                if ((command = commandController.getCommand(userInputDTO.getCmd().toLowerCase())) == null) {
                    consoleView.outLine("Kommando nicht verfügbar");
                }
                else {
                    command.execute(userInputDTO.getArgs());
                }
            }
        } catch (UserExitException uee) {
            System.exit(0);
        } catch (IOException ioe) {
            System.out.println("Konnte nicht aus der Konsole lesen.");
        }
    }
}
