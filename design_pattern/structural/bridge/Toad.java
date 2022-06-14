package design_pattern.structural.bridge;

public class Toad extends Amphibia {
    
    private String species = "두꺼비";

    public Toad(Depense depense) {
        super(depense);
    }

    @Override
    public void getSpecies(){
        System.out.println("종(species) : " + this.species);
    };
}
