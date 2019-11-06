package lab3.calculator;

public class LogicalOp {

    public String verifyTextAndNumber(String text, int number) {
        if (text.equals("FastTrack.") && number <= 3) {
            return (text + "  " + number);
        } else if (!text.equals("FastTrack") && number >=4)
            return(number + "   "+ text);

        return "";
    }

    public int[] getArrayHundred() {
    }
}



