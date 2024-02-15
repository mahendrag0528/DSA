
//problem statement

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/


import java.lang.*;
import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //previously occur or not
        Map<Integer,Integer> preCheck=new HashMap<>();
        preCheck.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int remain=target-nums[i];
            if(preCheck.containsKey(remain)){
            return new int[]{preCheck.get(remain),i};
            }
            preCheck.put(nums[i],i);
        }
        //not found 
        return new int[]{-1,-1};
    }
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=s.nextInt();
		}
		int target=s.nextInt();
		int[] ans=twoSum(ar,target);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
	}
}