package design_pattern.structural.bridge;

public class BridgePattern {
    public static void main(String[] args) {
        
        Depense poison = new Poison();
        Depense tailDepense = new TailCut();

        Amphibia toad = new Toad(poison);
        Amphibia salamander = new Salamander(tailDepense);

        toad.getSpecies();
        toad.getDepenseMethod();

        salamander.getSpecies();
        salamander.getDepenseMethod();

    }
}
