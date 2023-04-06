/*Q. Find the maximum & minimum number in an array of integers.*/
import java.util.*;
public class Program_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size= sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter your "+size+" Numbers: ");
        for(int i = 0;i<size;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        int min = num[0];
        int max = num[size-1];
        System.out.println("Min number in your Array: "+min);
        System.out.println("Max number in your Array: "+max);
    }
}
