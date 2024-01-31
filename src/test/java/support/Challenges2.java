package support;

import java.util.Arrays;
import java.util.Scanner;

public class Challenges2 {
    public static void main(String[] args) {
//        int a = -20;
//        int b = 50;
//        int c = 7;
//        int n = 3;
//        int m = 5;
//        int limit = 100;
//        int[] intArr1 = {0,1,2,3,4,5,6,7,8,9,10,11};

//        Challenges1 myObj = new Challenges1();
//        System.out.println(myObj.x);
//        printNum(a, b);  //1) Write a function that prints all numbers from range:
//                         // from -n to +m (example, -20 to 50)
//
//        printEverySecondEl(intArr1); // 2) Write a function that prints every second element
//                                     // from the integer array
//
//        if(checkEleExistInArr(c, intArr2)) { //3) Write a function that checks if array contains another element
//            System.out.println("\n\nThe array intArr1 contains " + c); // (example, if array {3,5,1,7,9} contains 7)
//
//        } else {
//            System.out.println("\n\nThe array intArr1 does not contains " + b);
//        }
//
//        swapNthElAndMthEl(n, m, intArr2); //4) Write a function that can swap Nth element of an array to Mth
//                                          // (example, 3rd with 5th - but you pass it those two as parameters)

        //5) FizzBuzzEven Challenge:
        //Write a program that prints the numbers from 1 to 100. However:
        //For even numbers, print "Even".
        //For multiples of three, print "Fizz".
        //For multiples of five, print "Buzz".
        //For numbers which are multiples of both three and five, print "FizzBuzz".
//        fizzBuzz(limit);

//        String str2 = "WebDriver";
////        System.out.println(str2.charAt(0));
//        System.out.println(">>>Reverse a string:");
//        System.out.println(reverse(str2)); //revirDbeW
//        System.out.println(">>>capitalize the sentence: the quick brown box jumps over the lazy dog");
//        //The Quick Brown Box Jumps Over The Lazy Dog
        String sentence = "the quick brown box jumped over the lazy dog";
//        System.out.println(capitalizeWords(sentence));
//        //"the quick brown fox jumps over the lazy dog" => "dog lazy the over jumps fox brown quick the"
//        System.out.print("The sentence before reverse: " + sentence);
//        System.out.println();
//        System.out.print("The reversed string is: " + reversedStr(sentence));
//        System.out.println();
//        int[] intArr2 = {3,5,1,7,-22,21,9};
//        System.out.println("The max number of the array is: " + findMax(intArr2));
        int[] intArr3 = {5,1,3,7,10,9};
        System.out.println(">>>Write a func that finds [*print*] two max numbers [in an arry]");
        printTwoMax(intArr3);
//
        String p1 = "noon";
        String p2 = "civic";
        String p3 = "web";
        System.out.println("Find if a string is palindrome:");
        System.out.println("Is palindrome: " + isPalindrome(p1));
        System.out.println("Is palindrome: " + isPalindrome(p2));
        System.out.println("Is palindrome: " + isPalindrome(p3));
//        System.out.println(">>>Sentence before removing spaces: " + sentence);
//        System.out.println("Spaces removed from a sentence using for loop: " + removeSpace(sentence));
//        System.out.println(">>>The longest word in the sentence is: " + findLongestWord(sentence));
//         isLeap();

        //write a function to mask the phone/ssn numbers, only show the 4 last, others mask with hash:
//        System.out.println(">>>Maskify challenges: ");
//        String strPhone = "4556364607935616";  //654321, 1, ''
//        System.out.println(maskify(strPhone));
//        System.out.println(maskifySecond(strPhone));
//        System.out.println(">>>Is prime number? ");
//        System.out.println(isPrime(10));
//        System.out.println(isPrime(167));
//        printNumberMatrixIncreasingSeq(5);
//        printNumberMatrixDecreasingSeq(5);
        printNumberMatrixReversedTriangle(5);
//        printNumberMatrixDoubleHeight(6);
//        printNumberMatrixDoubleWidth(6);
    }
    static void printNumberMatrixDoubleWidth(int num) {
        for (int i = 1; i <= num/2; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    static void printNumberMatrixDoubleHeight( int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num/2; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    static void printNumberMatrixIncreasingSeq(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void printNumberMatrixDecreasingSeq(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j --) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void printNumberMatrixReversedTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num * 2 - 1; j ++) {
                if (j <= num) {
                    if (j <= i - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j + " ");
                    }
                }else {
                    if (j <= (2 * num - i)) {
                        System.out.print(2 * num - j + " ");
                    }else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = num-1; i >= 2; i--) {    //for(int i = 2; i <=Math.sqrt(num); i++)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static String maskify(String str) {  //4556364607935616--size 16, index 0:4, str.charAt(str.length()-1) is the rightmost one.
        if (str.length() <= 4) {                 // 5616= str.charAt(str.length()-1) ~ str.charAt(str.length()-4)
            return str;
        }
        String result = "";
        for (int i =str.length() - 1; i >= 0 ; i-- ) {
            if (i > (str.length() - 5)) {
            result = str.charAt(i) + result;
            }
            else {
                result = "#" + result;
            }
        }
        return result;
    }

    static String maskifySecond(String str) {//4556364607935616--size 16, index 0:4, str.charAt(str.length()-1) is the rightmost one.
        if (str.length() <= 4) {
            return str;
        }
        char[] strArry= str.toCharArray(); // return strArry.toString();
        for (int i = strArry.length - 5; i >= 0; i--) {
            strArry[i] = '#';
        }
        str = new String(strArry);
        return str;

    }
        static void isLeap() {
        int checkLeap = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print(">>>Please enter a year like 2023 for leap year check:");
        checkLeap = Integer.parseInt(myScanner.nextLine());
        if ((checkLeap % 4 == 0) && (checkLeap % 100 != 0) && (checkLeap % 400 != 0)) {
            System.out.println("The year " + checkLeap + " you entered is leap year.");
        } else {
            System.out.println("The year " + checkLeap + " you entered is not leap year.");
        }
    }
    static String findLongestWord (String sentence) {
        String longestWord = "";
        String [] words = sentence.split(" ");
        longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    static String removeSpace(String sentence) {
        String reversedSentence = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                reversedSentence += sentence.charAt(i);
            }

        }
        return reversedSentence;
    }

    static boolean isPalindrome (String word) {
        //refer/reuse another func.
//        String reversed = reverse(word);
//        return word.equals(reversed);
        int j = word.length() - 1;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
    static String reverse(String str) {
        String reversed = "";  //String reversed = null -yield error as no addr for null in stack
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(i + " ");
            reversed = reversed + str.charAt(i); //reversed += str.charAt(i);
        }
        return reversed;
    }
    static void printTwoMax (int[] arr) {   //{5,1,3,7,10,9}
        int max1 =  Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];

            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println("Two max numbers. First max#: " + max1 + "' second max#: " + max2);
    }
    static int findMax (int[] arr) {
        int max =  arr[0];
        for ( int el : arr) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }
    static String reversedStr(String sentence) {
        String[] word = sentence.split(" ");
        String reversedString = "";
        for (int i = word.length - 1; i >= 0; i--) {
            reversedString += word[i] + " ";
        }
        return reversedString.trim();
    }
//        static String reverseSentence(String sentence2) {
//        String reversedSentence = "";
//        String [] words = sentence2.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            reversedSentence = words[i] + " " + reversedSentence;
//        }
//        return reversedSentence;
//    }
    static String capitalizeWords(String sentence) {  //the quick brown box jumps over the lazy dog
        String[] words = sentence.split(" ");
        String capitalizedSentence = "";
        for (String word : words) {
            //capitalizedSentence += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            capitalizedSentence += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        return capitalizedSentence.trim(); //The Quick Brown Box Jumps Over The Lazy Dog,trim will delete leading and trailing spaces.
    }


    static void fizzBuzz(int num) {
        System.out.println("\nHere is the printout of Even, Fizz, Buzz numbers in the range of 1~100:");
        for (int i = 1; i <= num; i++) {
            if (i % 30 == 0) {
                System.out.println("\n");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 2 == 0) {
                System.out.print("Even ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    static void swapNthElAndMthEl(int num1, int num2, int[] intArr) {
        System.out.println("\nThe integer array before swap is: " + Arrays.toString(intArr));
        int tmp = intArr[num1-1];
        intArr[num1-1] = intArr[num2-1];
        intArr[num2-1] = tmp;
        System.out.println("The integer array after swap is: " + Arrays.toString(intArr));
    }
    static boolean checkEleExistInArr(int n, int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (n == intArr[i]) {
                return true;
            }
        }
        return false;
    }
    static void printEverySecondEl(int[] intArr) {
        System.out.println("\n\nHere is the every second printout of the array: ");
        for (int i = 0; i < intArr.length; i += 2) {
            System.out.print(i + " ");
        }
    }
    static void printNum(int num1, int num2) {
        System.out.println("Here is the output of the numbers from " + num1 + " to " + num2 + ":");
        for (int i = num1; i < num2 + 1; i++) {
            System.out.print(i + " ");
            if ((i + 1 - num1) % 30 == 0) {
                System.out.println("\n");
            }
        }
    }
}
