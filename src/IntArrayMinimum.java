public class IntArrayMinimum {

    /* Schreiben Sie eine Methode, die ein int[] als Parameter übergeben bekommt und die kleinste Zahl in diesem Array zurückgibt. */
    public static int intArrayMinimum(int[] values) {
        int currMin = Integer.MAX_VALUE;

        for (int i = 0; i < values.length; i++) {
            if(values[i] < currMin) {
                currMin = values[i];
            }
        }

        return currMin;
    }


    public static void main(String[] args) {
        int[] testArray = {5, 4, 3, 1, 2, 9, 15};
        int testMin = intArrayMinimum(testArray);
        if(testMin == 1) {
            System.out.println("Correct!");
        } else {
            System.out.println("Your returned value is: " + testMin + " But the correct smallest value is 1");
        }
    }
}
