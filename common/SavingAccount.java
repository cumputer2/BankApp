public class SavingAccount extends Account {
    private int interestRate;
    private int maxTransferAmountToChecking;

    public SavingAccount(String owner, int accountNumber, int totalBalance, int availableBalance, int openData, int interestRate, int maxTransferAmountToChecking){
        super(owner, accountNumber, totalBalance, availableBalance, openData);
        this.interestRate = interestRate;
        this.maxTransferAmountToChecking = maxTransferAmountToChecking;
    }

    // 이체
    public void transfer(){
    }

    // Getter
    public int getInterestRate(){
        return this.interestRate;
    }
    public int getMaxTransferAmountToChecking(){
        return this.maxTransferAmountToChecking;
    }
    // Setter
    public void setInterestRate(int interestRate){
        this.interestRate = interestRate;
    }
    public void setMaxTransferAmountToChecking(int maxTransferAmountToChecking){
        this.maxTransferAmountToChecking = maxTransferAmountToChecking;
    }
}