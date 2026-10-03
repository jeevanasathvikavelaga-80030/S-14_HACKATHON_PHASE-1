import java.util.Scanner;

public class Hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter water consumption in litress: ");
        double consumption = sc.nextDouble();
        if (consumption <= 500) {
            System.out.println("Water Bill: RS.100");
        } else {
            System.out.println("Water Bill: Rs.200");

        }
    }
}