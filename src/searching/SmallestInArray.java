package searching;

public class SmallestInArray {
    public static int getSmallest(int []numbers){
        int smallest = Integer.MAX_VALUE;
        for(int index =0;index<numbers.length;index++){
            if(smallest > numbers[index]){
                smallest = numbers[index];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int [] numbers = {0,1,-2,3,8,7,6};
        System.out.println("Smallest value is : " + getSmallest(numbers));
    }
}
