package searchingQuestion;

public class LargestInArray {
    public static  int getLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        for(int index= 0;index<numbers.length;index++){
            if(largest<numbers[index]){
                largest = numbers[index];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,8,4};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
