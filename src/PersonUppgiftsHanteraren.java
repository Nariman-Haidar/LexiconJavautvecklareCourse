

public class PersonUppgiftsHanteraren {

    // Declare variables for the following personal data
    String  firstName;
    String middleName;
    String  lastName;
    int     age;
    double  height;
    double  weight;
    boolean isStudent;

    // A method that calculates BMI (use weight and height as parameters)
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // calculateBMICategory: Take BMI as parameer Use if-else if chain for different BMI Return weight category as String
    public String calculateBMICategory(double BMI) {
        if (BMI < 18.5) {
            return "Underweight";
        } else if ((BMI >= 18.5) && (BMI < 25)) {
            return "Normal weight";
        } else if ((BMI >= 25) && (BMI < 30)) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // method to checkPersonStatus: Take age as parameter
    public String checkPersonStatus(int age) {
        if (age < 12) {
            return "Child";
        } else if ((age > 12) && (age < 18)) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    // A method that takes length as parameter and returns length in both meters and centimeters as a String
    public String convertLength(double height) {
        return height + " meters " + (height * 100) + " centimeters";
    }

    // createAgeStatistics: Take age as parameter Use for-loop to display year and age for the next 10 years Print the forecast

    /*
     *
     * public String createAgeStatistics(int age){
     *
     *   String result = "";
     *
     *   for(int i = 0; i < 10; i++) {
     *       int futureAge = i + age;
     *       result += "Your current age is: " + age + " Your age in the next ten years is: " + futureAge + "\n";
     *   }
     *
     *   return result;
     *
     * }
     *
     */
    public String createAgeStatistics(int age) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int futureAge = i + age;

            result.append("Your current age is: ")
                    .append(age)
                    .append(" Your age in the next ten years is: ")
                    .append(futureAge)
                    .append("\n");
        }

        return result.toString();
    }

    /*
    checkNameFormat: Take name as parameter
    Use switch to handle different
    formats: first name only first and last name first, middle and last name
     */
    public String checkNameFormat(String firstNme) {
        // Trim to remove any leading or trailing whitespaces
        String[] parts = firstName.trim().split(" ");

        switch (parts.length) {
            case 1:
                // First name only
                return parts[0];

            case 2:
                // First and last name
                return parts[0] + " " + parts[1];

            case 3:
                // First, middle, and last name
                return parts[0] + " " + parts[1] + " " + parts[2];

            default:
                // More than 3 names or no name
                return "Invalid name format";
        }
    }

    /*
    countVowels: Take a name as parameter
    Use while-loop to iterate through each letter
    Count number vowels
     */
    public int countVowels(String name) {
        int count = 0;
        int index = 0;

        while (index < name.length()) {
            char c = Character.toLowerCase(name.charAt(index));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }

            index++;
        }

        return count;
    }

    public static void main(String[] args) {
        PersonUppgiftsHanteraren person = new PersonUppgiftsHanteraren();

        person.firstName = "John Smith Son";
        person.middleName = "Smith";
        person.lastName  = "Son";
        person.age       = 15;
        person.height    = 1.7;
        person.weight    = 70;
        person.isStudent = true;
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Is legal age: " + person.isLegalAge(person.age));
        System.out.println("BMI: " + person.calculateBMI(person.weight, person.height));
        System.out.println("Length in meters and centimeters: " + person.convertLength(person.height));
        System.out.println("Status of person " + person.checkPersonStatus(person.age));
        System.out.println("BMI category: " + person.calculateBMICategory(person.calculateBMI(person.weight,
                person.height)));
        System.out.println(person.createAgeStatistics(person.age));
        System.out.println(person.checkNameFormat(person.firstName));
        System.out.println(person.countVowels(person.firstName));

    }

    // method that take first name and last name as a parameter and then returns the full name
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // method that takes age as parameter and returns whether the person is of legal age (boolean)
    public boolean isLegalAge(int age) {
        if (age < 18) {
            return false;
        } else {
            return true;
        }
    }
}

/*
 // Declare variables for the following personal data with Combining Text with Variables

        String firstName = "John";
        System.out.println("first name" + firstName);
        String lastName = "Son";
        System.out.println("Last name" + lastName);
        int age = 15;
        System.out.println("Age " + age);
        System.out.println("Age " + age + 5 );
        double length = 1.7;
        System.out.println("Length " + length+ 1);
        double weight= 70;
        System.out.println("Weight " + weight );
        boolean isStudent = true;
        System.out.println("Is student " + isStudent);

        //Printing Variables Directly
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(length);
        System.out.println(weight);
        System.out.println(isStudent);

        // Calculate the person's age in 5 years
        System.out.println("In 5 years, John will be " + (age + 5) + " years old.");
        // Convert the length to centimeters
        double lengthInCentimeter = length * 100;
        System.out.println("John's length in centimeters is " + lengthInCentimeter + " cm.");
 */





