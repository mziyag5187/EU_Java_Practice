package EU10.week11_arrayList_wrapperClass;

public class WrapperClassUsageForSDET {

	public static void main(String[] args) {
		
		String str = "1-16 of 462 results for 'keyword'";
					//01234567890123456789012345678901
		
		// How to get the digital part of this sentence as a number dynamically
		// so that I can make required calculation by using that number

		int startIndex = str.indexOf("of ") + 3;
		System.out.println("startIndex = " + startIndex);

		int endIndex = str.indexOf(" results");
		System.out.println("endIndex = " + endIndex);

		String numberAsString = str.substring(startIndex, endIndex);

		// I need to convert the number string part to Integer (with using Wrapper Class)
		int numberAsInteger = Integer.parseInt(numberAsString);
		
		System.out.println("After converting my number to int using Wrapper Class:");
		
		int result = numberAsInteger + 1;

		System.out.println(result); // 42 + 1 = 463

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




    