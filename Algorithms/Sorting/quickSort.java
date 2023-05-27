import java.util.*;
public class quickSort {
    public static int partition(int[] arr, int low, int high) {
        int left,right,pivot = arr[low];
        left = low;
        right = high;
        while(left<right) {
            while(arr[left]<=pivot && left<high) {
                left++;
            }
            while(arr[right]>pivot) {
                right--;
            }
            if(left<right) {
                swap(arr,left,right);
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        return right;
    }
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp; 
    }
    public static void qckSort(int[] arr,int low,int high) {
        if(low<high) {
            int pi = partition(arr, low, high);
            qckSort(arr, low, pi-1);
            qckSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        qckSort(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
