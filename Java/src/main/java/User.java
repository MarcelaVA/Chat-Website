public class User {
    private String login;
    private String pass;
    private String token;
            public User(String login,String pass,String token){
                this.login=login;
                this.pass=pass;
                this.token=token;
            }


    public String getLogin() {
        return login;
    }

    public String getToken() {
        return token;
    }

    public String getPass() {
        return pass;
    }
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
