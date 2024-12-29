

public class ValidationOfPersonalData {
    // a validation method for the personal data
    public static boolean validationPersonalFirstName(String firstName) {
        // validation for first name if Only letters and hyphens
        String namePattern = "^[a-zA-Z]";
        if(firstName.matches(namePattern)){
            return true;
        }

        //  validation for first name is not empty and at least two letters
        if (firstName == null || firstName.trim().isEmpty()) {
            System.out.println("First name is missing!");
            return false;
        }

        //  validation for first name at least two letters and does not contain digits.
        if (firstName.length() < 2 || firstName.length() > 50 || firstName.matches(".*\\d+.*")) {
            System.out.println("First name is invalid!");
            return false;
        }

        // validation for first name does not begin or end with a hyphen
        if(firstName.startsWith("-") || firstName.endsWith("-")) {
            System.out.println("First name cannot start or end with a hyphen!");
            return false;
        }

        return true;
    }

    public static boolean validationPersonalLastName(String lastName) {
        // validation for first name if Only letters and hyphens
        String namePattern = "^[a-zA-Z]";
        if(lastName.matches(namePattern)){
            return true;
        }

        //  validation for first name is not empty and at least two letters
        if (lastName == null || lastName.trim().isEmpty()) {
            System.out.println("First name is missing!");
            return false;
        }

        //  validation for first name at least two letters and does not contain digits.
        if (lastName.length() < 2 || lastName.length() > 50 || lastName.matches(".*\\d+.*")) {
            System.out.println("First name is invalid!");
            return false;
        }

        // validation for first name does not begin or end with a hyphen
        if(lastName.startsWith("-") || lastName.endsWith("-")) {
            System.out.println("First name cannot start or end with a hyphen!");
            return false;
        }

        return true;
    }

    public static boolean validationPersonalStreetName(String streetName) {
        // validation for street name
        if (streetName == null || streetName.trim().isEmpty()) {
            System.out.println("Street name is missing!");
            return false;
        }
        if (streetName.matches(".*\\d+.*")) {
            System.out.println("Street name is invalid!");
            return false;
        }
        return true;
    }

    // Street number only numbers and possibly a final letter
    public static boolean validationPersonalStreetNumber(String streetNumber) {
        if (streetNumber == null || streetNumber.trim().isEmpty()) {
            System.out.println("Street number is missing!");
            return false;
        }
        if (!streetNumber.matches("^[0-9]+$") && !streetNumber.matches("^[0-9]+[A-Za-z]$")) {
            System.out.println("Street number is invalid!");
            return false;
        }
        return true;
    }


    // validation for person id 10 digits, according to the format ######-####
    public static boolean validationPersonId ( String personId ) {

        if (!personId.matches("^\\d{6}-\\d{4}$")) {
            System.out.println("Person ID is invalid! It must be in the format ######-####.");
            return false;
        }
        return true;
    }


    public static void main(String[] args){
        /*
        //String firstName = "-John-Doe";
        //String firstName = "-John-Doe-";
        //String firstName = "John-Doe123";
        String firstName = "John-Doe";
        boolean isFirstNameValid = validationPersonalFirstName(firstName);
        System.out.println("Is the first name valid? " + isFirstNameValid);
         */

        /*
        //String lasttName = "-son-name";
        //String lasttName = "-son-name-";
        //String lasttName = "son-name123";
        String lasttName = "son-name";
        boolean isLastNameValid = validationPersonalLastName(lasttName);
        System.out.println("Is the first name valid? " + isLastNameValid);
         */

        /*
        //String streetName = "Main Street";
        String streetName = "123 Main Street";
        boolean isStreetNameValid = validationPersonalStreetName(streetName);
        System.out.println("Is the street name valid? " + isStreetNameValid);

         */

        /*
        //String streetNumber = "123";
        //String streetNumber = " 123-";
        //String streetNumber = "123abc";
        //String streetNumber = "123A";
        String streetNumber = "123a";
        boolean isStreetNumberValid = validationPersonalStreetNumber(streetNumber);
        System.out.println("Is the street number valid? " + isStreetNumberValid);
         */

        String validId = "811218-9876";
        String invalidId = "8112189877";
        System.out.println(validationPersonId(validId));   // Output: true
        System.out.println(validationPersonId(invalidId));

    }
}


