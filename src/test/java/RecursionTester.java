import edu.ti.caih313.recursion.Recursion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTester
{
    @Test
    public void testNumberOfOddDigits()
    {
        Recursion test = new Recursion();

        //Testing number = 0
        int testZero = test.numberOfOddDigits(0);
        assertEquals(0, testZero);

        //Testing odd number less than ten
        int testLessThanTenOdd = test.numberOfOddDigits(5);
        assertEquals(1, testLessThanTenOdd);

        //Testing even number less than ten
        int testLessThanTenEven = test.numberOfOddDigits(6);
        assertEquals(0, testLessThanTenEven);

        //Testing number
        int testNumber = test.numberOfOddDigits(325);
        assertEquals(2, testNumber);
    }

    @Test
    public void testNumberOfOddDigitsIterative()
    {
        Recursion test = new Recursion();

        //Testing number = 0
        int testZero = test.numberOfOddDigitsIterative(0);
        assertEquals(0, testZero);

        //Testing odd number less than ten
        int testLessThanTenOdd = test.numberOfOddDigitsIterative(5);
        assertEquals(1, testLessThanTenOdd);

        //Testing even number less than ten
        int testLessThanTenEven = test.numberOfOddDigitsIterative(6);
        assertEquals(0, testLessThanTenEven);

        //Testing number
        int testNumber = test.numberOfOddDigitsIterative(325);
        assertEquals(2, testNumber);
    }

    @Test
    public void testSumOfDigitsPositiveNum()
    {
        Recursion test = new Recursion();

        //Testing number = 0
        int testZero = test.sumOfDigitsPositiveNum(0);
        assertEquals(0, testZero);

        //Testing number less than ten
        int testLessThanTen = test.sumOfDigitsPositiveNum(6);
        assertEquals(6, testLessThanTen);

        //Testing number
        int testNumber = test.sumOfDigitsPositiveNum(321);
        assertEquals(6, testNumber);
    }

    @Test
    public void testSumOfDigitsIterative()
    {
        Recursion test = new Recursion();

        int tester = test.sumOfDigitsIterative(321);
        assertEquals(6, tester);

        tester = test.sumOfDigitsIterative(0);
        assertEquals(0, tester);

        tester = test.sumOfDigitsIterative(100);
        assertEquals(1, tester);
    }

    @Test
    public void testTenToTheNPower()
    {
        Recursion test = new Recursion();

        //Testing n = 0
        int testZero = test.tenToTheNPower(0);
        assertEquals(1, testZero);

        //Testing n = 1
        int testOne = test.tenToTheNPower(1);
        assertEquals(10, testOne);

        //Testing n = 2
        int testTwo = test.tenToTheNPower(2);
        assertEquals(100, testTwo);

        //Testing an even number
        int testEven  = test.tenToTheNPower(6);
        assertEquals(1000000, testEven);

        //Testing an odd number
        int testOdd  = test.tenToTheNPower(5);
        assertEquals(100000, testOdd);
    }

    @Test
    public void testTenToTheNPowerIterative()
    {
        Recursion test = new Recursion();

        //Testing n = 0
        int testZero = test.tenToTheNPowerIterative(0);
        assertEquals(1, testZero);

        //Testing n = 1
        int testOne = test.tenToTheNPowerIterative(1);
        assertEquals(10, testOne);

        //Testing n = 2
        int testTwo = test.tenToTheNPowerIterative(2);
        assertEquals(100, testTwo);

        //Testing an even number
        int testEven  = test.tenToTheNPowerIterative(6);
        assertEquals(1000000, testEven);

        //Testing an odd number
        int testOdd  = test.tenToTheNPowerIterative(5);
        assertEquals(100000, testOdd);
    }
}
