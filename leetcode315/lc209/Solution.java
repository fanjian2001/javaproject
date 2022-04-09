class Solution {
    /**
     * 滑动窗口法
     * 1.定义两个指针。一个慢指针，一个快指针
     * 2.如果两个指针中间的所有数的和小于target值，那么快指针继续移动，并更新过sum值。
     * 3.如果两个指针中间的所有数的和大于target的值，那么快指针不动，左指针向右移动。
     * 最后当快指针到达数组末尾，就结束循环
     */
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = nums[low];
        int ans = Integer.MAX_VALUE;
        while(high < nums.length) {
            if(sum < target) {                
                high ++;
                if(high < nums.length) {
                    sum += nums[high];
                }
                
            }//如果sum>=target那么更新答案
            else {
                sum -= nums[low];
                ans = Math.min(ans,high - low + 1);
                if(low < high) {
                    low ++;
                }else {
                    high ++;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
