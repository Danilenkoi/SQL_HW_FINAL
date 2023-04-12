import javax.persistence.*;
@Entity
@IdClass(AccountId.class)
@Table(name = "accounts")
public class Account {
    @EmbeddedId
    private AccountId accountKey;
    @Id
    private String accountNumber;

    @Id
    private String accountType;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public void setAccountId(AccountId accountId) {
        this.accountId = accountId;
    }
}
