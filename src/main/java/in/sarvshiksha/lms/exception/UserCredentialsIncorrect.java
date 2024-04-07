package in.sarvshiksha.lms.exception;

public class UserCredentialsIncorrect extends Exception {

    public UserCredentialsIncorrect(ERROR_TYPE errorType) {
        super(errorType.name());
    }

    public enum ERROR_TYPE {
        PASSWORD_INCORRECT,
        USER_ID_INCORRECT
    }
}
