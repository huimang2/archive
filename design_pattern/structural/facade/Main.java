package design_pattern.structural.facade;

public class Main {

    public static void main(String[] args) {
        LoginProcess loginObj = new LoginProcess();
        loginObj.login("id", "pw");
    }
}
