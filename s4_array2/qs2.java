package s4_array2;

public class qs2 {
    public static int search(int[] nums, int target) {
        // min will have index of minimum element of nums
        int min = minSearch(nums);
        System.out.println("min is :"+min);
        // find in sorted left
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            System.out.println("target is :"+target);
            return searchbinary(nums, min, nums.length - 1, target);
        }
        // find in sorted right
        else {
            return searchbinary(nums, 0, min, target);
        }
    }

    // binary search to find target in left to right boundary
    public static int searchbinary(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
       System.out.println("l is:" +l);
       System.out.println("r is:" +r);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element index
    public static int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        System.out.println("the element is present at index "+search(num,2));
    }
}
