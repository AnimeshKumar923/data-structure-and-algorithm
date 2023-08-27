public class PlusOne {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = 0; i < digits.length; i++) {
                digits[digits.length - 1]++;
                // int lastDigit = digits[digits.length - 1];
                // lastDigit++;
                if (digits[digits.length - 1] == 0) {
                    digits[digits.length - 2]++;
                    // int last2ndDigit = digits[digits.length-2];
                    // last2ndDigit++;
                }
                break;
            }

            return digits;
        }
    }
}
