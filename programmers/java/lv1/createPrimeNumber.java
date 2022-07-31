package programmers.java.lv1;

import java.util.Arrays;

public class createPrimeNumber {
    public static void main(String[] args) {

    }

    public int solution(int[] nums) {

        int count = 0;
        int length = nums.length;
        int max, sum;

        Arrays.sort(nums);
        max = nums[length - 1] + nums[length - 2] + nums[length - 3];

        boolean[] primeNumbers = new boolean[max + 1];
        Arrays.fill(primeNumbers, true);

        for (int i = 0; i <= Math.sqrt(max); i++) {

            if (i < 2) {
                primeNumbers[i] = false;
                continue;
            }

            if (primeNumbers[i]) {
                for (int j = i * 2; j <= max; j += i) primeNumbers[j] = false;
            }
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (primeNumbers[sum]) count++;
                }
            }
        }

        return count;
    }
}
