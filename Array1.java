import java.util.Arrays;

class Array1 {
    public static void main(String[] args) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        
        vowels[0] = 'x';
        System.out.println(Arrays.toString(vowels)); // Unordered
        System.out.println(vowels.length);

        Arrays.sort(vowels);   // will make all the letters ordered
        int numbers[] = {1,2,3,4,5};
        
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(vowels)); // will return ordered array
        System.out.println(numbers.length);

        char letters[] = new char[10];

        Arrays.fill(letters, 'a');
        System.out.println(Arrays.toString(letters));

        letters[5] = 'x';
        letters[6] = 'z';
        letters[7] = 'y';
        System.out.println(Arrays.toString(letters));

        Arrays.sort(letters, 5, 8);
        System.out.println(Arrays.toString(letters));

        System.out.println(Arrays.binarySearch(letters, 'x'));

        String words[] = {"hello","world"};
        System.out.println(words[0]);
        

    }
}
