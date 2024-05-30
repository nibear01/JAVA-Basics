
class LefHandPyramid{
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int sum = 0;

        for (int i =0; i<num.length; i++){
            sum += num[i];
            for (int j =0; j<i+1; j++){
                System.out.print(num[j]);
            }
            System.out.println();
        }
        System.out.printf("Sum is %d",sum);
    }
}
