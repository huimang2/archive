package design_pattern.structural.composite;

public class ProductTV implements ElectronicProductComponent {
    private String name;
    public ProductTV(String name) {
        this.name = name;
    }

    @Override
    public void powerOn() {
        System.out.println("TV power on - " + this.name);
    }

    @Override
    public void powerOff() {
        System.out.println("TV power off" + this.name);
    }
}
