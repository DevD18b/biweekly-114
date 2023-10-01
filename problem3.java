public class problem3 {
    public static int splitArrayIntoMaximumNumber(int[] arr) {
        int score = arr[0];

        for (int i = 1; i < arr.length; i++) {
            score &= arr[i];
        }

        if (score != 0) {
            return 1;
        }
        int current = arr[0];
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            current = current & arr[i];
            if (current == 0) {
                if (i < arr.length - 1) {
                    current = arr[i + 1];
                }
                count++;
            }
        }
        return count;

    }
}
