package linear.search.problems;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 15, -5, 4, 12, 434, 154, 28};
        int target = 12;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
