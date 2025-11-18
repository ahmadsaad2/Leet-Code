class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, start, mid);
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
