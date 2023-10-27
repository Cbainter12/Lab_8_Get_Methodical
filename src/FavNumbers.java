import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your Favorite Integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("You said your favorite integer was " + favInt + " and your favorite double was " + favDouble);
    }
}
