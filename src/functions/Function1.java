package functions;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest
                .compareResults(findMax(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

        try {
            findMax(new int[0]);
            System.out.println("Test 2: failed.");
        } catch (RuntimeException e) {
            System.out.println("Test 2: passed.");
        }
    }

    public static int findMax(int[] array) {
        if(array == null) { throw new RuntimeException("Length of array error"); }

        int maximumOfArray = array[0];

        for(int i = 1; i < array.length; ++i){
            if (array[i] > maximumOfArray) {
                maximumOfArray = array[i];
            }
        }

        return maximumOfArray;
    }

}
