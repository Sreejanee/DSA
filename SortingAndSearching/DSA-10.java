// Merge two sorted arrays with O(1) extra space
// Read
// Discuss(180+)
// Courses
// Practice
// We are given two sorted arrays. We need to merge these two arrays such that the initial numbers (after complete sorting) are in the first array and the remaining numbers are in the second array

// Examples: 

// Input: ar1[] = {10}, ar2[] = {2, 3}
// Output: ar1[] = {2}, ar2[] = {3, 10}  

// Input: ar1[] = {1, 5, 9, 10, 15, 20}, ar2[] = {2, 3, 8, 13}
// Output: ar1[] = {1, 2, 3, 5, 8, 9}, ar2[] = {10, 13, 15, 20}
void merge(int arr1[],int m,int arr2[],int n){
    int i=m-1;
    int j=0;
    while(i>=0 && j<n){
        if(arr1[i]>arr2[j]){
            swap(arr1[i],arr2[j]);
            i--;j++;
        }
        else{
            break;
        }
    }
    Arrays.sort(arr1);
    Arrays.sort(arr2);
}