
import java.util.Random;


public class task2
 {
    public static void main(String[] args)

    {
        int[] arr = new int[10];
          Random rnd = new Random();

          System.out.println("Array: ");

          for (int i = 0; i < arr.length; i++)
            {
             arr[i] = rnd.nextInt(100) + 1;

             System.out.println(arr[i] + "    ");

          }

          System.out.println();

            int min = arr[0];
             int max = arr[0];

             for (int v : arr)
             {
                  if (v < min) min =  v;
                  if (v > max)  max = v;
             }

          System.out.println("min = " + min);
        System.out.println("Max = " + max);


    }

}
