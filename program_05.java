/*
For a given set of Strings, print the largest string.
"apple","mango","banana"
 */
public class program_05 {
    public static void main(String[] args) {
        String str[] = {"apple","mango","banana"};
//        System.out.println(str[0].compareTo(str[1]));
        String largest = str[0];
        for(int i = 0;i<str.length;i++){
            if (largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println("The largest string is: "+largest);
    }
}
