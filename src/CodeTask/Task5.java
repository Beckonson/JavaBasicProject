package CodeTask;
/*
Write a program to swap 2 numbers without a temporary variable?
 */
public class Task5 {
    public static void main(String[] args) {

        int one=1;
        int two=2;
        one=one+two;
        two=one-two;
        one=one-two;
        System.out.println(one+" "+two);
    }
}
