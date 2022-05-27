package design_pattern.structural.facade;

public class LoginProcess {

    public LoginProcess() {}

    public void login(String id, String pw) {
        this.getDBConnection();
        this.getUserIDfromDB();
        this.getUserPWfromDB();
        this.checkUser(id, pw);
        this.closeDBConnection();
    }

    private void getDBConnection() {
        System.out.println("Connect DB success");
    }

    private void getUserIDfromDB() {
        System.out.println("User ID is XXX");
    }

    private void getUserPWfromDB() {
        System.out.println("User PW is XXXXXX");
    }    
    
    private void checkUser(String id, String pw) {
        System.out.println("Check id success");
        System.out.println("Check pw success");
        System.out.println("Success Login");
    }

    private void closeDBConnection() {
        System.out.println("Disconnect DB Success");
    }
}
