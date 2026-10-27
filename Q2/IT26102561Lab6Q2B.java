import java.util.Scanner;
public class IT26102561Lab6Q2B {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers: ");

        int count = 1;
        String numbers = "";

        while (count <= 10){
            System.out.print("Enter number " + count + ": ");
            int num = input.nextInt();
            numbers = numbers + num + " ";
            count++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers);
    }
}
