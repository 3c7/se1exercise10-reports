package DTOs;

/**
 * Created by Nils on 04.01.2016.
 */
public class UserInputDTO {
    private String cmd;
    private String[] args;

    public UserInputDTO(String input) {
        String temp;
        if (input.contains(" ")) {
            cmd = input.substring(0, input.indexOf(" "));
            temp = input.substring(input.indexOf(" ") + 1, input.length());
            while (temp.contains("\"")) {
                temp = temp.replace("\"", "");
            }
            args = temp.split(" ");
        } else {
            cmd = input;
        }
    }

    public String getCmd() {
        return cmd;
    }

    public String[] getArgs() {
        return args;
    }
}
