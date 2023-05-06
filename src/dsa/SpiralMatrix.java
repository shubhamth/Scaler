package dsa;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
    int [][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10}
            ,{11,12,13,14,15}

    };
        generateMatrix(4);
    //printSpiral(arr);
    }

    public static void printSpiral(int [][]arr){
         int rMax = arr.length-1  , cMax = arr[0].length - 1;
         int n = arr.length ;
         int m =arr[0].length;
         int rMin =0, cMin = 0,count = 0;
         while(count < n * m){
             //top boundary
             for(int col = cMin; col <= cMax && count < n * m; col++ ){
                 System.out.print(" "+arr[rMin][col]);
                 count++;
             }
              rMin++;
             // right boundary
             for(int row = rMin; row <= rMax && count < n * m; row++ ){
                 System.out.print(" "+arr[row][cMax]);
                 count++;
             }
             cMax--;

             //bottom boundary
             for (int col = cMax ; col >= cMin && count < n * m; col--){
                 System.out.print(" "+arr[rMax][col]);
                 count++;
             }
             rMax--;

             // left boundary
             for(int row = rMax ; row >= rMin && count < n * m ; row--){
                 System.out.print(" "+arr[row][cMin]);
                 count++;
             }
            cMin++;
         }
    }
    public static  int[][] generateMatrix(int A) {
        System.out.println("Hello");
        //int [][] arr =  new int[A][A];
        int[][] arr = new int[A][A];
        int arrayLength = A * A ;
        int count =  1;
        int rmax = A-1, cmax = A-1;
        int rmin =0 , cmin = 0;
        while (count  <= arrayLength ){
            for(int col = cmin; col <= cmax; col++){
                 arr[rmin][col] = count++;
            }
            rmin++;
            for(int row = rmin; row <=  rmax && count  <= arrayLength ;row++){
                 arr[row][cmax] = count++;

            }
            cmax--;

            for(int col = cmax; col >= cmin && count  <= arrayLength ;col--){
                System.out.print(" "+ count);

                arr[rmax][col] = count++;

            }
            rmax--;
            for(int row = rmax; row>=  rmin && count  <= arrayLength ;row--){
                System.out.print(" "+ count);

                arr[row][cmin] = count++;

            }
            cmin++;
        }

        //print the arrayLength
        for(int row = 0 ; row <=  A-1; row++){
            for(int col = 0 ; col <= A-1; col++){
                System.out.print(" "+ arr[row][col]);
            }
            System.out.println();
        }

        return arr;
    }
}
