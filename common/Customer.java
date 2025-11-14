import common.User;
import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Account> accountList;

    public Customer(String name, String id, String password, boolean role, ArrayList<Account> accountList){
        super(name, id, password, role);
        this.accountList = accountList;
    }

    

    // 계좌 추가
    public void addAccount(){};
    // 계좌 삭제
    public void deleteAccount(){};
    // 계좌 조회
    public void viewAccount(){};
}