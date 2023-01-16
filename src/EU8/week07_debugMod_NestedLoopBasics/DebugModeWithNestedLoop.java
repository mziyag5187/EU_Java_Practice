package EU8.week07_debugMod_NestedLoopBasics;

public class DebugModeWithNestedLoop {

/*         1.                       2.                       3.                     4.
       * * * * * * *               *                        1                     1
       * * * * * * *               * *                      1 2                   2 2
       * * * * * * *     ===>      * * *            ==>     1 2 3           ==>   3 3 3
       * * * * * * *               * * * *                  1 2 3 4               4 4 4 4
       * * * * * * *               * * * * *                1 2 3 4 5             5 5 5 5 5
       * * * * * * *               * * * * * *              1 2 3 4 5 6           6 6 6 6 6 6
       * * * * * * *               * * * * * * *            1 2 3 4 5 6 7         7 7 7 7 7 7 7
 */

    public static void main(String[] args) {

        // let's analyze our pattern firstly
        // We have in total;

        // 7 ROWS     => we create the ROWS  thanks to our OUTER LOOP
        // 7 COLUMNS  => we create the COLUMNS thanks to our INNER LOOP

        // 1 => Outer Loop (to put the stars for each row)
        // 1 => Inner Loop (to put the stars inside one row => meaning how many column/star I need to put for that specific row )

        // 1. SHAPE
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=7; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("============= 2. SHAPE ==========================");

        // 2. SHAPE
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("============= 3. SHAPE ==========================");

        // 3. SHAPE
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("============= 4. SHAPE ==========================");

        // 4. SHAPE
        for (int i = 1; i<=7; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
