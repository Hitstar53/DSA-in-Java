import java.util.*;
public class mergeSort {
    public static void merge(int[] arr,int low,int mid,int high) {
        int h = low, i = low, j = mid+1;
        int[] b = new int[high+1];
        while(h<=mid && j<=high) {
            if(arr[h]<=arr[j]) {
                b[i] = arr[h];
                h++;
            }
            else {
                b[i] = arr[j];
                j++;
            }
            i++;
        }
        if(h>mid) {
            for(int k=j;k<=high;k++) {
                b[i] = arr[k];
                i++;
            }
        }
        else {
            for(int k=h;k<=mid;k++) {
                b[i] = arr[k];
                i++;
            }
        }
        for(int k=low;k<=high;k++) {
            arr[k] = b[k];
        }
    }
    public static void mergesort(int[] arr, int low, int high) {
        if(low<high) {
            int mid = low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
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
        mergesort(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
