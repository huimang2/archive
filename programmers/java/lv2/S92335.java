package programmers.java.lv2;

public class S92335 {

    public static void main(String[] args) {
        System.out.println(solution(110011, 10));
    }

    public static int solution(int n, int k) {
        
        int answer = 0;

        for(String i : Integer.toString(n, k).split("0")) {
            try {
                answer += isPrimes(Long.parseLong(i));
            } catch(NumberFormatException e) {
                continue;
            }
        };

        return answer;
    }
    
    public static int isPrimes(long n) {
        
        if(n == 1) return 0;
        
        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return 0;
        }
        
        return 1;
    }
}
