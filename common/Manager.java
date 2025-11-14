import common.User;

public class Manager extends User {
    public Manager(String name, String id, String password, boolean role){
        super(name, id, password, role);
    }

    

    // 유저 생성
    public void createUser(){};
    // 유저 삭제
    public void deleteUser(){};
}