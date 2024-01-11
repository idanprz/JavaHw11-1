public class JavaRec {
    private static int add_rec(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return add_rec(num1 + 1, num2 - 1);
    }
    private static int sub_rec(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return sub_rec(num1 - 1, num2 - 1);
    }

    private static int mult_rec(int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }

        return num1 + mult_rec(num1, num2 - 1);
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 3;

        System.out.println(add_rec(num1, num2));
        System.out.println(sub_rec(num1, num2));
        System.out.println(mult_rec(num1, num2));
    }
}
