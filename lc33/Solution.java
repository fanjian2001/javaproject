class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = left;
        while(nums[left] < nums[right]) {
	    //如果找到了target值
            if(nums[mid] == target) {
                return mid;
            }
	    //如果左边是递增区间(因为本题特殊，没有重复的元素，因此不需要判断等于的情况)
            if(nums[mid] > nums[left]) {
                if(nums[mid] > target) {
                    //那么就往右递归;注意：不能用mid + 1赋值给left；因为在这个循环里，要永远保证nums[left] < nums[right] 不能通过错误的条件去改变了这个范围。一般 用 mid + 1 赋值给left的情况是while(left <= right);
                    left = mid;
                }else {
                    right = mid;
                }
            }else if(nums[mid] < nums[right]) {
                if(nums[mid] > target) {
                    right = mid;
                }else {
                    left = mid;
                }
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
