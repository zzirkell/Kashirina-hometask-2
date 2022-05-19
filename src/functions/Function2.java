package functions;

public class Function2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{-5, -6, -7};
        // test 1
        System.out.printf("Test 1 %s.\n", ClassForTest.compareResults(merge(a, b), new int[]{-7, -6, -5, 1, 2, 3, 4, 5}) ? "passed" : "failed");

        //test 2
        System.out.printf("Test 2 %s.\n", ClassForTest.compareResults(merge(new int[0], new int[0]), new int[]{}) ? "passed" : "failed");

        //test 3
        System.out.printf("Test 3 %s.\n", ClassForTest.compareResults(merge(b, a), new int[]{5, 4, 3, 2, 1, -5, -6, -7}) ? "passed" : "failed");

    }

    private static int[] merge(int[] a, int[] b) {
        if (a == null) {
            return b;
        }
        boolean isInOrder = false;
        if (a.length > 0) {
            isInOrder = Function1.fMaxim(a) == a[0] ? false : true;
        }

        int[] fin = new int[a.length + b.length];
//filling
        for (int i = 0; i < a.length; ++i) {
            fin[i] = a[i];
        }
        for (int i = a.length; i < fin.length; ++i) {
            fin[i] = b[i - a.length];
        }

        for (int k = 0; k < fin.length; ++k) {
            for (int j = k + 1; j < fin.length; ++j) {
                if (isInOrder ? fin[k] > fin[j] : fin[k] < fin[j]) {
                    int s = fin[k];
                    fin[k] = fin[j];
                    fin[j] = s;
                }
            }
        }
        return fin;
    }

}
