import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;

public class tempConvertor {
    public static void main(String[] args){

        // Temperature Convertor

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Welcome to TEMPERATURE CONVERTOR ♨️\n");

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the type of conversion (C/F): ");
        unit = scanner.nextLine().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("\n%.1f°%s", newTemp, unit);

        System.out.println("Thank you for using the Temperature Convertor !");

        scanner.close();
    }
}
