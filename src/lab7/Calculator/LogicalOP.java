package lab7.Calculator;

import java.util.List;

public class LogicalOP {
    public void printListValuesReversed(List<Integer> myList) {

        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));
        }


    }

    public class LogicalOp {

        public String verifyTextAndNumber(String text, int number) {
            if (text.equals("FastTrack.") && number <= 3) {
                return (text + "  " + number);
            } else if (!text.equals("FastTrack") && number >= 4)
                return (number + "   " + text);

            return "";
        }


    }


}

