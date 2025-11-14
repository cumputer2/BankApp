import common.Account;
import common.SavingAccount;

public class CheckingAccount extends Account {
    private SavingAccount savingAccount;

    public CheckingAccount(String owner, int accountNumber, int totalBalance, int availableBalance, int openData, SavingAccount savingAccount){
        super(owner, accountNumber, totalBalance, availableBalance, openData);
        this.savingAccount = savingAccount;
    }

    

    // Getter
    public SavingAccount getSavingAccount(){
        return this.savingAccount;
    }
    // Setter
    public void setSavingAccount(SavingAccount savingAccount){
        this.savingAccount = savingAccount;
    }
}