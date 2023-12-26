import java.util.InputMismatchException;

public class CheckingParameters {
    public static void checkingParameters(String login, String password, String confirmPassword) {
        try {
            checkingSymbols(login);
        } catch (CharacterCountException | CharacterException e) {
            throw new RuntimeException("WrongLoginException");
        }
        try {
            checkingSymbols(password);
        } catch (CharacterCountException | CharacterException e) {
            throw new RuntimeException("WrongPasswordException");
        }
        try {
            checkingPassword(password, confirmPassword);
        } catch (InputMismatchException e) {
            throw new RuntimeException("WrongPasswordException");
        }
    }

    public static void checkingSymbols(String string) throws CharacterCountException, CharacterException {
        String symbols = "AaBbCdEeFfGgHhIiGgKkLlMmNnOoPpQqRrSsDdUuVvWwXxYyZz_0123456789";
        if (string.length() > 20) {
            throw new CharacterCountException();
        }
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < symbols.length(); j++) {
                if (string.charAt(i) == symbols.charAt(j)) {
                    System.out.print(string.charAt(i));
                    System.out.print(symbols.charAt(j));
                    System.out.println("V");
                    break;
                }
                if (string.charAt(i) != symbols.charAt(j) && i == string.length() - 1 && j == symbols.length() - 1) {
                    throw new CharacterException();
                }
            }
        }
    }

    public static void checkingPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
        } else
            throw new InputMismatchException();
    }
}



