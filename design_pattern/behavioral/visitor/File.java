package design_pattern.behavioral.visitor;

public class File extends Entry {

    public File(String name) {
        super(name);
    }

    @Override
    public void add(Entry entry) {}

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    
}
