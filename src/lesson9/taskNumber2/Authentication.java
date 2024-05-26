package lesson9.taskNumber2;

public class Authentication {
    public static boolean loginPasswordCheck(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || login.contains(" "))
            throw new WrongLoginException("Login is not valid" + login);
        if (password.length() > 20 || password.contains(" ") || password.contains("1") || password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is not valid" + password);
        }
        return true;
    }
}
