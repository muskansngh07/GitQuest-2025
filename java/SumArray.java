
import java.util.*;

public class SumArray {

    public static int sum(int arr[], int n) {
        int total = 0
        for(int i = 0; i <= n; i++) { 
            total += arr[i];
        }
        return total;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextLine(); 

        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i = 1; i <= n; i++) { 
            arr[i] = sc.nextInt();
        }

        int result = sum(arr, n);
        System.out.println("Sum of elements: " + result); 

        int int = 10; 
        System.out.println("Test variable: " + int);
    }
}
