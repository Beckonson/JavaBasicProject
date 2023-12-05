package CodeTask;
/*
Write a program to print out duplicate elements from an Array of Strings?
 */
public class Task10 {
    public static void main(String[] args) {

        String[] car = {"Toyota", "Benz", "Chevrolet", "Benz", "Nissan", "Kia", "Benz" };
        int count = 0;
        for (int i = 0; i < car.length; i++) {
            if (car[i].equals(car[1])) {
                count++;
                System.out.println(car[i] + count + " times");

            }


        }

    }
}