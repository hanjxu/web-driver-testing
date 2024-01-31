package support;

import java.math.BigInteger;
import java.util.*;

public class Main {
//    int y;  //final int y;
//    String fname = "John";
//    String lname = "Doe";
//    int age = 24;


    public static void main(String[] args) {
        int[] intArray = {1,2,3,4};
        String[] vegitables = {"cucumber", "eggplant", "celantro"};
        System.out.println(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(vegitables));
        int lowerCaseLetterStart = 97, lowerCaseLetterEnd = 122;
        int upperCaseLetterStart = 65, upperCaseLetterEnd = 90;
        int myNum = 5;
        BigInteger myBigNum = BigInteger.valueOf(5);
//        float myFloatNum = 5.99f;
//        char myLetter = 'D';
//        boolean myBool = true;
//        String myText = "Hello";
//        final int myNum2 = 10;
//        int[] intArr = {5, 29, 6, 40, 3, 13, -2, 17, 49, 0, 11, -1};
//        for (int num : intArr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        System.out.print(3);
//        System.out.println(3*2);
//        int x = 5, y = 6, z = 50;
//        System.out.println(x + y + z);
//        int a, b, c;
//        a = b = c = 50;
//        System.out.println(a + b +c);
//        byte d = 127;
//        short e = 32767;
//        int f = 2147483647;
//        // byte d = 128;  //Main.java:24: error: incompatible types: possible lossy conversion from int to byte
//        //short e = 32768;//Main.java:26: error: incompatible types: possible lossy conversion from int to short
//        /* int f = 2147483648; //Main.java:29: error: integer number too large */
//        float f1 = 35e3f;     //this f is the must have.
//        double d1 = 12E-4d;  //this d is optional.
//        double d2 = 12E4d;
//        System.out.println(f1);
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(myNum);
//        // myNum2 = 20;  //Main.java:17: error: cannot assign a value to final variable myNum2
//        boolean isJavaFun = true;
//        boolean isFishTasty = false;
//        System.out.println(isJavaFun);
//        System.out.println(isFishTasty);
//        System.out.println(d==e);
//        //char myVar1 = 65, myVar2 = 66, myVar3 = 67, myVar4 = 97;  //ASCII values of A,B,C,a
//        char myVar1 = 'A', myVar2 = 'B', myVar3 = 'C', myVar4 = 'a';
//        System.out.println(myVar1);
//        System.out.println(myVar2);
//        System.out.println(myVar3);
//        System.out.println(myVar4);
//        String greeting = "Hello world!";
//        System.out.println(greeting);
//        char myChar = 'a';
//        int myIntAscii = myChar;
//        int myInt = myChar - '0';          //myChar's Ascii is 54, '0' Ascii is 48, 6 is the result of the subtraction.
//        int myIntByMethod = Character.getNumericValue(myChar);  //using object Character's method, only correct with number.
//        System.out.println(myInt);
//        System.out.println(myIntByMethod);
//        System.out.println(myChar);
//        int myInt1 = 9;
//        double myDouble = myInt1; // Automatic casting(widening): int to double
//        System.out.println(myInt1); // Outputs 9
//        System.out.println(myDouble);   // Outputs 9.0
//        double myDouble1 = 5.99;
//        int myInt2 = (int) myDouble1;   //manual casting(narrowing): force double to int, floor: 5.99-->5
//        System.out.println(myDouble1);
//        System.out.println(myInt2);
//        System.out.println(myInt1 & myInt2); //9&5=1001&101=1   and
//        System.out.println(myInt1 | myInt2); //9|5=1001|101=13   or
//        System.out.println(myInt1 ^ myInt2); //9^5=1001^101=12  xor
//        System.out.println(myInt1>>=2);   //9=9>>2--1001 right shift 2 bit--10 value changed
//        System.out.println(myInt1<<=2);   //2=2<<2--10 left shift 2 bit--1000 value changed
//        String s1="This is a new Program";
//        System.out.println(s1.length());
//        System.out.println(s1.indexOf("is"));  //index 8, "is" 2 occurance, return the first.
//        String[] s2 = {"apple", "orange", "kiwi", "strawberry"};
//        System.out.println(s2.length);
//        System.out.print("Here is the array to work with: " + Arrays.toString(s2));  //print s2 directly yield addr
//        String firstName = "John ";
//        String lastName = "Doe";
//        System.out.println('\n' + firstName.concat(lastName));
//        String g = "10";
//        int h = 20;
//        System.out.println(g + h);  // z will be 1020 (a String), 2010 for h + g
//        String k = "Hello World!";
//        System.out.print(k);
//        System.out.println("\b");
//        System.out.println(Math.max(5, 10));  //result 10
//        System.out.println(Math.sqrt(64));  //result 8.0
//        System.out.println(Math.abs(-4.7));  //result absolute(positive)
//        System.out.println(Math.random()); //rand num btwn 0.0(inclusive)and 1.0(exclusive)
//        System.out.println((int)(Math.random() * 101));  // 0 to 100
//
//
//
//        printIntAfterIncrement1(intArr);
/* Implement the following. Refer to similar tasks done in the class.
   1 point for each solved coding challenge. */

  // Task1:  Print numbers from 2 to 20 using a for loop with a step 2
//        System.out.print("Print numbers from 2 to 20 using a for loop with a step 2:\t");
//    for (int i = 2; i <= 20; i+= 2) {
//        if (i == 20) {
//            System.out.println(i);
//        } else {
//            System.out.print(i + ", ");
//
//        }
//    }

  // Task 2:  Calculate the sum of the numbers from 1 to 100 using a for loop
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) sum += i;
//        System.out.println("The sum of 1 to 100 is: " + sum);

