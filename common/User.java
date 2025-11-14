public class User {
    protected String name;
    protected String id;
    protected String password;
    protected boolean role;

    public User(String name, String id, String password, boolean role){
        this.name = name;
        this.id = id;
        this.password = password;
        this.role = role;
    }

    // 로그인
    public void login(){
    }
    // 로그아웃
    public void logout(){
    }
    // Getter
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean getRole(){
        return this.role;
    }
    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setRole(boolean role){
        this.role = role;
    }   
}