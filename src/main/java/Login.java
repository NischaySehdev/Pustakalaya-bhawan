import in.sarvshiksha.lms.accounts.Account;
import in.sarvshiksha.lms.accounts.UserAccount;
import in.sarvshiksha.lms.accounts.ValidateAccount;
import in.sarvshiksha.lms.accounts.ValidateAccountUserAccount;
import in.sarvshiksha.lms.admin.Admin;
import in.sarvshiksha.lms.client.Client;
import in.sarvshiksha.lms.exception.UserCredentialsIncorrect;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {

    private final int test = 1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserAccount userAccount = new UserAccount.AccountBuilder(username, password).build();
        ServletContext servletContext = getServletContext();
        ValidateAccount validateAccount = new ValidateAccountUserAccount(servletContext);
        try {
            if (validateAccount.validateUserAccount(userAccount)) {
                req.setAttribute("username", username);
                if (userAccount.getAccountType().equals(Account.ACCOUNT_TYPE.ADMIN)) {
                    Admin admin = new Admin(servletContext);
                    admin.prepareAdminPage();
                    req.getRequestDispatcher("/WEB-INF/admin-panel.jsp").include(req, resp);
                } else {
                    Client client = new Client(servletContext);
                    client.prepareClientPage();
                    req.getRequestDispatcher("/WEB-INF/welcome-user.jsp").include(req, resp);
                }
            }
        } catch (UserCredentialsIncorrect message) {
            req.getRequestDispatcher("WEB-INF/credential-incorrect.jsp").include(req, resp);
        }
    }

    private int getTest() {
        return test;
    }

}
