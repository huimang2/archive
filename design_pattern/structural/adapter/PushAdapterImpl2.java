package design_pattern.structural.adapter;

import java.util.ArrayList;

public class PushAdapterImpl2 implements PushAdapter {
    
    private SendMessage sendMSG = new SendMessage();

    @Override
    public void PushMessage(Person personObj) {
        this.sendMSG.SendMessage(personObj);
    }

    @Override
    public void PushMessages(ArrayList<Person> personObjList) {
        for (Person personObj : personObjList) {
            this.sendMSG.SendMessage(personObj);
        }
    }
}
