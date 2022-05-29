package design_pattern.creational.singleton;

import java.util.ArrayList;

public class Donation {
    
    private Donation(){}

    private static Donation INSTANCE = null;

    public static Donation getInstance(){
        if(INSTANCE == null){
          INSTANCE = new Donation();  
        }
        return INSTANCE;
    }

    private int total = 0;
    private ArrayList<String> contributors = new ArrayList<String>();

    public void donation(String name, int amount){
      this.total += amount;
      this.contributors.add(name);
    }

    public int getTotal(){
      return this.total;
    }

    public ArrayList<String> getContributors(){
      return this.contributors;
    }
}