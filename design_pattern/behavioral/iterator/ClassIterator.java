package design_pattern.behavioral.iterator;

public class ClassIterator implements Iterator {
    
    private Class cls;
    private int index;

    public ClassIterator(Class cls) {
        this.cls = cls;
    }

    @Override
    public boolean hasNext() {
        return index < cls.size() ? true : false;
    }

    @Override
    public Object next() {
        return cls.getStudentAt(index++);
    }

    
}
