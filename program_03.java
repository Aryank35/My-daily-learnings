/*
->take an string input from the user
-> check the string is palindrome or not
*/
import java.util.Scanner;

public class program_03 {
    public static void palindrome(String str){
        int flag = 0;
        for(int i = 0;i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                flag = 1;
            }
        }
        if(flag!=0){
            System.out.println(str+" is not a palindrome string.");
        }
        else{
            System.out.println(str+" is a palindrome String.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        palindrome(str);
    }
}
