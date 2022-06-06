package design_pattern.creational.abstract_factory;

public class Application {
    public static void main(String[] args) {
        Button winButton = new WinFactory().createButton();
        Button osxButton = new OSXFactory().createButton();

        winButton.paint();
        osxButton.paint();
    }
}
