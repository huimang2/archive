package design_pattern.creational.abstract_factory;

public class OSXFactory implements GUIFactory {
    public Button createButton() {
        return new OSXButton();
    }
}
