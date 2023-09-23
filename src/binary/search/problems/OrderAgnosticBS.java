package binary.search.problems;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-2, 12, 19,32, 33, 45, 55, 64, 66,87, 98,123, 334};
        int[] arr = {334, 123, 98, 87, 66, 64, 55, 45, 33, 19, 12, -2};
        int target = 19;
        int result = orderAgnosticBs(arr, target);
        System.out.println(result);
    }

    static int orderAgnosticBs(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int mid = s + (e-s)/2;
            if (target == arr[mid]) return mid;

            if (isAsc) {
                if (target < arr[mid]) e = mid - 1;
                else s = mid + 1;
            } else {
                if (target < arr[mid]) s = mid + 1;
                 else e = mid - 1;
            }
        }
        return -1;
    }
}
