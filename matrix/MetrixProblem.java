package matrix;
import java.util.Scanner;

public class MetrixProblem {
    // readMatrix method return a 2d array
    int[][] readMatrix(){
        // Used Scanner class to read input from keyboard
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int r=Integer.parseInt(sc.next());
        int c=Integer.parseInt(sc.next());
        int temp[][]=new int[r][c];
        System.out.println("Enter "+r*c+" numbers");
        for(int i = 0;i < r; i++){
            for(int j = 0; j < c; j++){
                temp[i][j]=Integer.parseInt(sc.next());
            }
        }
        return temp;
    }
    // method to add two matrix, method gets two 2d matrix "a" and "b" and return
    // another 2d matrix which is sum of two matrix

    int[][] addMatrix(int a[][], int b[][]){
        if(a.length != b.length || a[0].length != b[0].length){
            System.out.println("Please enter matrix of equal size !!!");
        }else {
            int r = a.length;
            int c = a[0].length;
            int temp[][] = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    temp[i][j] = a[i][j] + b[i][j];
                }
            }
            return temp;
        }
        return null;
    }
    // method getTranspose returns same matrix after doing transpose operation,
    // it takes an 2d matrix and return also 2d

    int[][] getTranspose(int temp[][]){
        int r=temp.length;
        int c=temp[0].length;
        int temp1[][]=new int[r][c];
        for (int i = 0;i < r; i++){
            for (int j = 0;j < c; j++){
                temp1[i][j] = temp[j][i];
            }
        }
        return temp1;
    }
    // method reverseColumnwise() return a 2d matrix after reversing each row
    // elements in each row itself.
    int[][] reverseColumnwise(int temp[][]){
        int r = temp.length;
        int c = temp[0].length;
        for (int i = 0; i < r; i++){
            for (int j = 0;j < temp[i].length/2;j++){
                int t = temp[i][j];
                temp[i][j] = temp[i][c-j-1];
                temp[i][c-j-1] = t;
            }
        }
        return temp;
    }
    // method getDiagonalElements return elements present in both diagonal of a
    // 2d matrix.
    Integer[][] getDiagonalElements(int[][] temp){
        int r=temp.length;
        int c=temp[0].length;
        if(r != c){
            System.out.println("matrix should have same row and cloumns !!");
        }else if (r == c) {

            Integer pdia[]=new Integer[r];
            Integer sdia[]=new Integer[c];
            for (int i = 0, j = temp.length-1; i < r; i++, j--) {
                pdia[i]=temp[i][i];
                sdia[i]=temp[i][j];
//                System.out.print(temp[i][i] + " " + temp[i][j] + " ");
            }
            System.out.print("Primary diagonal element---> ");
            for(int i = 0;i < pdia.length; i++){
                if (i != pdia.length-1){
                    System.out.print(pdia[i] +",");
                }
                System.out.print(pdia[i]);
            }
            System.out.println();
            System.out.print("Secondary diagonal element---> ");
            for(int i = 0;i < sdia.length; i++){
                if (i != sdia.length-1){
                    System.out.print(sdia[i] +",");
                }
                System.out.print(sdia[i]);
            }
//            Integer[][] res={pdia,sdia};
//            return res;
        }
        return null;
    }
    // displayMatrix method is used to display a 2d matrix
    void displayMatrix(int temp[][]){
        if(temp==null){
            return;
        }
        int r=temp.length;
        int c=temp[0].length;
        System.out.println("-----------------------------------------");
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
}