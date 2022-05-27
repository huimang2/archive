package design_pattern.structural.composite;

public class Main {
    
    public static void main(String[] args) {

        ProductTV pdTV1 = new ProductTV("TV_1");
        ProductTV pdTV2 = new ProductTV("TV_2");
        ProductAudio pdAudio1 = new ProductAudio("Audio_1");
        ProductAudio pdAudio2 = new ProductAudio("Audio_2");

        ElectronicProductComposite composite = new ElectronicProductComposite();

        composite.addProductList(pdTV1);
        composite.addProductList(pdAudio1);
        composite.addProductList(pdTV2);
        composite.addProductList(pdAudio2);

        composite.powerOn();
        
        composite.powerOff();
    }
}
