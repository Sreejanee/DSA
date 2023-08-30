// Find duplicates in O(n) time and O(1) extra space | Set 1
// Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
// Output: 1, 3, 6

// Explanation: The numbers 1 , 3 and 6 appears more
// than once in the array.

// Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
// Output: 3

// Explanation: The number 3 appears more than once
// in the array.

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1]>=0){
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*(-1);
            }
            else{
                 l.add(Math.abs(nums[i]));
            }
        }
        return l;
    }
}