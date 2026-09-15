package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
//        for (int i = 1; i <= 100; i++) {

            // Find out which numbers divide i.
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        Result result = new Result(divisibleBy3, divisibleBy5);

        // Print our appropriate result.
        if (result.divisibleBy3() && result.divisibleBy5()) {

            System.out.println("Fizz Buzz");

        } else if (result.divisibleBy3()) {

            System.out.println("Fizz");

        } else if (result.divisibleBy5()) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }

    private record Result(boolean divisibleBy3, boolean divisibleBy5) {
    }
}
