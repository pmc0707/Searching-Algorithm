package searchingTypes.binarySearch;

public class BinarySearch {
    public static int binarySearch(int [] numbers,int key){
        int start = 0,end = numbers.length-1;
        while(start <= end){
            int middle = (start+end)/2;
            if(numbers[middle] == key){
                return middle;

            }
            if (numbers[middle] < key){
                start = middle+1;
            }
            else {
                end = middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] numbers = new int[]{0,2,5,3,8,10,11};
        int key = 10;
        System.out.println(binarySearch(numbers,key));

    }
}
