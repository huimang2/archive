package design_pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Skill implements Cloneable {

    private List<String> skilList;

    public Skill() {
        skilList = new ArrayList<String>();
        skilList.add("백스탭");
        skilList.add("큐어");
        skilList.add("힐");
    }

    public Skill(List<String> list){
        skilList = list;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<String>();
        for(String s : skilList){
            temp.add(s);
        }
            return new Skill(temp);
        }

    public void add(String skill) {
        skilList.add(skill);
    }
}