import java.util.Arrays;

public class problem2 {

    public static int minOperationToMakeArray(int[] arr) {

        Arrays.sort(arr);
        int minOperation = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            }
            if (count == 1) {
                return -1;
            } else {
                if (count % 3 == 0) {
                    minOperation += count / 3;
                } else {
                    minOperation += (count / 3) + 1;
                }
            }
        }
        if (count % 3 == 0) {
            minOperation += count / 3;
        } else {
            minOperation += (count / 3) + 1;
        }
        return minOperation;
    }
}
