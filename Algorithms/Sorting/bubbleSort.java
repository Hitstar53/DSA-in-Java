import java.util.*;
public class bubbleSort {
    public static int swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
        return 1;
    }
    public static void bubblesort(int[] arr, int n) {
        int flag = 1;
        for(int i=n;i>=0 && flag==1;i--) {
            flag = 0;
            for(int j=0;j<i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    flag = swap(arr, j, j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(arr, n);
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
