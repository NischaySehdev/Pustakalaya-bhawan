package in.sarvshiksha.lms.accounts;

import in.sarvshiksha.lms.exception.UserCredentialsIncorrect;
import in.sarvshiksha.lms.model.AccountDetails;
import org.hibernate.Session;

import javax.servlet.ServletContext;

public class ValidateAccountUserAccount implements ValidateAccount {

    private Session session;

    public ValidateAccountUserAccount(ServletContext servletContext) {
        session = (Session) servletContext.getAttribute("session");
    }

    @Override
    public boolean validateUserAccount(UserAccount userAccount) throws UserCredentialsIncorrect {
        session.beginTransaction();
        AccountDetails accountDetails = (AccountDetails) session.get(AccountDetails.class, userAccount.getUsername());
        if (accountDetails == null) {
            throw new UserCredentialsIncorrect(UserCredentialsIncorrect.ERROR_TYPE.USER_ID_INCORRECT);
        } else if (!accountDetails.getPassword().equals(userAccount.getPassword())) {
            throw new UserCredentialsIncorrect(UserCredentialsIncorrect.ERROR_TYPE.PASSWORD_INCORRECT);
        }
        return true;
    }


}
