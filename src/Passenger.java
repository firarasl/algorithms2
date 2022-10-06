import java.util.Arrays;

public class Passenger {

    //    using bubble sort
    public static int[] queue(int[] array) {
        int replacer;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                replacer = array[i - 1];
                array[i - 1] = array[i];
                array[i] = replacer;
                i = 0;
            }
        }
        return array;
    }

    public static int lengthOfLongestSubstring(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        int max = 0;
//        making char array from string
        char[] inputArray = input.toCharArray();

        int i = 0;

        while (i < inputArray.length) {
//            set simulator
            boolean[] set = new boolean[256];
            int k = i;
            while (k < inputArray.length && !set[inputArray[k]]) {
//                ternary operator
                max = (max > k - i + 1) ? max : k - i + 1;
                set[inputArray[k]] = true;
                k++;
            }
            set[inputArray[i]] = false;
            i++;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] passengersArray = new int[]{5, 12, 14, 258, 18, 19, 17, 0};
        System.out.println(Arrays.toString(queue(passengersArray)));
        System.out.println(lengthOfLongestSubstring("absabsabsabs"));
        System.out.println(lengthOfLongestSubstring("testestest"));
        System.out.println(lengthOfLongestSubstring("aaaa"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("abcatesrfgb"));
    }
}
