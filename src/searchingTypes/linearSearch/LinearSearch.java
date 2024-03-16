package searchingTypes.linearSearch;



public class LinearSearch {
    public static int linearsearch(int[] numbers, int key) {
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == key) {
                return index ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int index1 = linearsearch(numbers, key);
        if (index1 == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + index1);
        }
    }
}
