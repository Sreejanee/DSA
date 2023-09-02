class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        int[][] v = new int[n][2];
        long totalCost = 0;

        for (int i = 0; i < n; i++) {
            v[i][0] = nums[i];
            v[i][1] = cost[i];
            totalCost += cost[i];
        }

        Arrays.sort(v, (a, b) -> Integer.compare(a[0], b[0]));
        long mid = (totalCost + 1) / 2;
        long sum=0;
        long target=0;
        for(int i=0;i<n;i++){
            sum+=v[i][1];
            if(sum>=mid){
                target=v[i][0];
                break;
            }
        }
        

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs((long) nums[i] - (long) target) * (long) cost[i];
        }

        return ans;

    }
}