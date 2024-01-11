import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaMath {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random() * 6);
        int rand2 = (int) (Math.random() * 6);

        if (rand1 == rand2) {
            System.out.printf("%d is equal to %d%n", rand1, rand2);
        }
        else {
            System.out.printf("%d is not equal to %d%n", rand1, rand2);
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(now.format(formatter));
    }
}
