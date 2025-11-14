public class Account {
    protected String owner;
    protected int accountNumber;
    protected int totalBalance;
    protected int availableBalance;
    protected int openDate;

    public Account(String owner, int accountNumber, int totalBalance, int availableBalance, int openDate){
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.openDate = openDate;
    }

    // 입금
    public void deposit(){
    }
    // 출금
    public void withdraw(){
    }



    // Getter
    public String getOwner(){
        return this.owner;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getTotalBalance(){
        return this.totalBalance;
    }
    public int getAvailableBalance(){
        return this.availableBalance;
    }
    public int getOpenData(){
        return this.openDate;
    }   
    // Setter
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setTotalBalance(int totalBalance){
        this.totalBalance = totalBalance;
    }
    public void setAvailableBalance(int availableBalance){
        this.availableBalance = availableBalance;
    }
    public void setOpenDate(int openDate){
        this.openData = openData;
    }
}