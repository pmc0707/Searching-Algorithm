package searchingTypes.binarySearch;



public class StringIntegerBinarySearch {
    int rollNumber;
    String name;

    public StringIntegerBinarySearch(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentBinarySearch{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }
}

class Searcher {
    public static int search(StringIntegerBinarySearch[] names, int key) {
        for (int index = 0; index < names.length; index++) {
            if (names[index].rollNumber == key) {
                return index;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        StringIntegerBinarySearch[] names = new StringIntegerBinarySearch[]{
                new StringIntegerBinarySearch(9, "Lala ji"),
                new StringIntegerBinarySearch(6, "Aman"),
                new StringIntegerBinarySearch(10, "Abhay"),
                new StringIntegerBinarySearch(2, "radhe"),
                new StringIntegerBinarySearch(1, "Abhishek")};
        int key = 10;
        int index = search(names, key);
        if (index != -1) {
            System.out.println("Student found at index : " + index);
            System.out.println("Student details : " + names[index]);
        } else {
            System.out.println("Student not found");
        }
    }
}