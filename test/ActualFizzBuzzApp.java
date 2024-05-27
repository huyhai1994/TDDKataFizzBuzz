import org.junit.Assert;
import org.junit.Test;

public class ActualFizzBuzzApp {
    @Test
    public void fizzBuzzTest(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz",fizzBuzz.covert(5));
        Assert.assertEquals("Fizz",fizzBuzz.covert(3));
        Assert.assertEquals("FizzBuzz",fizzBuzz.covert(15));
        Assert.assertEquals("1",fizzBuzz.covert(1));
        Assert.assertEquals("2",fizzBuzz.covert(2));
        Assert.assertEquals("4",fizzBuzz.covert(4));
        Assert.assertEquals("7",fizzBuzz.covert(7));
        Assert.assertEquals("8",fizzBuzz.covert(8));
//        Assert.assertEquals("10",fizzBuzz.covert(10));
        Assert.assertEquals("13",fizzBuzz.covert(13));
        Assert.assertEquals("14",fizzBuzz.covert(14));
        Assert.assertEquals("16",fizzBuzz.covert(16));
        Assert.assertEquals("17",fizzBuzz.covert(17));
        Assert.assertEquals("19",fizzBuzz.covert(19));

    }
}
