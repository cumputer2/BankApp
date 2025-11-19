public abstract class Account {
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
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("입금 실패: 입금액은 0원보다 커야 합니다.");
            return;
        }
        this.totalBalance += amount;
        this.availableBalance += amount;
        System.out.println(amount + "원이 입금되었습니다.");
        System.out.println("현재 총잔액은 " + this.totalBalance + "원입니다. 인출가능잔액은 " + this.availableBalance + "원입니다.");
    }
    // 출금
    public void withdraw(int amount){
        if (amount <= 0) {
            System.out.println("출금 실패: 출금액은 0원보다 커야 합니다.");
            return;
        }
        if (amount > this.availableBalance) {
            System.out.println("출금 실패: 잔액 부족 (출금 요청액이 인출 가능 잔액보다 큽니다.)");
            return;
        }

        this.totalBalance -= amount;
        this.availableBalance -= amount;

        System.out.println(amount + "원이 출금되었습니다.");
        System.out.println("현재 총잔액은 " + this.totalBalance + "원입니다. 인출가능잔액은 " + this.availableBalance + "원입니다.");
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
        this.openDate = openDate;
    }
}