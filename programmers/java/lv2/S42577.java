// https://school.programmers.co.kr/learn/courses/30/lessons/42577

package programmers.java.lv2;

import java.util.Arrays;

public class S42577 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0, size = phone_book.length-1; i < size; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}
