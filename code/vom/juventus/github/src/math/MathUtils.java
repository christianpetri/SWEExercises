package code.vom.juventus.github.src.math;

import java.util.List;

public class MathUtils {

    public Double addition(List<Double> numbers) {
        Double result = 0d;

        for(Double number : numbers) {
            result += number;
        }

        return result;
    }

    public Double subtraction(Double a, Double b) {
        Double result = a-b;
        return result;
    }

    public Double multiplication(Double a, Double b) {
        Double result = a*b;
        return result;
    }

    public Double division(Double a, Double b) {
        Double result = a/b;
        return result;
    }

    public Double exponential(Double base, Double exp) {
        Double result = base;

        for (int i = 1; i < exp; i++) {
            result *= base;
        }

        return result;
    }

    public Double squareRoot(Double number) {
        return Math.sqrt(number);
    }

}
