import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        if (fruit.equals("Mango")){
            System.out.println("King of Fruit");
        }
        else {
            System.out.println("Not mango");
        }


    }
}