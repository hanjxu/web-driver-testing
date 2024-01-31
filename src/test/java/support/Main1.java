
package support;
//arrays, looping--for loop, while loop, 2D array, arraylist, recursion

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static support.TestContext.getDriver;

public class Main1 {

    WebDriverWait wait3Sec = new WebDriverWait(getDriver(), Duration.ofMillis(3000), Duration.ofMillis(500));
    public static void main(String[] args) throws InterruptedException {
     //   Actions q = new Actions(getDriver());
//        WebElement sendMenu = TestContext.getDriver().findElement(By.xpath("//a[@id='mail-ship-width']"));
//        WebElement zipLookUp = TestContext.getDriver().findElement(By.xpath("//a[contains(@href, 'ZipLookupAction!')]"));
//        TestContext.getDriver().get("https://www.usps.com/");
////        actions.moveToElement(sendMenu)
////                .pause(Duration.ofSeconds(2))
////                .click(zipLookUp)
////                .perform();
//        TestContext.getDriver().findElement(By.xpath("//a[@id='mail-ship-width']")).click();
//        TestContext.getDriver().findElement(By.xpath("//div[@class='benefits--3']//a[contains(text(), 'Look Up a ZIP Code')]")).click();
//        TestContext.getDriver().findElement(By.xpath("//a[@class='btn-primary zip-code-home'][contains(@href, 'byaddress')]")).click();
//
//        String addr = "4970 El Camino Real";
//        String city = "Los Altos";
//        String state = "CA";
//        String zip = "94022";
//        TestContext.getDriver().findElement(By.xpath("//input[@id='tAddress']")).sendKeys(addr);
//        TestContext.getDriver().findElement(By.xpath("//input[@id='tCity']")).sendKeys(city);
//        WebElement stateEl = TestContext.getDriver().findElement(By.xpath("//select[@id='tState']"));
//        Select selectState = new Select(stateEl);
//        selectState.selectByValue(state);
//
//        getDriver().findElement(By.xpath("//a[@id='zip-by-address']")).click();
//
//        WebElement resultEl = getDriver().findElement(By.xpath("//div[@id='zipByAddressDiv']"));
       // wait3Sec.until(ExpectedConditions.textToBePresentInElement(resultEl, zip));


        int num = 0;
        int num1 = 1;
        int[] intArr = {2, 4, 6, 8, 10, 12, 14, -110, 0, -1};
        String str = "Webinar";
        char[] charArray = str.toCharArray();
        System.out.println("The size of the array is: " + charArray.length);
        System.out.println("The character array is after conversion:");
        for (char i : charArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        String str1 = String.valueOf(charArray); //str1 = new String(charArray);
        String str2 = String.valueOf(charArray, 0, 3);
        String str3 = String.valueOf(charArray, 3, charArray.length - 3);
        System.out.println(str1);
        System.out.println(str2 + str3);
        do {System.out.println(num); num++;} while (num < 5);
        String[] strArr = {"Volvo", "BMW", "Ford", "GM", "Toyota", "Honda", "BYD"};
        while (num1 <= 11) {    //do {System.out.println(num); i++;} while (num < 5);
            if (num1 == 11) {
                System.out.print(num1);
            } else {
                System.out.print(num1 + ",");
            }
            num1++;
        }
        System.out.println();
//
//        System.out.println("The members of the integer array is(with for-each loop):" + "\n");
//        for (String a : strArr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//
//        System.out.println("The number of the integer array is(with for loop):" + "\n");
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.print(intArr[i] + " ");
//        }
//        System.out.println();
//
//        do {System.out.print(num + " "); num++;} while (num < 5);
//        System.out.println();
//
//            // Outer loop
//        for (int i = 1; i <= 2; i++) {
//            if (i != 1) {
//                System.out.println();
//            }
//            System.out.println("Outer: " + i); // Executes 2 times
//            // Inner loop
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(" Inner: " + j + " "); // Executes 6 times (2 * 3)
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) { break;}      //break will exit for here out of this loop.
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//            if (i == 4) { continue;}      //exit when i=4, continue next i=5(skip the current one.)
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };   //2D array
//        System.out.println("Number of 2D array is: " + myNumbers.length + "\n");  //2
//        System.out.println("Members in 1st array is: " + myNumbers[0].length + "\n");  //4
//        System.out.println("Members in 2nd array is: " + myNumbers[1].length + "\n");  //3
//        for (int i = 0; i < myNumbers.length; ++i) {   //0,1
//            for(int j = 0; j < myNumbers[i].length; ++j) {  //0--0,1,2,3 1--0,1,2
//                System.out.print(myNumbers[i][j] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println(myMethod("First", "Second", "Third",5)); //ArrayList is variable length
//        System.out.println();
//        System.out.println(sum(20));  //recursion
//        System.out.println(sum(5, 10));  //recursion from a range, also overloading
//        int n1 = 100, n2 = 10;
//        System.out.println("The summary from 1 to " + n1 + " is " + sumOneParameter(n1) + ".");
//        System.out.printf("The first %s square numbers are: " + squareNum(n2) + ".", n2);
//        System.out.println();
////// Java program to count frequencies of characters in string using for loop--v1
//        String sentence1 = "A class can be inherited by another class using the keyword 'extends'. ";
//        countOccurrenceCharReg(sentence1);
//
////// Java program to count frequencies of characters in string using hashmap--v2
//        String sentence2 = "An Interface can be inherited by a class using the keyword 'implements' " +
//                "and it can be inherited by another interface using the keyword 'extends'.";
//        countOccurrenceCharHashMap(sentence2);
//
//        //Reverse string but add space after each character, i.e. WebDriver => r e v i r D b e W
//        String str1 = "weivretni";
//        System.out.println(">>>The original string is: " + str1);
//        System.out.println(">>>The reversed string after added spaces is: " + reverseAndAddSpace(str1));
//
//        //Find the longest word in a string using a for loop
//        String sentence = "the quick brown box jumped over the lazy dog";
//        System.out.println(">>>The longest word of the sentence is: " + longestWord(sentence) + ".");
//
//        //Name to initial: Sam Harris => S.H
//        String name = "John Doe";
//        System.out.println(">>>The initial from the name: " + name + " is " + convertInitial(name));
//        //binary search: O(logN)
//        int[] sortedArray = {1,1,3, 5, 6, 9, 10};
//        System.out.println(binarySearch((sortedArray), 9));
//        //digits input yields 4-digit maskified output:
//        String str2 = "4567890";
//        String str3 = "7890";
//        String str4 = "90";
//        maskifiedDigit(str2);
//        maskifiedDigit(str3);
//        maskifiedDigit(str4);


        

    }
    static void maskifiedDigit(String digitStr) {
//        String maskified = digitStr;
//        if (digitStr.length() > 4) {
//            maskified = StringUtils.repeat('#', digitStr.length() - 4) + digitStr.substring(digitStr.length() - 4);
//        }
//        System.out.println("The maskified string is: " + maskified);

        String maskified = "";
        if (digitStr.length() > 4) {                     //#4#5#67890
            for (int i = 0; i < digitStr.length(); i++) {
                if (i < digitStr.length() - 4) {
                    maskified += '#';
                } else {
                    maskified += digitStr.charAt(i);
                }
            }
        } else {
            maskified = digitStr;
        }
        System.out.println("The maskified string is: " + maskified);
    }
    static boolean binarySearch(int[] arr, int num) {
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (arr[midIndex] == num) {
                return true;
            } else if (arr[midIndex] < num){
                lowIndex = midIndex + 1;
            } else {
                highIndex = midIndex - 1;
            }

        }
        return false;
    }
    static String convertInitial(String str) {
        String firstInitial = str.split(" ")[0].substring(0, 1).toUpperCase();
        String lastInitial = str.split(" ")[1].substring(0, 1).toUpperCase();

        return  firstInitial + "." + lastInitial;
    }
    static String longestWord(String str) {
        String[] strArr = str.split(" ");
        String longestStr = strArr[0];
        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i].length() > longestStr.length())
                longestStr = strArr[i];
        }
        return longestStr;
    }
    static String reverseAndAddSpace(String str) { //weivretni
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
            if (i != str.length() - 1) result = ' ' + result;

        }
        return result;
    }
    static void countOccurrenceCharHashMap(String str) {
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            al.add(str.charAt(i));
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.putIfAbsent(al.get(i), Collections.frequency(al,al.get(i)));
        }

        for (HashMap.Entry<Character,Integer> e : hm.entrySet()) {
            System.out.println(
                    "Character is: "+e.getKey()+ " and its count in string is: "+ e.getValue());
        }
    }
    static void countOccurrenceCharReg(String str) {

        // Java program to count frequencies of characters in string using for loop

        System.out.println("The sentence need to be counted is: " + str);
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++; //occurrence count finished
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int findFlag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j])
                    findFlag ++;
            }
            if (findFlag == 1) {
                System.out.printf("The occurrance of the character %s is: %d", str.charAt(i), count[str.charAt(i)]);
                System.out.println();
            }
        }

    }
    static String squareNum (int n2) {
        String squareResults = "";
        for (int i = 1; i <= n2; i++) {
            if (i == n2) {
                squareResults += i * i;
            } else {
                squareResults += i * i + ", ";
            }
        }
        return squareResults;
    }
    static int sumOneParameter(int num) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        return total;
    }
    static int sum(int start, int end) {
        if (start < end) {
            System.out.println(end);
            return end + sum(start, end - 1);
        } else {
            return end;  //now end==start
        }
    }
    static int sum(int n) {
        if (n > 0) {
            return n + sum(n-1);
        } else{
            return 0;
        }
    }
    static ArrayList myMethod(String str1, String str2, String str3, int age) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add(str1);
        arrList.add(str2);
        arrList.add(str3);
        arrList.add(Integer.toString(age));
        return arrList;
    }


}
