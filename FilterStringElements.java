public class FilterStringElements implements Filter<String> {
    //method to filter strings
    public static String[] filter(String[] a, Filter f) {
       //adds to counter of accepted strings by iterating through array a to find required length
        int counter = 0;
        for (String n : a) {
            if (f.accept(n)) {
                counter++;
            }
        }
        //adds to array of strings to return if they are accepted by iterating through array a
        String[] strings = new String[counter];
        int index = 0;
        for (String n : a) {
            if (f.accept(n)) {
                strings[index++] = n;
            }
        }
        return strings;
    }

}
