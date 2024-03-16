package searchingTypes.linearSearch;

public class StringLinearSearch {
    public int linearSearch(String [] names, String key){
        for (int index = 0; index < names.length; index++) {
            if(names[index].equals(key)){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = new String[]{
                "Apple","Papaya","Mango","Cauliflower"
        };
        StringLinearSearch stringLinearSearch = new
                StringLinearSearch();
        int search = stringLinearSearch.linearSearch(names,"Mango");
        System.out.println("At position : "+search);
    }
}

