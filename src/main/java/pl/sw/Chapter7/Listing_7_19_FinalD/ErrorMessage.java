package pl.sw.Chapter7.Listing_7_19_FinalD;

public class ErrorMessage {
    private static final int OUTER = 0;
    private static final int INNER = 1;
    private static final int DISK_ERROR = 2;
    private static final int INDEX_ERROR = 3;

    private String[] arrayOfErrors = {"Błąd wyjścia", "Błąd wejścia", "Dysk pełny", "Indeks spoza zakresu"};

    public static int getOUTER() {
        return OUTER;
    }

    public static int getINNER() {
        return INNER;
    }

    public static int getDiskError() {
        return DISK_ERROR;
    }

    public static int getIndexError() {
        return INDEX_ERROR;
    }

    public String[] getArrayOfErrors() {
        return arrayOfErrors;
    }

    public String getErrorMessage(int errorIndex) {
        if (errorIndex >= 0 && errorIndex <= arrayOfErrors.length) {
            return arrayOfErrors[errorIndex];
        } else return "Niepoprawny kod błędu";
    }
}
