package EU10.week16_exceptions_TODO_tryCatchShortCut;

public class HappyNewYear {

    public static void main(String[] args) throws InterruptedException {
        String msg = "\u2728 \u2728 \u2728 ";
        for (int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
            Thread.sleep(500);
        }

        int num[] = {72, 65, 80, 80, 89, 32, 78, 69, 87, 32, 89, 69, 65, 82};
        String str = "";
        for (int i : num) {
            str = Character.toString((char)i);
            System.out.print(str + " ");
            Thread.sleep(500);
        }

        String msg2 = " \u2728 \u2728 \u2728";
        for (int i = 0; i < msg.length(); i++) {
            System.out.print(msg.charAt(i));
            Thread.sleep(500);
        }

        System.out.println();
    }
}

