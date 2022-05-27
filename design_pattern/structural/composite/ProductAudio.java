package design_pattern.structural.composite;

public class ProductAudio implements ElectronicProductComponent {
    private String name;
    public ProductAudio(String name) {
        this.name = name;
    }

    @Override
    public void powerOn() {
        System.out.println("Audio power on - " + this.name);
    }

    @Override
    public void powerOff() {
        System.out.println("Audio power off" + this.name);
    }
}
