package design_pattern.creational.abstract_factory;

public class WinFactory implements GUIFactory {
    public Button createButton() {
        return new WinButton();
    }
}
