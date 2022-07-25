package design_pattern.behavioral.visitor;

public class ViewVisitor implements Visitor {

    private String path = "";

    @Override
    public void visit(File file) {
        System.out.println(path + "/" + file.name);
    }

    @Override
    public void visit(Directory directory) {
        path += "/" + directory.name;
        System.out.println(path);
        for(Entry entry : directory.directory) {
            entry.accept(this);
        }
    }
    
}
