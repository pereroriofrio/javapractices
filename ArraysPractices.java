public class ArraysPractices {
    public static void main(String[] args){
        int[] numbers = {1,12,3,4,5,6,2,1,19};
        int x = 0;
        for (int i = 0; i < numbers.length ; i ++){
            if (numbers[i] > x){
                x = numbers[i];
            }
        }
        System.out.println(x);

    }
}
