public class PrimitiveVariable {
    public static void main(String[] args) {
        char c = 'a';
        byte b = 1;
        int i = 10;
        double d = 25.5;
        boolean bool = true;

        System.out.println(c + " " + b + " " + i + " " + d + " " + bool);

        byte narrow = (byte) d;
        System.out.println("narrowing: " + narrow);

        double wide = b;
        System.out.println("widening: " + wide);
    }
}
