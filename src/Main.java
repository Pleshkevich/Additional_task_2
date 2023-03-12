import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int A = 100;
        int B = 55;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qty product A: ");
        int Qty_A = sc.nextInt();
        System.out.print("Qty product B: ");
        int Qty_B = sc.nextInt();
        if ((Qty_A > 0)&&(Qty_B > 0)) {
            System.out.println("Total amount = " + (((A * Qty_A) + (B * Qty_B)) * 0.90));
            System.out.println("Discount = " + ((((A * Qty_A) + (B * Qty_B))) - (((A * Qty_A) + (B * Qty_B)) * 0.90)));
        }
        else {
            System.out.println("Total amount = " + ((A * Qty_A) + (B * Qty_B)));
        }

    }
}