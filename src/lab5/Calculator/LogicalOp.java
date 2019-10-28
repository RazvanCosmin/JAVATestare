package lab5.Calculator;

public class LogicalOp {
    public int[] getArrayHundred(){
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++)
            System.out.println("Pe pozitia " +
                    (i ) + " avem valoarea " +
                    array[i]);
    }

    public float averageArray(int[] anArray){
        float sum = 0;
        for (int i = 0; i < anArray.length; i++){
            sum = sum + anArray[i];

        }
        return sum/anArray.length;
    }


    {

        int[] arr;
             arr = new int[5];
                arr[0] = 10;

                arr[1] = 20;

               arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

                for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);

        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

          for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

