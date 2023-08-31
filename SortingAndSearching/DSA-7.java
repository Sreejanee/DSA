// Majority Element
// Read

// Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 

// Examples : 

// Input : A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output : 4
// Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size. 

// Input : A[] = {3, 3, 4, 2, 4, 4, 2, 4}
// Output : No Majority Element
// Explanation: There is no element whose frequency is greater than the half of the size of the array size.



class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
                count=1;
            }
            else if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                count1++;
            }
        }
        if(count1>(nums.length/2))
            return ele;
        return -1;
       
    }
}