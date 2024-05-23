public class FirstandLastPositionofElement34 {
/*
 https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1266113036/
 */

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target,true );
        if(ans[0] != -1){
            ans[1] = search(nums,target,false);
        }
        return ans;
    }
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid])
            {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }
            else{
                ans = mid;
                //to search if there's one more number in the left of the array
                if(findStartIndex){
                    end = mid -1;
                } else {
                    start= mid +1;
                }
            }
        }
        return ans;

    }
}