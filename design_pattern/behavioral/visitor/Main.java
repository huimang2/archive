package design_pattern.behavioral.visitor;

public class Main {
    
    public static void main(String[] args) {
        
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory pi = new Directory("pi");

        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        root.add(home);
        home.add(pi);
        pi.add(file1);
        pi.add(file2);
        pi.add(file3);

        root.accept(new ViewVisitor());

    }
}
