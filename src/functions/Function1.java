package functions;

public class Function1 {
    public static void main(String[] args) {
        System.out.println("Function testing:");
        System.out.printf("Test 1 %s.\n", ClassForTest
                .compareResults(fMaxim(new int[]{3, 4, 10, -1}), 10) ? "passed" : "failed");

        try {
            fMaxim(new int[0]);
            System.out.println("Test 2 failed.");
        } catch (RuntimeException e) {
            System.out.println("Test 2 passed.");
        }
    }


    public static int fMaxim(int[] array) {
        if(array == null) { throw new RuntimeException("len == 0 error"); }
        int maxim = array[0];

        for(int i = 1; i < array.length; ++i){
            if (array[i] > maxim) {
                maxim = array[i]; //! final
            }
        }
        return maxim;
    }

}
