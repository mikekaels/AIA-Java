package day5;

public class Typetester {
    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }

    void printType(String x) {
        System.out.println(x + " is a String");
    }

    void printType(char x[]) {
        System.out.println(x + " is an array of char");
    }
}