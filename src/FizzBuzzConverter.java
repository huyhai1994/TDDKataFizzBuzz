public class FizzBuzzConverter {
    public String covert(int toConvertToFizzBuzz) {
        if (toConvertToFizzBuzz % 15 == 0)
            return "FizzBuzz";
        if (toConvertToFizzBuzz % 5 == 0)
            return "Buzz";
        if (toConvertToFizzBuzz % 3 == 0)
            return "Fizz";
        return String.valueOf(toConvertToFizzBuzz);
    }
}
