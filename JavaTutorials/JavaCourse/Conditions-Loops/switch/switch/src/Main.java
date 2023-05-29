import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Apple":
                System.out.println("Apple Fruit");
                break;
            default:
                System.out.println("Default Case");
        }
    }
}