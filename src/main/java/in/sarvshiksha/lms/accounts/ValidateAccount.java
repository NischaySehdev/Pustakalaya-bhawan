package in.sarvshiksha.lms.accounts;

import in.sarvshiksha.lms.exception.UserCredentialsIncorrect;

public interface ValidateAccount {
    public boolean validateUserAccount(UserAccount userAccount) throws UserCredentialsIncorrect;


}
