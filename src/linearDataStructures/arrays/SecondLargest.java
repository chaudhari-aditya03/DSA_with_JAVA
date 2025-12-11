package linearDataStructures.arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args)
    {
        int[] arr = {21,52,63,41,52,15,42};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second Largest Element is : "+arr[arr.length-2]);
    }
}
