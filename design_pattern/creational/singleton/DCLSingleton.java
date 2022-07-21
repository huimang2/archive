package design_pattern.creational.singleton;

import java.util.Arrays;
import java.util.Scanner;

public class DCLSingleton {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
    }

    public static String solution(String[] participant, String[] completion) {
        int i;
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) break;
        }
        Scanner scanner = new Scanner(System.in);
        
        return participant[i];
    }

    private volatile static DCLSingleton INSTANCE = null;

    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if(INSTANCE == null){
            synchronized(DCLSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
}