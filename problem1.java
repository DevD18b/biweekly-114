import java.util.HashSet;

public class problem1 {
    public static int minOperation(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            }
            count++;
            if (set.size() == 0) {
                break;
            }
        }
        return count;
    }
}