package CodeTask;
/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
 */
public class Task1 {
    public static void main(String[] args) {

        int[] temp={23,32,45,35,26,56,41};
        int tempMax=temp[0];
        int tempMin=temp[0];



        /*for (int i=0; i<temp.length;i++){
            if (temp[i]>temp[i+1]){
                System.out.println("Highest temp is"+" "+temp[i]);
            }*/
        for (int i=0; i<temp.length; i++){
            if (temp[i]< tempMin){
                tempMin=temp[i];
            }
            if (temp[i]>tempMax){
                tempMax=temp[i];
            }

        }
        System.out.println("Lowest temp of the week is"+" "+tempMin);
        System.out.println("Highest temp of the week is"+" "+tempMax);

    }
}
