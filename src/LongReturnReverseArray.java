import java.util.Arrays;

public class LongReturnReverseArray {
    public static void main(String[] args) {
        digitize1(352231);
        digitize2(352231);
    }

    public static int[] digitize1(long n) {
        String stringN = String.valueOf(n);
        int[] integerN = new int[stringN.length()];
        for (int i = stringN.length()-1; i>=0;i--){
            integerN[stringN.length()-1-i]=((int) stringN.charAt(i)-48); //deducting the ascii value of char 0 (48)
            System.out.println("Value of integerN is now: " + Arrays.toString(integerN));
        }
        System.out.println(Arrays.toString(integerN));
        return integerN;
    }

    public static int[] digitize2(long n){
        String stringN = String.valueOf(n);
        int[] intN = new int[stringN.length()];
        char[] charN = stringN.toCharArray();
        for (int i = 0; i < charN.length; i++){
            intN[i] = Character.getNumericValue(charN[charN.length - 1 - i]);
        }
        System.out.println(Arrays.toString(intN));
        return intN;
    }


}
