package design_pattern.structural.bridge;

public class Salamander extends Amphibia {

    private String species = "도롱뇽";

    public Salamander(Depense depense) {
        super(depense);
    }

    @Override
    public void getSpecies(){
        System.out.println("종(species) : " + this.species);
    };
}
