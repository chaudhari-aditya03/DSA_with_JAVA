package linearDataStructures.arrays;

import java.util.Scanner;

class ArrayOperations{
    void ArrayArithmatic(int[] arr){
        int sum =0;
        int sub=0;
        int product=1;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            sub = arr[i]-sub;
            product*=arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Subtraction of array elements: " + sub);
        System.out.println("Product of array elements: " + product);
    }
}
public class ArrayInit {
    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        obj.ArrayArithmatic(arr);
        sc.close();
    }
}
