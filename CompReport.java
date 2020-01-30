public class CompReport {
    public static void main(String[] args) {
        // Creating integer array
        int[] myArray = { 3, 5, 7, 6, 3, 2, 9 };
        // Setting the sum variable globally
        int sum = 0;
        // for Loop to create total of indexes
        for (int i : myArray)
            sum += i;
        System.out.println(sum); // Printing the total

        // for Loop to find the number 7 and print the message
        for (int i : myArray)
            if (i == 7) {
                System.out.println("Hi Everyone!");
            }
    }
}