import java.util.*;
class Counting {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Enter amount of money.");
    System.out.print("Number of 20 dollar bills: ");
    int doll20 = console.nextInt();
    System.out.print("Number of 10 dollar bills: ");
    int doll10 = console.nextInt();
    System.out.print("Number of 5 dollar bills: ");
    int doll5 = console.nextInt();
    System.out.print("Number of 2 dollar bills: ");
    int doll2 = console.nextInt();
    System.out.print("Number of 1 dollar bills: ");
    int doll = console.nextInt();
    System.out.print("Number of Quarters: ");
    int quarters = console.nextInt();
    System.out.print("Number of Dimes: ");
    int dimes = console.nextInt();
    System.out.print("Number of Nickles: ");
    int nickles = console.nextInt();
    System.out.print("Number of Pennies: ");
    int pennies = console.nextInt();
    System.out.print("Any extra dollars: ");
    int extra = console.nextInt();
    double amount = doll20 * 20 + doll10 * 10 + doll5 * 5 + doll2 * 2 + doll + quarters * 0.25 + dimes * 0.1 + nickles * 0.05 + pennies * 0.01 + extra;
    System.out.println("You have $" + amount);
  }
}
