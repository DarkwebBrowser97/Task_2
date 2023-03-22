import java.util.Arrays;

public class ArrayReverseExample {
    private static int index;

    public static void main (String[]args){
        int [] array = new int []{1,2,3,4,5};

        //Get array size
        int  length = array.length;
        // declare and create reversed array
        int [] reversed = new int[length];

        // Initialize the reversed array
        for ( int index  = 0;  index < length; index++) {
            reversed [ length - index - 1] = array [index];
        }
        // print the reversed array
        System.out.println(Arrays.toString(reversed));
    }
}