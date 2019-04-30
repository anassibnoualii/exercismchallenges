import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(IntStream.range(0,input+1).sum(),2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.range(0,input+1).map(value -> (int)Math.pow(value,2)).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
