import java.util.Scanner;

public class weightConvertor {
    public static void main(String[] args){

        // Weight Convertor Program

        double weight;
        double newWeight;
        int choice;

        System.out.println("\nWelcome to WEIGHT CONVERTOR PROGRAM ⚖️\n");
        System.out.println("Option 1: Convert weight from lbs to kgs");
        System.out.println("Option 2: Convert weight from kgs to lbs\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your choice (1/2): ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("\nYou chose lbs to kgs !");
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight after conversion is %.2f kgs\n", newWeight);
        } else if (choice == 2){
            System.out.println("\nYou chose kgs to lbs !");
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight after conversion is %.2f lbs\n", newWeight);
        } else{
            System.out.println("\nYou chose an invalid option !!");
        }

        System.out.println("\nThank you for using the CONVERTOR !");

        scanner.close();
    }
}
