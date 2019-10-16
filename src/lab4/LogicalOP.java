package lab4;

public class LogicalOP {
    public void printTohundred(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }


    public float getAvrageFromNumber() {
        float sum = 0;
        int x = 111;
        int count = 0;
        while (x <= 8899) {
            sum = sum + x;
            x++;
            count++;
        }
        return (sum / count);
    }
}