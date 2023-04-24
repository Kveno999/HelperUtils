package utils;

import exceptions.InvalidNumberException;
import lombok.experimental.UtilityClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@UtilityClass
public class HelperUtils {

    public static int[] readTenDigitsFromFile(String fileName) throws InvalidNumberException {
        int[] digits = new int[10];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            for (int i = 0; i < 10; i++) {
                int numericValue = 0;
                try {
                    int digit = reader.read();
                    numericValue = Character.getNumericValue((char) digit);
                } catch (NumberFormatException e)  {
                    System.out.println(e.getMessage());
                }
                if (numericValue < 0) {
                    throw new InvalidNumberException("File contains negative numbers or has less than 10 digits!");
                }
                digits[i] = numericValue;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return digits;
    }

    public static int getSumOfArray(int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                sum += array[i];
            } catch (ArithmeticException e) {
                throw  new ArithmeticException(String
                        .format("Exception while adding new element:: %s to last elements sum:: %s", sum, i));
            }
        }
        return sum;
    }

}
