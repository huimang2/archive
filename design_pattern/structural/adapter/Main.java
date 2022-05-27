package design_pattern.structural.adapter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Person> personObjList = new ArrayList<Person>();
        personObjList.add(new Person("A", "010-1234-0001"));
        personObjList.add(new Person("B", "010-1234-0002"));
        personObjList.add(new Person("C", "010-1234-0003"));

        PushAdapterImpl pushObj = new PushAdapterImpl();
        pushObj.PushMessage(personObjList.get(0));
        pushObj.PushMessages(personObjList);

        System.out.println("\n");

        PushAdapterImpl2 pushObj2 = new PushAdapterImpl2();
        pushObj2.PushMessage(personObjList.get(1));
        pushObj2.PushMessages(personObjList);
    }

}
