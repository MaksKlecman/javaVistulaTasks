   public class task3

   {
       public static void main(String[] args)
       {
            int[][] matrix = new int[10][10];
             int sum = 0;


           for(int i = 0; i < 10; i++ )
           {
               for (int j = 0; j < 10; j++)
               {
                   if (i == j)
                   {
                       matrix[i][j] = i;
                       sum = sum + matrix[i][j];
                   }
                   else

                   {
                       matrix[i][j] = 0;
                   }
               }
           }

           System.out.println("matrix:");
           for (int i = 0; i < 10; i++)

           {
               for (int j = 0; j < 10; j++)
               {
                   System.out.print(matrix[i][j] + " ");
               }

                 System.out.println();


           }

           System.out.println("sum of dagonal =  "  + sum);

   }
}
