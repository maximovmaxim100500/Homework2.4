public class Main {
    public static void main(String[] args) {
        String login = "login";
        String password = "PassworD1234";
        String confirmPassword = "PassworD1234";
        try {
            CheckingParameters.checkingParameters(login, password, confirmPassword);
        } catch (NullPointerException e) {
            throw new RuntimeException("Все поля должны быть заполнены.");
        }
    }
}