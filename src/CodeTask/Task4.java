package CodeTask;
/*
Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.

 */
public class Task4 {
    public static void main(String[] args) {

        int[][] ArrInt = {
                {13, 32, 54, 43, 81,},
                {12, 42, 9, 41, 15, 31},
                {84, 61, 21, 19, 23, 20},
        };
        int oddnum = ArrInt[0][0];
        int evenum = ArrInt[0][0];


        for (int i = 0; i < ArrInt.length; i++) {
            for (int j = 0; j < ArrInt[i].length; j++) {
                if (ArrInt[i][j] % 2 == 0) {
                    evenum = evenum + ArrInt[i][j];
                } else {
                    if (ArrInt[i][j] % 2 != 0) {
                        oddnum = oddnum + ArrInt[i][j];
                    }
                }

            }

        }
        System.out.println(oddnum);
        System.out.println(evenum);
    }
}
