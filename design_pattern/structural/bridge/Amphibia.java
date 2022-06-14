package design_pattern.structural.bridge;

public abstract class Amphibia {
    
    private Depense depense;
    public abstract void getSpecies();

    public Amphibia(Depense depense){
        this.depense = depense;
    }

    public void getDepenseMethod(){
        System.out.print("방어수단 : ");
        depense.getDepenseMethod();
    }
}
