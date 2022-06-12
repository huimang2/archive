package design_pattern.structural.composite;

public class ApplicationFile implements File {
    
    private String name;

    public ApplicationFile(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }
}
