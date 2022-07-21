package design_pattern.behavioral.chain_of_responsibility;

public class Frontend extends Handler {

    @Override
    protected void handle(App app) {
        if(app.getFrontend() == null) {
            System.out.println("프론트엔드 코드를 작성합니다.");
            app.setFrontend(this);
        }
    }

}
