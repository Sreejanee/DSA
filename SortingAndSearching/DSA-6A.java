// Find a pair with the given difference
// Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n. 
// Examples: 

// Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
// Output: Pair Found: (2, 80)

// Input: arr[] = {90, 70, 20, 80, 50}, n = 45
// Output: No Such Pair


static boolean findPair(int arr[], int size, int n)
{
    // Step-1 Sort the array
    Arrays.sort(arr);
 
    // Initialize positions of two elements
    int l = 0;
    int r = 1;
 
    // take absolute value of difference
    // this does not affect the pair as A-B=diff is same as
    // B-A= -diff
    n = Math.abs(n);
 
    // Search for a pair
 
    // These loop running conditions are sufficient
    while (l <= r && r < size) {
        int diff = arr[r] - arr[l];
        if (diff == n
            && l != r) // we need distinct elements in pair
                        // so l!=r
        {
            System.out.print("Pair Found: (" + arr[l] + ", "
                + arr[r] + ")");
            return true;
        }
        else if (diff > n) // try to reduce the diff
            l++;
        else // Note if l==r then r will be advanced thus no
            // pair will be missed
            r++;
    }
    System.out.print("No such pair");
    return false;
}