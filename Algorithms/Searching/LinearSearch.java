import java.util.*;
public class LinearSearch {
    public static int linSearch(int[] arr, int x) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
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
        System.out.println("Enter element to search: ");
        int x = sc.nextInt();
        int index = linSearch(arr, x);
        if(index == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }
}
