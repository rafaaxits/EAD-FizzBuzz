import com.puc.minas.execution.FizzBuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzTest {
    /*
     * {1, 2, 3, 5, 6, 10 , 15, 30}
     * X % 3 = 0 = "Fizz"
     * X % 5 = 0 = "Buzz"
     * X % 3 = 0 && X % 5 = 0 = "FizzBuzz"
     * X % 3 != 0 || X % 5 != 0 = "Retornar o numero"
     * X == char = "-1"
     * */

    FizzBuzz fizzBuzz = new FizzBuzz();
    ArrayList<Integer> numberList = new ArrayList<>();

    @Before
    public void setUp(){
        numberList = new ArrayList<>();
        Integer numbers[] = {1, 2, 3, 5, 6, 10, 15, 30};
        // “1, 2, Fizz, Buzz, Fizz, Buzz, FizzBuzz, Fizzbuzz”
        numberList.addAll(Arrays.asList(numbers));
    }

    @Test
    public void numbersNonDivisibleBy3And5() {
        Assert.assertEquals("1", fizzBuzz.convertElement(numberList.get(0)));
        Assert.assertEquals("2", fizzBuzz.convertElement(numberList.get(1)));
    }

    @Test
    public void numbersDivisibleBy3() {
        Assert.assertEquals("Fizz", fizzBuzz.convertElement(numberList.get(2)));
        Assert.assertEquals("Fizz", fizzBuzz.convertElement(numberList.get(4)));
    }

    @Test
    public void numbersDivisibleBy5() {
        Assert.assertEquals("Buzz", fizzBuzz.convertElement(numberList.get(3)));
        Assert.assertEquals("Buzz", fizzBuzz.convertElement(numberList.get(5)));
    }

    @Test
    public void numbersDivisibleBy3And5() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.convertElement(numberList.get(6)));
        Assert.assertEquals("FizzBuzz", fizzBuzz.convertElement(numberList.get(7)));
    }
}