  // Task 3:  Print the numbers from 10 down to 1 using a for loop
//        System.out.print("The reverse sequence from 1 to 10 inclusive: ");
//        for (int i = 10; i > 0; i--) {
//            if (i == 1) {
//                System.out.println(i);
//            } else {
//                System.out.print(i + ", ");
//            }
//        }

  // Task 4:  Print the first 10 square numbers using a for loop
//        System.out.println("The first 10 Square numbers using a for loop: ");
//        for (int i = 1; i <= 10; i++) {
//            if (i == 10) {
//                System.out.println("For number " + i + "\tthe square is: " + i*i);
//            } else {
//                System.out.println("For number " + i + "\tthe square is: " + i*i + ";");
//            }
//
//        }

  // Task 5:  Reverse a String, but skip all the vowels - a, e, i, o, u
//        String sentence = "the quick brown box jumps over a lazy dog", reversedSentence = "";
//        System.out.println("The original sentence is:\t" + sentence);
//        //String[] words = sentence.split(" ");
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            if (sentence.charAt(i) != 'a' && sentence.charAt(i) != 'e' && sentence.charAt(i) != 'i'
//                    && sentence.charAt(i) != 'o' && sentence.charAt(i) != 'u') {
//                        reversedSentence += sentence.charAt(i);
//                    }
//        }
//        System.out.println("The reversed sentence without vowels is:\t" + reversedSentence);
  // Task 6: Print the multiplication table for a given number using a for loop
//        multiplicationFromNum();
  // Task 7: Print the ASCII value and corresponding character for each uppercase letter in the alphabet using a for loop (use char type)
//        printUpperLetters(upperCaseLetterStart, upperCaseLetterEnd);
//        printUpperLetters(lowerCaseLetterStart, lowerCaseLetterEnd);
  //  Task 8: Print the first 10 numbers in the Fibonacci sequence using a for loop (Each number in the sequence is the sum of
  // the two numbers that precede it. So, the sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on)
        printFibonacci();
        System.out.println();
        printFibonacciRecursion(10);
        System.out.println();
/*   Task 9: Write a program that prints a pyramid made of asterisks to the console. The program should prompt the user for the height of the pyramid and then use a for loop to print the pyramid. For example, if the user enters a height of 5, the program should print the following pyramid:
        	    *
        	   ***
        	  *****
        	 *******
        	*********    */
//        writePyramid(6); //need to find the pattern: i---space---*  ==>  space=height-i,  * = 2*i-1
//        String[] names1 = {"John", "Jack", "Alex"};
//        String[] names2 = {};
//        String[] names3= {"John", "Jack", "Alex", "Bryant", "Charlie", "David"};
//        System.out.println(whoLikesIt(names1));
//        System.out.println(whoLikesIt(names2));
//        System.out.println(whoLikesIt(names3));
//        System.out.println(whoLikesItSwitch(names2));
//        System.out.println(whoLikesItSwitch(names3));
//        //System.out.println(whoLikesItSwitchAndArray(names3));
//        Scanner sc = new Scanner(System.in);
//        String str1 = "inside";
//        String str2 = sc.nextLine().toString();
//        System.out.println(String.valueOf(str1));
//        System.out.println(String.valueOf(str2));
//        System.out.println(String.valueOf(str1) == String.valueOf(str2)); //returns only addr in the heap
//        System.out.println(str1.equals(str2));   //equal method compares value,returns true
        String str3 = "foobar000";
        String str4 = "foobar9";
        String str5 = "foobar";
        String str6 = "foobar0043";
        String str7 = "foo099";
        String str8 = "987592667377954";
        String str9 = "TofsPjE_04374001876";
        String str10 = "str=\"[eFEJ-X\\~`?pxv\"b7811888171935994764993137";
//        System.out.println(incrementString(str3));
//        System.out.println(incrementString(str4));
//        System.out.println(incrementString(str5));
//        System.out.println(incrementString(str6));
//        System.out.println(incrementString(str7));
//        System.out.println(incrementString(str8));
//        System.out.println(incrementString(str9));
//        System.out.println(incrementString2(str5));
//        System.out.println(incrementString2(str6));
//        System.out.println(incrementString2(str7));
//        System.out.println(incrementString2(str9));
//        System.out.println(incrementString(str10));
        System.out.println("Here is the sum of the perimeters of all the squares in a rectangle when there are n+1 squares disposed:"  + perimeter(myBigNum));
        System.out.println();
/* actions int, char, String arrays, size of the arrays is immutable while you can change the elements */
        Object[] intArr = {5,6,1,9,0,-11,41299};  //using general type Object[] for overloading instead of int[]
        Object[] charArr = {'W', 'i', 's', 'd', 'o', 'm'}; //using general type Object[] for overloading instead of char[]
        String[] fruits = {"plum", "orange", "apple", "banana", "peach"};
        intArr[0] = -41299;
        charArr[charArr.length - 1] = 'o';
        fruits[2] = "grape";
        //methods overloading using general type like Object[] allow passing different types of arrays to a function
        printArr(intArr);
        printArr(fruits);
        printArr(charArr);
//        //print while array using Arrays.toString function
//        System.out.println(intArr + ": " + Arrays.toString(intArr));
//        System.out.println(fruits + ": " + Arrays.toString(fruits));
//        System.out.println(charArr + ": " + Arrays.toString(charArr));
    }
    public static void printArr(Object[] arr) {
        for(Object element : arr) {
            if (element instanceof Integer) {
                System.out.print(element + " ");
            } else if (element instanceof Character) {
                if (element.equals(arr[0])){
                    System.out.print("The character array elements are: " + element + " ");
                } else {
                    System.out.print(element + " ");
                }
            } else if (element instanceof String) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
//    static String whoLikesItSwitchAndArray(String... likeName) {
//
//    }
    /*  give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed,
    shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the
    perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80 */
    static BigInteger perimeter(BigInteger num) {
        BigInteger sum = BigInteger.valueOf(2);
        BigInteger tmp = BigInteger.valueOf(0);
        BigInteger firstNum = BigInteger.valueOf(1);
        BigInteger secondNum = BigInteger.valueOf(1);
        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(num) < 0; i = i.add(BigInteger.ONE)) {
            tmp = firstNum.add(secondNum);  //2   3
            sum = sum.add(tmp);             //2   5
            firstNum = secondNum;                 //1   2
            secondNum = tmp;                //2
            System.out.println(sum);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
    /* write a function which increments a string, to create a new string. foo-->foo1, foobar23-->foobar24
    If the string already ends with a number, the number should be incremented by 1. foo0042 --> foo0043
    If the string does not end with a number. the number 1 should be appended to the new string. */
    static String incrementString(String str) {
        int index = str.length();
        for (int i = str.length() - 1; i >= 0; i--) {
            char chr = str.charAt(i);
            if (Character.isDigit(chr) && chr != '0') {
               index--;
               continue;
            } else if (Character.isDigit(chr) && chr == '0') {
                index--;
                break;
            } else {
                break;
            }
        }
        if (index < str.length()) {
            int sizeOfDigits = str.length() - 1 - index + 1;
            BigInteger digitPart = new BigInteger(str.substring(index));
            digitPart = digitPart.add(BigInteger.ONE);
            String digitString = digitPart.toString();
            if (digitString.length() < sizeOfDigits) {
                for (int i = 0; i < (sizeOfDigits - digitString.length()); i++) {
                    digitString = '0' + digitString;
                }
            }
            if (digitString.length() == str.length() + 1) {
                return digitString;
            }
            if (digitString.length() > str.substring(index).length() && str.charAt(index - 1) == '0') {
                return str.substring(0, index - 1) + digitString;
            } else {
                return str.substring(0, index) + digitString;
            }
        }
        return str + 1;
    }
    static String incrementString2(String str) {   //"[eFEJ-X\~`?pxv"b7811888171935994764993137
        int index = str.length();                             //
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                index = i;                                   //
            } else {
                break;
            }
        }
        String nonNumberPart = str.substring(0, index);      //
        String numberPart = str.substring(index);            //
        int zeroIndex = numberPart.length();                 //
        if (numberPart.length() == 0) {
            return nonNumberPart + 1;
        } else {         //num part size not 0
            for (int i = numberPart.length() - 1; i >= 0; i--) {
                if (numberPart.charAt(i) == '0') {
                    zeroIndex = i;                           //
                    break;
                }
            }

            if (zeroIndex != numberPart.length()) {    //zero(s) in numberpart
                String numberPartZeroPart = numberPart.substring(0, zeroIndex + 1);
                String numberPartNonZeroPart = numberPart.substring(zeroIndex + 1);
                if (numberPartNonZeroPart.length() == 0) {
                    return nonNumberPart + numberPartZeroPart.substring(0, zeroIndex) + 1;
                }
                if (numberPartNonZeroPart.length() > 18) {
                    Long numberPartNonZeroPart2 = Long.parseLong(numberPartNonZeroPart.substring(numberPartNonZeroPart.length() - 18));
                    numberPartNonZeroPart2++;
                    if (numberPartNonZeroPart2.toString().length() > numberPartNonZeroPart.substring(numberPartNonZeroPart.length() - 18).length()) {
                        return nonNumberPart + numberPartZeroPart.substring(0,numberPartZeroPart.length() - 1) + numberPartNonZeroPart.substring(0,numberPartNonZeroPart.length() - 18) + numberPartNonZeroPart2;

                    }
                    return nonNumberPart + numberPartZeroPart + numberPartNonZeroPart.substring(0,numberPartNonZeroPart.length() - 18) + numberPartNonZeroPart2;
                }
                Long numberPartNonZeroPartIncremented = Long.parseLong(numberPartNonZeroPart) + 1;
                if (numberPartNonZeroPartIncremented.toString().length() > numberPartNonZeroPart.length()) {
                    return nonNumberPart + numberPartZeroPart.substring(0,numberPartZeroPart.length() - 1) + numberPartNonZeroPartIncremented;
                }
                return nonNumberPart + numberPartZeroPart + numberPartNonZeroPartIncremented;

            }
            if (numberPart.length() > 18) {
                Long numberPartSecond = Long.parseLong(numberPart.substring(numberPart.length() - 18));
                numberPartSecond++;
                return nonNumberPart + numberPart.substring(0,numberPart.length() - 18) + numberPartSecond;
            }
            Long incrementedNumberPart = Long.parseLong(numberPart) + 1;
            return nonNumberPart + incrementedNumberPart;
        }


    }


    static String whoLikesIt(String[] likeName) {
        String str = "";
        if (likeName.length == 3) {
            str = likeName[0] + ", " + likeName[1] + " and " + likeName[2] + " like this";
        } else if (likeName.length == 2) {
            str = likeName[0] + " and " + likeName[1] + " like this";
        } else if (likeName.length == 1) {
            str = likeName[0] + " like this";
        } else if (likeName.length == 0) {
            str = "No one like this";
        } else if (likeName.length > 3) {
            str = likeName[0] + ", " + likeName[1] + " and " + (likeName.length - 2) + " others like this";

        }
        return str;
    }
    static String whoLikesItSwitch(String... likeName) {
        switch (likeName.length) {
            case 0: return "Using switch, no one likes this";
            case 1: return String.format("Using switch, %s likes this", likeName[0]);
            case 2: return String.format("Using switch, %s and %s like this", likeName[0], likeName[1]);
            case 3: return String.format("Using switch, %s, %s and %s like this", likeName[0], likeName[1], likeName[2]);
            default: return String.format("Using switch, %s, %s and %d others like this", likeName[0], likeName[1], likeName.length - 2);
        }
    }

    static void writePyramid(int height) {
        for (int i = 1; i <= height; i++) {  //space = height - i; star = 2*i - 1
            for (int s = 1; s <= height - i; s++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printFibonacciRecursion(int level) {
        System.out.print(">>>The first " + level + "  Fibonacci numbers are(recursion): ");
        for (int i = 0; i < level; i++) {
            System.out.print(Fib(i) + " ");
        }
    }
    static int Fib(int num) {
        if (num < 2)
            return num;
        return Fib(num - 1) + Fib(num - 2);

    }
    static void printFibonacci() { //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        System.out.print(">>>The first 10 Fibonacci numbers are(regular method): ");
        int num1 = 0, num2 = 1;
        for (int i = 0; i <= 9; i++) {
            System.out.print(num1 + " ");
            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
    static void printUpperLetters(int startNum, int endNum) {
        if (endNum >= startNum) {
            for (int i = startNum; i <= endNum; i++) {  //65~90 upper, 97~122 lower
                System.out.println("The ASCII code of " + (char) i + " is " + i);
            }
        } else {
            System.out.println("The entered range is not valid.");
        }
    }
    static void multiplicationFromNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to calculate the multiplication table: ");
        int num = scanner.nextInt();
        System.out.print("Please enter a number for the up limit of the multiplication table: ");
        int upLimit = scanner.nextInt();
        for (int i = 0; i <= upLimit; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

    }


    static void printIntAfterIncrement1(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            intArr[i]++;
            System.out.print(intArr[i] + " ");
        }
    }
}
