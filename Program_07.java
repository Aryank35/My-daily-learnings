
/*Q . Take an array of names as input from the user and print them on the screen.*/
import java.util.Scanner;
public class Program_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        String names[]=new String[size];
        System.out.println("Enter your "+size+" names: ");
        for(int i = 0;i<size;i++){
            names[i]=sc.next();
        }
        System.out.println("Your inputs are taken\n Inputs processed...\ninput processed complete..");
        System.out.println("Your names are: ");
        for(int i = 0;i<size;i++){
            System.out.println(names[i]);
        }

    }
}
