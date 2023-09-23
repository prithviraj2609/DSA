package binary.search.problems;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 12, 23,32, 33, 45, 55, 64, 66,87, 98,123, 334};
        int target = 23;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }

    // return the index of the target if present
    // if not found return -1
    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;


        while (s <= e) {
            // finding middle
            int mid = s + (e-s)/2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                e = mid -1;
            } else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
