import java.util.Scanner;

public class DecimalConvertion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNum = scanner.nextInt();

        
        System.out.print("\nBinary value is: ");
        int temp = decimalNum;
        StringBuilder binary = new StringBuilder();
        while (temp > 0) {
            binary.insert(0, temp % 2);
            temp = temp / 2;
        }
        System.out.println(binary.toString());

        
        System.out.print("Octal value is: ");
        temp = decimalNum;
        StringBuilder octal = new StringBuilder();
        while (temp > 0) {
            octal.insert(0, temp % 8);
            temp = temp / 8;
        }
        System.out.println(octal.toString());

        
        System.out.print("Hexadecimal value is: ");
        temp = decimalNum;
        StringBuilder hexadecimal = new StringBuilder();
        while (temp > 0) {
            int remainder = temp % 16;
            if (remainder < 10)
                hexadecimal.insert(0, remainder);
            else
                hexadecimal.insert(0, (char) ('A' + remainder - 10));
            temp = temp / 16;
        }
        System.out.println(hexadecimal.toString());
    }
}
