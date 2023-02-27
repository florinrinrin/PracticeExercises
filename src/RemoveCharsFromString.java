public class RemoveCharsFromString {
    public static void main(String[] args) {

        //    It's pretty straightforward. Your goal is to create a function that removes
        //    the first and last characters of a string. You're given one parameter, the original string.
        //    You don't have to worry with strings with less than two characters.
        remove("eloquent");
        removeTwo("eloquent");

    }

    public static String remove (String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            result.append(str.charAt(i));
        }
        System.out.println(result.toString()); //for checking
        return result.toString();
    }

    public static String removeTwo (String str){
        System.out.println(str.substring(1,str.length()-1)); // for checking
        return str.substring(1,str.length()-1);
    }
}
