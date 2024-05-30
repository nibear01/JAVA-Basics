import java.util.HashMap;
import java.util.Scanner;

public class Hashmaps {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> scores = new HashMap<>();
        
        scores.put("Math", 100);
        scores.put("English", 90);
        scores.put("Bengali", 80);

        System.out.println("Before: "+scores.toString());
        scores.forEach((i,j)->{
            scores.replace(i, j-10);
        });
        System.out.println("After: "+scores.toString());


    }
}
