package edu.ti.caih313.recursion;

public class Recursion
{
    //compute the number of odd digits in a number
    public static int numberOfOddDigits(int number)
    {
        int oddDigits = 0;

        if (number == 0) {
            oddDigits = 0;
        } else if (number < 10) {
            if (number % 2 == 1) {
                oddDigits = 1;
            }
        } else {
            int current = number % 10;
            if (current % 2 == 1) {
                oddDigits = numberOfOddDigits(number/10) + 1;
            } else {
                oddDigits = numberOfOddDigits(number/10);
            }
        }
        return oddDigits;
    }

    public static int numberOfOddDigitsIterative(int number)
    {
        int oddDigits = 0;
        while (number > 0)
        {
            int current = number % 10;
            if (current % 2 == 1)
            {
                oddDigits++;
            }
            number = number/10;
        }
        return oddDigits;
    }

    //compute the sum of the digits in a positive number
    public static int sumOfDigitsPositiveNum(int number)
    {
        int sum;

        if (number == 0) {
            sum = 0;
        } else if (number < 10) {
            sum = number;
        } else {
            sum = sumOfDigitsPositiveNum(number/10) + (number % 10);
        }
        return sum;
    }

    //iterative solution to computing the sum of the digits of a positive number
    public static int sumOfDigitsIterative(int number)
    {
        int sum = 0;
        while (number > 0)
        {
            sum += number % 10;
            number = number/10;
        }
        return sum;
    }

    public static int tenToTheNPower(int n)
    {
        int value;
        if (n == 0)
        {
            value = 1;
        }
        else if (n == 1)
        {
            value = 10;
        }
        else if (n == 2)
        {
            value = 100;
        }
        else if (n % 2 == 0)
        {
            int valueHalf = tenToTheNPower(n/2);
            value = valueHalf * valueHalf;
        }
        else
        {
            int valueHalf = tenToTheNPower((n-1)/2);
            value = 10 * valueHalf * valueHalf;
        }
        return value;
    }

    public static int tenToTheNPowerIterative(int n)
    {
        int product = 10;
        if (n == 0)
        {
            product = 1;
        }
        else if (n == 1)
        {
            product = 10;
        }
        else
        {
            for (int i = 0; i < (n - 1); i++)
            {
                product = product * 10;
            }
        }
        return product;
    }


}