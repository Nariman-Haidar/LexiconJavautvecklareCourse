import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Temperaturomvandlare {
    /* Here we create an array list to save the five last temperatures.
    private static List <Float> lastFiveTemps = new ArrayList<>();
    public static void saveTemps(float temp){
    if(lastFiveTemps == 5){
    lastFiveTemps.remove(0);
    }
    else{
    lastFiveTemps.add(temp);
    }
    }

    */
    private static float[] lastFiveTemps = new float[5];

    private static int lastTempIndex = 0;
    public static float convertToFahrenheit(float temp) {
        return (temp * 9 / 5) + 32;
    }

    public static float convertToKelvin(float temp) {
        return temp + 273.15f;
    }

    // Save conversion history to a file
    public static void saveToFile(float temp, float tempInFahrenheit, float tempInKelvin) {
        try (FileWriter writer = new FileWriter("temperature_history.txt", true))
        { writer.write("Celsius: " + temp + ", Fahrenheit: " + tempInFahrenheit + ", Kelvin: " + tempInKelvin + "\n");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter temperature in Celsius: ");
            float temp = scanner.nextFloat();
            float tempInFahrenheit = convertToFahrenheit(temp);
            float tempInKelvin = convertToKelvin(temp);
            System.out.println("The temperature is " + tempInFahrenheit + " degrees Fahrenheit");
            System.out.println("The temperature is " + tempInKelvin + " Kelvin");
            // Save the temperature in the array
            saveTemp(temp);
            // Save conversion history to file
            saveToFile(temp, tempInFahrenheit,tempInKelvin);
            // Display the last five temperatures
            System.out.println("Last five temperatures in Celsius:");
            for (float t : lastFiveTemps) {
                System.out.println(t);
            } }


        // the average of the last five temperature
        float sum = 0;
        for(float t : lastFiveTemps) {
            sum += t;
        }
        float average = sum / lastFiveTemps.length;
        System.out.println("The average temperature of the last five temperatures is " + average + " degrees Celsius");
    }

    // Save the last five values of the temperature in an array
    public static void saveTemp(float temp) {
        lastFiveTemps[lastTempIndex] = temp;
        lastTempIndex = (lastTempIndex + 1) % lastFiveTemps.length;
    }

}




