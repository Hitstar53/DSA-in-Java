import java.util.*;
public class shellSort {
    public static void shellsort(int[] arr, int n) {
        for(int gap=n/2;gap>0;gap/=2) {
            for(int i=gap;i<n;i++) {
                int temp = arr[i];
                int j;
                for(j=i;j>=gap && arr[j-gap]>temp;j-=gap) {
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
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
        shellsort(arr, n);
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
