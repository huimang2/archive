package design_pattern.structural.composite;

import java.util.ArrayList;

public class ElectronicProductComposite implements ElectronicProductComponent {
    
    private ArrayList<ElectronicProductComponent> productList = new ArrayList<ElectronicProductComponent>();

    public ElectronicProductComposite() {
    }

    public void addProductList(ElectronicProductComponent product) {
        productList.add(product);
    }

    public void removeProductList(ElectronicProductComponent product) {
        productList.remove(product);
    }

    @Override
    public void powerOn() {
        System.out.println("Power on...");
        for (ElectronicProductComponent product : productList) {
            product.powerOn();
        }
    }

    @Override
    public void powerOff() {
        System.out.println("Power off...");
        for (ElectronicProductComponent product : productList) {
            product.powerOff();
        }
    }
}