package searchingTypes.binarySearch;

public class StringBinarySearch {
    public static int binarySearch(String[] names, String key,
                                   int firstIndex, int lastIndex) {
        int index = Integer.MAX_VALUE;
        while (firstIndex <= lastIndex) {
            int middleIndex = firstIndex + ((lastIndex - firstIndex) / 2);
            if (names[middleIndex].equals(key)) {
                return middleIndex;
            } else if (names[middleIndex].compareTo(key) < 0) {
                firstIndex = middleIndex + 1;
            } else if (names[middleIndex].compareTo(key) > 0) {
                lastIndex = middleIndex - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String [] names = new String[]{"Hello","World!","Welcome","Java","Developer"};
        String key ="Java";
        System.out.println(binarySearch(names,key,0,names.length-1));
    }
}

