package P1029;

public class User {
    // 필드
    String username;
    String email;
    String password;
    // 생성자

    public User() {
    }
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    // 메서드
    // 패스워드 변경하는 메서드
    public String setPassword(String newPassword) {
        this.password =newPassword;
        return this.password;
    }
}
