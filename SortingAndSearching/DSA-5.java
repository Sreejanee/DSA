public class FloorCeilingFinder {
    public static int findFloor(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int floor = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                floor = arr[mid];
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return floor;
    }

    public static int findCeiling(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        int ceiling = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == x) {
                return arr[mid];
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                ceiling = arr[mid];
                right = mid - 1;
            }
        }
        
        return ceiling;
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int value = 20;

        int floorResult = findFloor(sortedArray, value);
        int ceilingResult = findCeiling(sortedArray, value);
        //if floorResult==-1 and ceilingResult==-1 then for that particular x the ceila nad floor is not present in the array
        System.out.println("Floor of " + value + " is " + floorResult);
        System.out.println("Ceiling of " + value + " is " + ceilingResult);
    }
}
