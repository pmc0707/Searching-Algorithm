package searchingTypes.linearSearch;

import java.util.Arrays;

public class StringIntegerLinearSearch {
    String names;
    int rollNumber;

    public StringIntegerLinearSearch(String names,int rollNumber) {
        this.names = names;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "StringIntegerLinearSearch{" +
                "names='" + names + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
class Sorting{
    public void sort(StringIntegerLinearSearch [] names){
        for (int counter = 0; counter < names.length; counter++) {
            for (int index = 0; index < names.length-1; index++) {
                if(names[index].rollNumber > names[index+1].rollNumber){
                    StringIntegerLinearSearch temp = names[index];
                    names[index] = names[index+1];
                    names[index+1] = temp;
                }
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        StringIntegerLinearSearch [] stringIntegerLinearSearches =
                new StringIntegerLinearSearch[]{
                        new StringIntegerLinearSearch("Kman",2),
                        new StringIntegerLinearSearch("Naman",1)
                };
        System.out.println(Arrays.toString(stringIntegerLinearSearches));
        Sorting student = new Sorting();
        student.sort(stringIntegerLinearSearches);
        System.out.println(Arrays.toString(stringIntegerLinearSearches));
    }
}
