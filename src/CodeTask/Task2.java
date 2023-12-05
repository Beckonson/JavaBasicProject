package CodeTask;
/*
Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.
 */
public class Task2 {
    public static void main(String[] args) {

        int[] num={20,34,54,23,27,21,82};
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);


    }
}
