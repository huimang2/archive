package design_pattern.creational.factory;

public class Test2 {
    
    public static void main(String[] args) {
        Computer computer1 = Computer.ComputerFactory(Computer.Manufacture.SAMSUNG);
        computer1.createComputer();

        Computer computer2 = Computer.ComputerFactory(Computer.Manufacture.LG);
        computer2.createComputer();

        Computer computer3 = Computer.ComputerFactory(Computer.Manufacture.APPLE);
        computer3.createComputer();
    }
}
