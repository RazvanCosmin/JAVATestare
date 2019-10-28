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
        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        //so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arr[i]);
    }

