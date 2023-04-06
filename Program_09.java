/* Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.*/
import java.util.Arrays;
import java.util.Scanner;
public class Program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter your "+size+" numbers: ");
        for(int i = 0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int flag=0;
        for(int i = 0;i<size;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        if(flag!=1){
            System.out.println("your Array is Sorted in ascending order...");
        }
        else{
            Arrays.sort(arr);
            System.out.println("Your Array is not Sorted in Ascending order\nYour sorted array is:\n");
            for(int i = 0;i<size;i++){
                System.out.print(" "+arr[i]);
            }

        }
    }
}
