package design_pattern.creational.factory;

import design_pattern.creational.factory.Computer.Manufacture;

// Main test
public class Test {
    public static void main(String[] args) {
       
        Computer computer1 = Computer.ComputerFactory(Manufacture.SAMSUNG);
        computer1.createComputer();

        Computer computer2 = Computer.ComputerFactory(Manufacture.LG);
        computer2.createComputer();

        Computer computer3 = Computer.ComputerFactory(Manufacture.APPLE);
        computer3.createComputer();
    }
}
