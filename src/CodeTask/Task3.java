package CodeTask;
/*
Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only
 */
public class Task3 {
    public static void main(String[] args) {

        int[][] arra2d = {
                {12, 13, 15, 14, 17},
                {32, 16, 31, 15, 18},
                {62, 18, 20, 28, 19},
        };
        for (int i = 0; i < arra2d.length; i++) {
            for (int j = 0; j < arra2d[i].length; j++) {
                if (arra2d[i][j]%2==0){
                    System.out.print(arra2d[i][j]+" ");

                }


            }


        }
    }
}
