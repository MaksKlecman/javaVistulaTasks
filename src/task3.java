 class task3 {
     public static void main(String[] args)
     {
         int[][] matrix = new int[10][10];
         int sum = 0;


         for (int i = 0; i <= 9; i++)
         {
             for (int j = 0; j <= 9; j++)
             {
               if (i == j)
               {
                   matrix[i][j] = i;
                   sum += i;

               }

                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }
         System.out.println("Sum of diagonal elements: " + sum);
     }
 }
