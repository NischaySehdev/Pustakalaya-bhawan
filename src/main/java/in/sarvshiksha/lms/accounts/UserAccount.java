package in.sarvshiksha.lms.accounts;

public class UserAccount implements Account {


    private final String username;
    private final String password;
    private final ACCOUNT_TYPE accountType;

    public UserAccount(AccountBuilder accountBuilder) {
        this.username = accountBuilder.username;
        this.password = accountBuilder.password;
        this.accountType = accountBuilder.accountType;
    }

    public String getUsername() {
        return username;
    }


    @Override
    public String getPassword() {
        return password;
    }

    public ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "in.sarvshiksha.lms.accounts.UserAccount{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public static class AccountBuilder {
        public ACCOUNT_TYPE accountType = ACCOUNT_TYPE.CLIENT;
        private String username;
        private String password;

        public AccountBuilder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public AccountBuilder setAccountType(ACCOUNT_TYPE accountType) {
            this.accountType = accountType;
            return this;
        }

        public UserAccount build() {
            return new UserAccount(this);
        }
    }

}
