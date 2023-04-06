//shortest path
import java.sql.SQLOutput;
import java.util.*;
public class program_04 {
    static float getShortestPath(String str){
        int x = 0,y = 0;
        for(int i = 0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if (dir == 'S') {
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                System.out.println("Invalid path!");
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        float sPath = (float)Math.sqrt(x2 + y2);
        return sPath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your path (Capital letters): ");
        String path = sc.next();

        System.out.println(getShortestPath(path));
    }
}
