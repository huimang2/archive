package design_pattern.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        
        Class cls = new Class(5);

        cls.add(new Student("홍길동"));
        cls.add(new Student("장길산"));
        cls.add(new Student("임꺽정"));
        cls.add(new Student("이순신"));
        cls.add(new Student("유성룡"));

        // Iterator iterator = cls.iterator();

        // while(iterator.hasNext()) {
        //     Student student = (Student)iterator.next();
        //     System.out.println(student.getName());
        // }

        for(int i = 0; i < cls.size(); i++) {
            System.out.println(cls.getStudentAt(i).getName());
        }
    }
}
