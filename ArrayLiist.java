import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayLiist {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(5);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(1);
        
        List<Integer> num2 = new ArrayList<>(num);
      
        num2.add(6);
        num2.add(7);
        System.out.println(num2.toString());

        System.out.println("before: " + num.toString());

        num.forEach(i -> {
            int idx = num.indexOf(i);
            num.set(idx, i*2);
            System.out.println(i);
            //System.out.println("Index :"+ num.indexOf(i));
        });


        num.sort(Comparator.naturalOrder());
        System.out.println("After: " + num.toString());


    }
}
