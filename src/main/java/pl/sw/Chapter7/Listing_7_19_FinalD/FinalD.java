package pl.sw.Chapter7.Listing_7_19_FinalD;

public class FinalD {

    public static void main(String[] args) {
        ErrorMessage errorMessage = new ErrorMessage();

        System.out.println(errorMessage.getErrorMessage(ErrorMessage.getDiskError()));
        System.out.println(errorMessage.getErrorMessage(ErrorMessage.getINNER()));
        System.out.println(errorMessage.getErrorMessage(3));

    }


}
