package in.sarvshiksha.lms.model;

import in.sarvshiksha.lms.accounts.Account;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "account_details")
public class AccountDetails {
    @Column(name = "S.NO")
    private int serialNumber;

    @Id
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    @Column(name = "ACCOUNT_PASSWORD")
    private String password;
    @Column(name = "ACCOUNT_CREATED")
    private Date accountcreationTime;
    
    @Column(name = "ACCOUNT_TYPE")
    private Account.ACCOUNT_TYPE accountType;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getAccountcreationTime() {
        return accountcreationTime;
    }

    public void setAccountcreationTime(Date accountcreationTime) {
        this.accountcreationTime = accountcreationTime;
    }

    public Account.ACCOUNT_TYPE getAccountType() {
        return accountType;
    }

    public void setAccountType(Account.ACCOUNT_TYPE accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "serialNumber=" + serialNumber +
                ", accountId='" + accountId + '\'' +
                ", password='" + password + '\'' +
                ", accountcreationTime=" + accountcreationTime +
                '}';
    }
}
