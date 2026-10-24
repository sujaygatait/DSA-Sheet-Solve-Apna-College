class Solution {
    public int binarySearch(int[] nums, int low, int high, int target) {
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) low = mid + 1;
            else if(nums[mid] > target) high = mid - 1;
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;

        if(n <= 3) {
            for(int i=0; i<n; i++) {
                if(nums[i] == target) return i;
            }
        }

        int pivot = -1;

        int low=1, high=n-2;
        while(low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
                pivot = mid;
                break;
            }
            else if(nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]) {
                pivot = mid - 1;
                break;
            }
            else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1] && nums[mid]>nums[n-1]) {
                low = mid + 1;
            }
            else high = mid - 1;
        }

        int idx = binarySearch(nums, 0, pivot, target);
        if(idx == -1) idx = binarySearch(nums, pivot+1, n-1, target);

        return idx;
    }
}
