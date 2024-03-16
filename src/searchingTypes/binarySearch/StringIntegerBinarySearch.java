package searchingTypes.binarySearch;

public class StringIntegerBinarySearch {
    public static int binarySearch(String [] names ,int key ,
                                   int firstIndex,int lastIndex){
        int index = Integer.MAX_VALUE;
        while (firstIndex <= lastIndex){
            int middleIndex = firstIndex + ((lastIndex -firstIndex)/2);
            if(names[middleIndex].equals(key)){
                return middleIndex;
            } else if (names[middleIndex].compareTo(String.valueOf(key)) < 0) {
                return middleIndex;
            } else if (names[middleIndex].compareTo(String.valueOf(key))>0) {
                lastIndex = middleIndex -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        String [] names = new String[]{new StringBinarySearch().toString()};
        int key = 2;
        System.out.println(binarySearch(names,key,0,names.length-1));
    }
}
