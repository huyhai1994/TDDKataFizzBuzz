import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConveterLeavesNormalNumbersAlone(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("1",fizzBuzz.covert(1));
        Assert.assertEquals("2",fizzBuzz.covert(2));
    }
    @Test
    public void fizzBuzzConverterToMultipleNumberOfThree(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Fizz",fizzBuzz.covert(3));
    }
    @Test
    public void fizzBuzzConverterToMultipleOfFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("Buzz",fizzBuzz.covert(5));
    }
    @Test
    public void multipleOfBothThreeAndFive(){
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assert.assertEquals("FizzBuzz",fizzBuzz.covert(15));
    }



}
