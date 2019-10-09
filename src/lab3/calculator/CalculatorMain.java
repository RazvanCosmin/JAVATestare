package lab3.calculator;

public class CalculatorMain {

    public static void main(String[] args) {


        String text = "FastTrackj";
        int number = 5;
        int y = 4;
        LogicalOp op = new LogicalOp();
        String textf = "FastTrack";
        int numberh = 8;
        String result = op.verifyTextAndNumber(text , number);
        System.out.println(result);
    }
}