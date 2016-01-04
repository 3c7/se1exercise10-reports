package Views;

import DTOs.UserInputDTO;
import Models.Report;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Nils on 03.12.2015.
 */
public class ConsoleView {
    private final BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

    public void outLine(String s) {
        System.out.println(s);
    }

    public void out(String s) {
        System.out.print(s);
    }

    public UserInputDTO readLine() throws IOException {
        // Cursor
        this.out("> ");

        // Read
        return new UserInputDTO(bReader.readLine());
    }


}
