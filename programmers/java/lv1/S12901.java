package programmers.java.lv1;

public class S12901 {
    class Solution {
        public String solution(int a, int b) {
            
            int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
            
            int day = b;
            for(int i = 1; i < a; i++) day += month[i];

            return new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"}[day%7];
        }
    }
}
