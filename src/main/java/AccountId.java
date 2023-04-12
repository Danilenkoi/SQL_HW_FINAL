import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;
@Embeddable
public class AccountId implements Serializable {

    private String accountNumber;
    private String accountType;

    public AccountId(String accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountId that = (AccountId) o;
        return Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(accountType, that.accountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountType);
    }
}
