package design_pattern.behavioral.iterator;

public class Class implements Aggregate {

    private Student[] students;
    private int pointer;

    public Class(int maxSize) {
        this.students = new Student[maxSize];
    }

    public void add(Student student) {
        this.students[pointer++] = student;
    }

    public Student getStudentAt(int index) {
        return students[index];
    }

    public int size() {
        return pointer;
    }

    @Override
    public Iterator iterator() {
        return new ClassIterator(this);
    }
}
