package CodeTask;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series
 */
public class Task7 {
    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
