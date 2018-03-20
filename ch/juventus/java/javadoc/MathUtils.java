package ch.juventus.java.javadoc;
import java.util.List;

/**
 *  MathUtil enables you to do addition, subtraction, division and multiplication
 *    @author : ${user}
 *    @since : ${date}
 */


public class MathUtils {

    /**
     * Adds the numbers together
     * @param numbers addends
     * @return sum
     */
    public double addition(List<Double> numbers){
        double result = 0;
        for ( double number : numbers ) {
            result +=number;
        }
        return  result;
    }

    /**
     * Subtracts a from b
     * @param a minuend
     * @param b subtrahend
     * @return difference
     */
    public double subtraction(double a, double b){
        return a - b;
    }

    /**
     *  divides a with b
     * @param a divided
     * @param b divisor
     * @return quotient
     */
    public double division(double a, double b){
        return a / b;
    }

    /**
     * mutltiplies a with b
     * @param a multiplier
     * @param b multiplicand
     * @return product
     */
    public double multiplication(double a, double b){
        return a*b;
    }
}
