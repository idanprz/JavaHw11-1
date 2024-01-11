public class JavaOperators {
    public static void main(String[] args) {
        String fruit = "strawberry";

        switch (fruit) {
            case "apple":
                break;
            case "banana":
                break;
            case "orange":
                break;
            case "mango":
                break;
            default:
                fruit = "Sorry, can’t find a fruit with that name";
        }

        System.out.println(fruit);
    }
}
