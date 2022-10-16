package programmers.java.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class S12926 {

    public String solution(String s, int n) {
        
        return Arrays.stream(s.split("")).map(x -> {
            
            char c = x.charAt(0);

            if(x.equals(" ")) return " ";
            else if(c > 'Z' && c + n > 'z') return Character.toString(c + n - 'z' - 'a' + 1);
            else if(c <= 'Z' && c + n > 'Z') return Character.toString(c + n - 'z' - 'a' + 1);
            else return Character.toString(c + n);

        }).collect(Collectors.joining(", "));
    }
}
