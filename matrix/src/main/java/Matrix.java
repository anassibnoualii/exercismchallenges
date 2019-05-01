import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Matrix {

    private static final String ROWS_SPLITTER = "\n";
    private static final String COLUMN_SPLITTER = " ";
    private List<List<Integer>> internalMatrix;

    Matrix(String matrixAsString) {
        internalMatrix = Stream.of(matrixAsString.split(ROWS_SPLITTER))
                .map( Matrix::splitRow )
                .collect(toList());
        isValidMatrixFormat();

    }

    private static List<Integer> splitRow(String s) {
        return Stream.of(s.split(COLUMN_SPLITTER))
                .map(Integer::valueOf)
                .collect(toList());
    }
    private  void isValidMatrixFormat(){
        for (List<Integer> integerList:internalMatrix) {
            if(integerList.size()!=internalMatrix.get(0).size()) throw new IllegalArgumentException("Incorrect matrix format");
        }

    }

    int[] getRow(int rowNumber) {

        return internalMatrix.get(rowNumber-1).stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    int[] getColumn(int columnNumber) {
        return internalMatrix.stream()
                .map(row -> row.get(columnNumber-1))
                .mapToInt(Integer::intValue)
                .toArray();
    }

}