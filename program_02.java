/*
-> take an string input from the user
-> print the string letter by letter with a space between the letters in the same line

ex:-
input:
Aryan kumar Mohapatra

output:
A r y a n  k u m a r  M o h a p a t r a
*/
import java.util.Scanner;
public class program_02 {
    static void printLetters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = sc.nextLine();
        printLetters(str);
    }
}
