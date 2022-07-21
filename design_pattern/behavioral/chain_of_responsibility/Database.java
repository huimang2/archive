package design_pattern.behavioral.chain_of_responsibility;

public class Database extends Handler {

    @Override
    protected void handle(App app) {
        if(app.getDatabase() == null) {
            System.out.println("데이터베이스 코드를 작성합니다.");
            app.setDatabase(this);
        }
    }

}
