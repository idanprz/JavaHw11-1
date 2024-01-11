
public class HwOverloadRecursion {

    private static int combine(int int1, int int2) {
        return Integer.parseInt((Integer.toString(int1) + Integer.toString(int2)));
    }
    private static String combine(String str1, String str2) {
        return str1 + str2;
    }

    // assumes max >= min
    private static String getRange(int min, int max) {
        if (max <= min) {
            return Integer.toString(min);
        }

        return Integer.toString(min) + " " + getRange(min + 1, max);
    }

    // assumes max >= min

    private static int mulRange(int min, int max) {
        if (max <= min) {
            return min;
        }

        return min * mulRange(min + 1, max);
    }

    public static void main(String[] args) {
        System.out.print("Co mbine strings: " + combine("hello ", "world"));
        System.out.print("\n");
        System.out.print("Combine integers: " + combine(123, 456));
        System.out.print("\n");
        System.out.print("Range between 4 to 8: " + getRange(4, 8));
        System.out.print("\n");
        System.out.print("Range between 2 to 4: " + mulRange(2, 4));
        System.out.print("\n");
    }
}
