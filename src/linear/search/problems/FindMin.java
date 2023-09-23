package linear.search.problems;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 15, -5, 4, 12, 434, 154, 28};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        for (int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }
}
