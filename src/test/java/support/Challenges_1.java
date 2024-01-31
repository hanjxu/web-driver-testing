package support;

import java.util.*;

public class Challenges {

    public static void main(String[] args) {
//        System.out.println("Coding channenges");
//        System.out.println("Print all elements of int array");
//        int[] intArr1 = {5, 3, 7, 10, 1};
//        printArray(intArr1);
//        System.out.println("Print every 2nd element of int array");
//        printEvery2ndEl(intArr1);

        /* User inputs two numbers which are divided by 5.
        If a number is in a range of 1..10 - print it saying it is in the range of 1 from 10.
        If a number is in the range of 10..20 - print it saying it's in the range of 10..20. */
//        Scanner scanner;
//        scanner = new Scanner(System.in);
//        System.out.println("Please enter the first number: ");
//        double num1 = scanner.nextDouble()/5;
//        System.out.println("Please enter the second number: ");
//        double num2 = scanner.nextDouble()/5;
//        checkNumRange(num1);
//        checkNumRange(num2);
//        scanner.close();

        //Remove vowels in the given string (no count, just remove)
//        String sentence = "A class can be inherited by another class using the keyword 'extends'. ";
//        System.out.println(">>>The string before operation: " + sentence);
//        removeVowels(sentence);

        //Find if array contains duplicates. Like {5, 1, 4, 3, 1, 7, 9} - contains two 1s. Hint - use nested loops.
//        int[] intArr2 = {5, 1, 4, 3, 1, 7, 4, 9};
//        System.out.println(">>>>>The integer array is: " + Arrays.toString(intArr2));
//        for (int i = 0; i < intArr2.length - 1; i++) {
//            for (int j = i + 1; j < intArr2.length; j++) {
//                if (intArr2[i] == intArr2[j]) {
//                    System.out.println(">>>There is duplicate in index " + i + " and " + j + " with the value of " + intArr2[i]);
//                }
//            }
//        }

        //Reverse every second character of the string. Example for WebDriver => eibW
        String str1 = "WebDriver";
        System.out.println(">>>>>The original string: " + str1);
        String str2 = "";
        for (int i = 0; i < str1.length(); i += 2) {
            str2 = str1.charAt(i) + str2;
        }
        System.out.println(">>>>>Reverse and print every second character of the string: " + str2);

        // Find duplicates across 2 different arrays (only duplicates between two arrays, not inside). Example: {5, 3, 1, 8, 2} and {4, 11, 18, 8, 7}. Duplicate - 7.
        int[] intArr3 = {5, 3, 1, 8, 8, 18, 2};
        int[] intArr4 = {4, 11, 18, 8, 7, 2, 3, 3};
        Map<Integer, Integer> duplicateMap =  new HashMap<>();
        for (int i = 0; i < intArr3.length; i++) {
            for (int j = 0; j < intArr4.length; j++) {
                boolean b = duplicateMap.containsKey(intArr3[i]);
                if (intArr3[i] == intArr4[j]) {
                    if (b == true) {
                        Integer i1 = duplicateMap.get(intArr3[i]) + 1;
                        duplicateMap.put(intArr3[i], i1);
                    } else {
                        duplicateMap.putIfAbsent(intArr3[i], 1);
                    }
                }
            }
        }
        System.out.println(">>>>>The frequency of the duplicate numbers:");
        System.out.println(Arrays.asList(duplicateMap));
        System.out.println( " or " + Collections.singleton(duplicateMap) + "\n" + "or ");
        for (Map.Entry<Integer, Integer> e : duplicateMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        //Find 3 max numbers in the array.
        int[] intArr5 = {4, 11, 18, 18, 8, 7, 2, 3, 3, 9};
        int max1 =  Integer.MIN_VALUE;
        int max2 =  Integer.MIN_VALUE;
        int max3 =  Integer.MIN_VALUE;
        for (int i = 0; i < intArr5.length; i++) {
            if ((intArr5[i] == max1) || (intArr5[i] == max2) || (intArr5[i] == max3)) {
                continue;
            }
            if (intArr5[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = intArr5[i];
            } else if (intArr5[i] > max2) {
                max3 = max2;
                max2 = intArr5[i];
            }else if (intArr5[i] > max3) {
                max3 = intArr5[i];
            }
        }
        System.out.println(">>>>>The integer array is: " + Arrays.toString(intArr5));
        System.out.println(">>>The biggest num of the array is: " + max1);
        System.out.println(">>>The second biggest num of the array is: " + max2);
        System.out.println(">>>The third biggest num of the array is: " + max3);





//        int n = 25;
//        System.out.println("Print number from 0 to n(25):");
//        printNumber(n);  //  1) Write a function that prints all numbers from 0 up to n printNumber(25) also fine(pri)
//        char[] chr = {'W', 'e', 'b'};
//        String[] fruits = {"apple", "plum", "banana"};
//        System.out.println();
//        checkEmpty(chr);   //  2) Write a function that checks if array is empty, can return boolean if specify in func.
//        // System.out.println(checkEmpty(chr));
//        int[] intArr2 = {5, 2, 3, 1, 4, 9, 8, 13, 14, 28, 0, 25, 39, 56, 17};
//        System.out.println();
//        printEvenNumFromArr(intArr2);   //  3) Write a function that prints all even numbers from integer array
//
//        //Given array: {5, 2, 9, 7, 3}
//        System.out.println("Write a function that swaps 2 array elements - 3rd and 5th");
//        int[] intArray4 = {5, 2, 9, 7, 3};
//        int[] intArray5 = {1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(intArray4)); //array need to call method to print the value or addr printed
//        int[] result1 = swap3rd5thInArr(intArray4);
//        int[] result2 = swap3rd5thInArr(intArray5);
//        System.out.println(Arrays.toString(result1));
//        System.out.println(Arrays.toString(result2));
//        System.out.println("Write a function that swaps 2 var - a and b. print results");
//        int a = 3;
//        int b = 5;
//        swap2var(a,b);  //swap2var(a:3,b:5);
//        //write func accepts int and prints
//        System.out.println("Divisible by 3 and 4");
//        divisibleBy3And4(6);
//        divisibleBy3And4(8);
//        divisibleBy3And4(12);
//        System.out.println("Here is Fizz and Buzz game:");
//        fizzBuzz1(15);
//        fizzBuzz1(9);
//        fizzBuzz1(25);
//        //write func accepts int argu and prints nums from 1 to num
//        //but: Fizz for num is divisible by 3, Buzz for num is divisible by 5, FizzBuzz for both
//        //Expected output: 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
//        fizzBuzz(15);

    }
    static void removeVowels(String strArr) {
        String strWithOutVowels = "";
        String strLower = strArr.toLowerCase();
        for (int i = 0; i < strLower.length(); i++) {
            if (strLower.charAt(i) != 'a' & strLower.charAt(i) != 'e' & strLower.charAt(i) != 'i' & strLower.charAt(i) != 'o' & strLower.charAt(i) != 'u') {
                strWithOutVowels += strArr.charAt(i);
            }

        }
        System.out.println(">>>The string without vowels is: " + strWithOutVowels);
    }
    static void checkNumRange(double num) {
        if (num >= 1 && num <= 10) {
            System.out.println(num + " is the value you entered and divided by 5, it is in the range of 1..10.");
        } else if (num >= 10 && num <= 20) {
            System.out.println(num + " is the value you entered and divided by 5, it is in the range of 10..20.");
        }
    }
    static void fizzBuzz(int limit) {
        for (int i = 1; i<= limit; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    static void fizzBuzz1(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz " + num);
        } else if (num % 3 == 0) {
            System.out.println("Fizz " + num);
        } else if (num % 5 == 0) {
            System.out.println("Buzz " + num);
        }

    }
    static void divisibleBy3And4(int num) {
        if (num % 3 == 0 && num % 4 == 0) {
            System.out.println("Divisible by 3 and 4");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3");
        } else if (num % 4 == 0) {
            System.out.println("Divisible by 4");
        }

    }
    static void swap2var(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
        int c = a;  //a = a + b--a is sum of both 8, b = a - b; a = a - b; 3+5=8, 8-5=3, 8-3=5
        a = b;
        b = c;
        System.out.println("a: " + a + ", b: " + b);
    }
    static int[] swap3rd5thInArr(int[] arr) {
        int temp = arr[2];
        arr[2] = arr[4];
        arr[4] = temp;
        return arr;

    }
    static void printEvenNumFromArr(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            if ((intArr[i] % 2) == 0) {
                System.out.println("The even number is: " + intArr[i] + " with the index " + i + "  ");
            }
        }
    }
    static void checkEmpty(char[] chars) {    //boolean as return
        if (chars.length > 0) {
            System.out.print("The char array is not empty: ");
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
           // return true;
        } else {
            System.out.println("The char array is empty.");
          //  return false;
        }
    }
    static void printNumber(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    static void printArray(int[] arr) {
        System.out.print("Here is the array to work with: " + Arrays.toString(arr));
        System.out.println();
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    static void printEvery2ndEl(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + 3) % 2 == 0) {
                System.out.println(arr[i] + " ");
            } else {
                System.out.println("Skipping.");
            }
        }

    }
}