package design_pattern.behavioral.visitor;

import java.util.ArrayList;

public class Directory extends Entry {

    final ArrayList<Entry> directory;

    public Directory(String name) {
        super(name);
        this.directory = new ArrayList<>();
    }

    @Override
    public void add(Entry entry) {
        directory.add(entry);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}
