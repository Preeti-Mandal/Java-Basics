public class subString {
    public static void main(String args[]) {
        // Parcing
        String sentence = "Im learning Java";
        // subString(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

    }
    // Strings are Immutable(can't be modified further once declared)
}
