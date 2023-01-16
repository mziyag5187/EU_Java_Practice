package EU8.week11_arrayList_wrapperClass;

public class WrapperClassUsageForSDET {

	public static void main(String[] args) {
		
		String str = "1-16 of 462 results for";
		
		//As my first step, I will split it in the following way
		
		String totalNumber = str.split("1-16 of ")[1];
		//        {"1-16 of ", "462 results for"}
		//index        0               1
		
		//It will create the above array for me after using first split method
		//I will take the second element of the array and use split method again
		
		totalNumber = totalNumber.split(" results for")[0];
		//          {"462", " results for"}
	    //index        0           1
		
		//then take the first element inside it to reach specificly my number string

		
		System.out.println("My result :" + totalNumber);
		
		System.out.println(totalNumber + 1); // will make a simple concatenation
		
		int totalNum = Integer.parseInt(totalNumber);
		
		System.out.println("After converting my number to int using Wrapper Class:");
		
		System.out.println(totalNum + 1); // will add 1 to my result as an int 
	}
}

























//AUTOMATION CODES:

//public class WrapperExample {
//WebDriver driver;
//    @Test
//    public void test(){
//        driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get("http://amazon.com");
//
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java", Keys.ENTER);
//        String str=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]")).getText();
//        System.out.println(str);
//
//        //DO NOT WORRY ABOUT UNTIL THIS PART
//
//        // how to use wrapper class in our automation framework
//        //search result for a given item in amazon and show the result add 1 to result
////        ===============================================
////          input = 1-48 of over 4,000 results for -------------output =4001
//
////        first--using split method divide and create a String array
//        String [] split = str.split(" ");
//        System.out.println(Arrays.toString(split));
//
////        second- split 4,000 again to get rid of comma
//        String [] result = split [3].split(",");
//        System.out.println(Arrays.toString(result));
//
////        third ---merge 4 and 000 to get the actual result
//
//        String resultOfItem = result[0]+result[1];
//        System.out.println(resultOfItem+1); //40001
//
//        int totalNum= Integer.parseInt(resultOfItem);
//        System.out.println(totalNum+1);




    