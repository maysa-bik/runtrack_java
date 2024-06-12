package Jour01.job09;

public class MyString {
    public static void main(String[] args) {
        String str1 = "Hello"; // Declaration method 1
        String str2 = new String("World"); // Declaration method 2
        String str3 = "Hello, World!".substring(0, 5); // Declaration method 3
        String str4 = String.join(", ", "Hello", "World"); // Declaration method 4

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}

