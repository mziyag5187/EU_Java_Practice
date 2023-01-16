package EU10.week16_exceptions_TODO_tryCatchShortCut;

public class WhyTryCatchBlock {

    public static void main(String[] args) {

        //A sample case where you can apply try catch block for solution

        //You have one scenario on your app
        //in that scenario, you need to click on one specific link
        //but that link is not visible on the page "only on Sundays" in each week
        //and you still have to ru your TCs everyday

        try {
           // My code block which automate that scenario
           throw new Exception("The link is not appeared on the page");

        } catch (Exception e) {
            System.out.println("Today is Monday, so it throws the below exception");
            e.printStackTrace();
        }

        System.out.println("My TC execution flow continues");

    }

}
