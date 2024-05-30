
public class ForLoops {
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5};
        char vowels[] = {'a','e','i','o','u'};

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();
        for (int j = 0; j < (numbers.length)-2; j++){
            System.out.println(vowels[j]);
        }

    }
}
