import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Matrix {
    private static final String ROW_DELIMITER = "\n";
    private static final String COLUMN_DELIMITER = " ";
    private String matrixString;

    Matrix(String matrixAsString) {
        this.matrixString=matrixAsString;
    }

    int[] getRow(int rowNumber) {

       String  arrayOfString[] = getStringArray(rowNumber);
       int arrayOfInt[] = new int[arrayOfString.length];
        for (int i=0;i<arrayOfString.length;i++){
            arrayOfInt[i]=Integer.valueOf(arrayOfString[i]);
        }
        return arrayOfInt;
    }

    private String[] getStringArray(int rowNumber) {
        return  Arrays.asList(matrixString.split(ROW_DELIMITER)).get(rowNumber - 1).split(COLUMN_DELIMITER);
    }

    private List<String> getStringArrayColumn(int columnNumber) {
        return  Arrays.asList(matrixString.split(ROW_DELIMITER)).stream().map(s -> Arrays.asList(s.split(COLUMN_DELIMITER)).get(columnNumber-1)).collect(Collectors.toList());
    }

    int[] getColumn(int columnNumber) {
        List<String>  arrayOfString = getStringArrayColumn(columnNumber);
        int arrayOfInt[] = new int[arrayOfString.size()];
        for (int i=0;i<arrayOfString.size();i++){
            arrayOfInt[i]=Integer.valueOf(arrayOfString.get(i));
        }
        return arrayOfInt;

    }
}
