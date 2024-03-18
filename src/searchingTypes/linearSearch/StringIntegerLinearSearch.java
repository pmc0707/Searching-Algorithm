package searchingTypes.linearSearch;

public class StringIntegerLinearSearch {
    int rollNumber;
    String name;

    public StringIntegerLinearSearch(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentLinearSearch{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + '}';
    }
}

class Searcher {
    public static void main(String[] args) {
        StringIntegerLinearSearch[] names = new StringIntegerLinearSearch[]{
                new StringIntegerLinearSearch(9, "Ram"),
                new StringIntegerLinearSearch(3, "Akash"),
                new StringIntegerLinearSearch(1, "Abhishek")};
        int key = 3;
        int index = search(names, key);
        if (index != -1) {
            System.out.println("Student found at index : " + index);
            System.out.println("Student details: " + names[index]);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static int search(StringIntegerLinearSearch[] name, int key) {
        for (int index = 0; index < name.length; index++) {
            if (name[index].rollNumber == key) {
                return index;
            }
        }
        return -1;
    }
}