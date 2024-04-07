package in.sarvshiksha.lms.accounts;

public interface Account {
    public String getUsername();

    public String getPassword();

    public ACCOUNT_TYPE getAccountType();

    public enum ACCOUNT_TYPE {CLIENT, ADMIN}

}
