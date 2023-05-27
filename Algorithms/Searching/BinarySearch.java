import java.util.*;
public class BinarySearch {
    public static int binSearchIter(int[] arr, int x) {
        int low=0, high=arr.length-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==x) {
                return mid;
            }
            else if(arr[mid]<x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static int binSearchRec(int[] arr,int x,int low,int high) {
        if(low>high) {
            return -1;
        }
        int mid = low+(high-low)/2;
        if(arr[mid]==x) {
            return mid;
        }
        else if(arr[mid]<x) {
            return binSearchRec(arr, x, mid+1, high);
        }
        else {
            return binSearchRec(arr, x, low, mid-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter element to search: ");
        int x = sc.nextInt();
        int index = binSearchIter(arr, x);
        if(index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }
}