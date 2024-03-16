package searchingTypes.binarySearch;

public class RecurssiveBinarySearch {
    public static int binarySearch(int [] number,int key,
                                   int firstIndex,int lastIndex){
        int middleIndex = firstIndex + ((lastIndex -firstIndex) / 2);
        if(lastIndex < firstIndex) {
            return -1;
        }
        else if (key == number[middleIndex]){
            return middleIndex;
        }
        else if ( key < number[middleIndex]) {

            return binarySearch(number,key,firstIndex,middleIndex-1);
        }
        else
        {
            return binarySearch(number,key,middleIndex+1,lastIndex);
        }
    }
    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,3,4,3,5,3,6};
        int key = 5;
        int search = binarySearch(numbers,key,0,numbers.length-1);
        if(search == -1){
            System.out.println("Key Is Not Found");
        }else{
            System.out.println("Key Is At Index : "+search );
        }
    }
}


