package arrays.outputArrays;

import java.util.Arrays;

public class allOutputsArrays {
    public static void main(String[] args) {

    // Simple array:
        String[] array = new String[] { "John", "Mary", "Bob" };
        System.out.println(Arrays.toString(array));

        // output -> [John, Mary, Bob]

    // Nested array:
        String[][] deepArray = new String[][] { { "John", "Mary" }, { "Alice", "Bob" } };
        System.out.println(Arrays.toString(deepArray));
        // output-> [[Ljava.lang.String;@106d69c, [Ljava.lang.String;@52e922]

        System.out.println(Arrays.deepToString(deepArray));
        // output -> [[John, Mary], [Alice, Bob]]

    // double array:
        double[] doubleArray = { 7.0, 9.0, 5.0, 1.0, 3.0 };
        System.out.println(Arrays.toString(doubleArray));
        
        // output -> [7.0, 9.0, 5.0, 1.0, 3.0 ]
        
    // int array:
        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println(Arrays.toString(intArray));
        
        // output -> [7, 9, 5, 1, 3 ]


    }
}