package linearDataStructures.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {10, 50, 94, 21, 12, 56};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target = 21;
        int low = 0;
        int high = n - 1;
        while(low <= high)
        {
            int mid = low+high/2;
            if(target == arr[mid])
            {
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(target > arr[mid])
            {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
    }
}
