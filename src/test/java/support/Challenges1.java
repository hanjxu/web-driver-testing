package support;

import java.util.Arrays;

public class Challenges1 {
    int x = 5;

    public static void main(String[] args) {
        int y = 10;
//        Main myObj1 = new Main();
//        Main myObj2 = new Main();
//        System.out.println(myObj1.y);
//        myObj1.y = 11;  //will yield an error if attribute(field) in Main class set to final
//        System.out.println(myObj1.y);  //change to 11
//        System.out.println(myObj2.y);  //no change, 0
//        System.out.println(myObj2.fname.concat(" " + myObj1.lname));
//        System.out.println("The name is: " + String.join(" ", myObj2.fname, myObj1.lname)
//                + " with the age of " + myObj1.age + ".");
//
//
//        char aChar = 'a';
//        System.out.println(aChar<<=1);
        int[] intArr1 = {3, 5, 7, 11, 0, 9, 1, 5};
        int[] sum = {8,18,20,9,13,15,17};
//        String[] strArr1 = {"apple", "orange", "watermelon", "peach", "plum"};
//        String[] strArr2 = {"","","","","","","",""};     //not empty
//        String[] strArr3 = {"apple", "orange", "watermelon", "peach",""};
//        String[] strArr4 = {"apple", "orange", "watermelon", "peach", null};
//        String[] strArr5 = {null, null, null, null};  //not empty
//        String[] strArr6 = null;    //empty
//        System.out.println("Hello from class Challenges1 main.");
//        System.out.println("Print all element of int array.");
//        printIntArray(intArr1);
//        System.out.println("Print the even element of the array.");
//        printIntArrayEven(intArr1);
//        System.out.println(isEmptyIntArray(intArr1));
//        System.out.println(isEmptyStrArray(strArr6));
//        System.out.println("Printing day of week based on day sequence: ");
//        iPrintDayOfWeek("9th");
//        String str3 = "$49000345.55";
//        System.out.println(str3.substring(1, str3.length() - 3));
        //sort an array
//        System.out.println(">>>Original array: " + Arrays.toString(intArr1));
//        System.out.println(">>>Array after sort: " + Arrays.toString(sort(intArr1)));
        //Find if any 2 elements of an array result in sum. Example: {5, 3, 1, 7, 9}. 14 - true, 6 - false
//        for(int i = 0; i < sum.length; i++) {
//            System.out.println(">>>The sum of any 2 members in array equal to the given number " + sum[i] + " is " + sumOf2NumInArrayEqualToGivenNum(intArr1, sum[i]));
//
//        }
        //Print multiplication table from 1 to 10 (hint -"\t" can be used as TAB
//        System.out.println(">>>Here is the multiple table for 1 to " + y + ":");
//        displayMultiplicationTableFrom1ToGivenNum(y);

        //Find factorial of a number with a for loop. I.e. factorial of a 5! is 1*2*3*4*5 = 120
        displayFactorialForGivenNum(y);
        //Solve factorial now with a recursive function.
        System.out.println(">>>The factorial value of number " + y + " with recursion is: " + displayFactorialForGivenNumRecursion(y));
        //Return the number (count) of vowels in the given string. Vowels are: aeiou
        String sentence = "A class can be inherited by another class using the keyword 'extends'. ";
        countOccurrenceCharRegVowels(sentence);

    }
    static void countOccurrenceCharRegVowels(String str) {

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
            if ((findFlag == 1) &&(str.charAt(i) == 'a' | str.charAt(i) == 'u' |str.charAt(i) == 'e' |str.charAt(i) == 'i' |str.charAt(i) == 'o')) {
                System.out.printf("The occurrance of the character %s is: %d", str.charAt(i), count[str.charAt(i)]);
                System.out.println();
            }
        }

    }
    static int displayFactorialForGivenNumRecursion(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * displayFactorialForGivenNumRecursion(num - 1);
    }
    static void displayFactorialForGivenNum(int num) {
        int factorialValue = 1;
        for (int i = 1; i <= num; i++) {
            factorialValue *= i;
        }
        System.out.println(">>>The factorial value of number " + num + " is: " + factorialValue);
    }
    static void displayMultiplicationTableFrom1ToGivenNum(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();

        }
    }
    static boolean sumOf2NumInArrayEqualToGivenNum(int[] arr, int n) {  //3, 5, 7, 11, 0, 9, 1, 5
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    return true;
                }
            }
        }
        return false;
    }
    //insertion sort
    static int[] sort(int[] arr) {    //3, 5, 7, 11, 0, 9, 1, 5
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static void iPrintDayOfWeek(String weekDay) {
        if (weekDay.length() == 3) {
            int intWeekDay = Integer.parseInt(weekDay.substring(0, 1));
            if (intWeekDay > 0 && intWeekDay < 8) {
//                String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//                System.out.println(days[intWeekDay - 1]);
            switch (intWeekDay) {
                case 1 -> System.out.println("It's the first day of the week--Sunday.");
                case 2 -> System.out.println("It's the second day of the week--Monday.");
                case 3 -> System.out.println("It's the third day of the week--Tuesday.");
                case 4 -> System.out.println("It's the forth day of the week--Wednesday.");
                case 5 -> System.out.println("It's the fifth day of the week--Thursday.");
                case 6 -> System.out.println("It's the sixth day of the week--Friday.");
                case 7 -> System.out.println("It's the 7th day of the week--Saturday.");
                default -> System.out.println("The entry " + intWeekDay + " is not valid.");

            }
            } else {
                System.out.println("Day of the week seq can only be from 1 to 7.");
            }
        }
    }
    static boolean isEmptyStrArray(String[] strArr) {
        if (strArr == null || strArr.length == 0) {              //not evaluate second if first meet.
            return true;
        } else {
            return false;
        }
    }
    static boolean isEmptyIntArray(int[] intArr) {
        if (intArr.length == 0) {
            return true;
        } else {
            return false;
        }
    }
    static void printIntArrayEven(int[] arr) {
        System.out.println("Printing from func printIntArrayEven.");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("The integer array index: " + i + " and the value is " + arr[i]);
            }
        }

    }
    static void printIntArray(int[] arr) {
        System.out.println("Printing from func printIntArray.");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The integer array index: " + i + " and the value is " + arr[i]);
        }
    }
}
