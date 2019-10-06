package lab2;


public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        float result = sum(x,y);
        System.out.println(result);
        result = division (x,y);
        System.out.println(result);
        result = avrage (x,y);
        System.out.println(result);
        result = substract(x,y)
                System.out.println(result);
    }

    public static int sum (int first, int second ){
        int sum = first + second;
                return sum;

    }
    public static int avrage (int first , int second){
        int avrage = first * second;
                return avrage;

    }
    public static float division (float first , float second){
        float division = first / second;
                return division;
    }
    public static int substract (int first, int second){
        int substract = first + second;
                return substract;
    }
    public class Main {

        public static void main(String[] args) {

            printMyName();

        }

        public static void printMyName(){

            System.out.println("Hello \n Cosmin");

        }

    }
}