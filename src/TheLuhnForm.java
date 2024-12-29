import java.util.Scanner;

public class TheLuhnForm {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scn = new Scanner(System.in);

        // Array of prompts for the user
        String[] prompts = { "first name", "last name", "street name", "street number", "person number" };

        // Array of method names for validation
        String[] methods = { "validationPersonalFirstName", "validationPersonalLastName",
                "validationPersonalStreetName", "validationPersonalStreetNumber", "validationPersonId" };

        // Iterate through each prompt
        for (int i = 0; i < prompts.length; i++) {
            while (true) {
                try {
                    // Prompt the user to enter information
                    System.out.print("Enter your " + prompts[i] + ": ");

                    // Read user input
                    String input = scn.nextLine();

                    // Validate the input based on the current prompt
                    switch (methods[i]) {
                        case "validationPersonalFirstName" :
                            validationPersonalFirstName(input);
                            break;

                        case "validationPersonalLastName" :
                            validationPersonalLastName(input);
                            break;

                        case "validationPersonalStreetName" :
                            validationPersonalStreetName(input);
                            break;

                        case "validationPersonalStreetNumber" :
                            validationPersonalStreetNumber(input);
                            break;

                        case "validationPersonId" :
                            validationPersonId(input);
                            break;
                    }

                    // Exit loop if input is valid
                    break;

                } catch (Exception e) {
                    // Handle validation exceptions
                    System.out.println("Incorrect " + prompts[i] + ". ");
                    System.out.print("Do you want to try again? (y/n): ");

                    // Read user choice to continue or exit
                    String choice = scn.nextLine();

                    if (choice.equalsIgnoreCase("n")) {
                        System.out.println("Exiting...");
                        return;    // Exit program
                    }
                }
            }
        }
    }

    // Method to validate the person ID
    public static void validationPersonId(String personId) throws Exception {
        if (!personId.matches("^\\d{6}-\\d{4}$")) {
            throw new Exception("Person ID is invalid! It must be in the format ######-####.");
        }
    }

    // Method to validate the first name (only letters allowed)
    public static void validationPersonalFirstName(String firstName) throws Exception {
        if (!firstName.matches("[A-Za-z]+")) {
            throw new Exception("Invalid first name. Only letters are allowed.");
        }
    }

    // Method to validate the last name (only letters allowed)
    public static void validationPersonalLastName(String lastName) throws Exception {
        if (!lastName.matches("[A-Za-z]+")) {
            throw new Exception("Invalid last name. Only letters are allowed.");
        }
    }

    // Method to validate the street name (must include digits)
    public static void validationPersonalStreetName(String streetName) throws Exception {
        if (!streetName.matches(".*\\d+.*")) {
            throw new Exception("Street name is invalid!");
        }
    }

    // Method to validate the street number (only digits or digits followed by a letter allowed)
    public static void validationPersonalStreetNumber(String streetNumber) throws Exception {
        if (!streetNumber.matches("^[0-9]+$") && !streetNumber.matches("^[0-9]+[A-Za-z]$")) {
            throw new Exception("Street number is invalid!");
        }
    }
}

/*
int sum = 0;
for (int i = 0; i < number.length(); i++) {
    int digit = Character.getNumericValue(number.charAt(i));
    if (i % 2 == 0) { // Multiplicera siffror på jämna positioner (0-baserat)
        digit *= 2;
        if (digit > 9) {
            digit -= 9;
        }
    }
    sum += digit;
}
return sum % 10 == 0;
}
*/

/*
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    while (true) {
        try {
            System.out.print("Enter your first name: ");
            String firstName = scn.nextLine();
            validationPersonalFirstName(firstName);
            break;
        } catch (Exception e) {
            System.out.println("Incorrect First Name. ");
            System.out.println("Do You want to try again? (y/n): ");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("n")) {
                System.out.println("Exiting..........");
                return;
            }
        }
    }
    while (true) {
        try{
            System.out.print("Enter your last name: ");
            String lastName = scn.nextLine();
            validationPersonalLastName(lastName);
            break;
        }
        catch (Exception e) {
            System.out.println("Incorrect Last Name. ");
            System.out.println("Do You want to try again? (y/n): ");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("n")) {
                System.out.println("Exiting..........");
                return;
            }
        }
    }
    while(true){
        try{
            System.out.println("Enter the Street Name: ");
            String streetName = scn.nextLine();
            validationPersonalStreetName(streetName);
            break;
        }
        catch(Exception e){
            System.out.println("Incorrect Street Name!");
            System.out.println("Do You want to try again? (y/n): ");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("n")){
                System.out.println("Exiting..........");
                return;
            }
        }
    }

    while(true){
        try{
            System.out.println("Enter the Street Number: ");
            String streetNumber = scn.nextLine();
            validationPersonalStreetNumber(streetNumber);
            break;
        }
        catch(Exception e){
            System.out.println("Incorrect Street Number!");
            System.out.println("Do You want to try again? (y/n): ");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("n")){
                System.out.println("Exiting..........");
                return;
            }
        }
    }

    while(true){
        try{
            System.out.println("Enter You Person Number: ");
            String personNumber = scn.nextLine();
            validationPersonId(personNumber);
            break;
        }
        catch(Exception e){
            System.out.println("Incorrect Person Number!");
            System.out.println("Do You want to try again? (y/n): ");
            String choice = scn.nextLine();
            if(choice.equalsIgnoreCase("n")){
                System.out.println("Exiting..........");
                return;
            }
        }
    }
}
*/
