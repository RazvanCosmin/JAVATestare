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

    public void printCountNumber(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }

    public float getsumAndAvrage(int x) {
        float avrage = 1;
        int count = 0;
        while (x <= 100) {
            avrage = avrage + x;
            x++;
            count++;
        }
        return avrage / count;
    }

    public void printDiversibile(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }

    public void printDive(int x) {
        float avrage = 1;
        int count = 0;
        int sum = 0;
        while (x <= 100) {
            if( x %7== 0){
                sum = sum + x;
                count ++;

            }

            x++;
                    }
    }
}



