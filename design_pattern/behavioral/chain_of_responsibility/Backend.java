package design_pattern.behavioral.chain_of_responsibility;

public class Backend extends Handler {

    @Override
    protected void handle(App app) {
        if(app.getBackend() == null) {
            System.out.println("백엔드 코드를 작성합니다.");
            app.setBackend(this);
        }
    }
    
}
