package runner;

import exceptions.InvalidNumberException;
import utils.HelperUtils;

public class Runner {
    public static void main(String[] args) {
        try {
            int[] digits = HelperUtils.readTenDigitsFromFile("src/main/resources/testfile");
            for (int digit : digits) {
                System.out.print(digit);
            }
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("\n" + HelperUtils.getSumOfArray(array));
    }
}
