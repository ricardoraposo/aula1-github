import java.util.Scanner;
public class finder{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] mat = new int[m][n];
    for (int i = 0;i<mat.length;i++){
      for (int j = 0;j <mat[i].length;j++){
        mat[i][j] = sc.nextInt();
      }
    }
    System.out.println(mat.length);

    int number = sc.nextInt();
    for (int i = 0;i<mat.length;i++){
      for (int j = 0;j<mat[i].length;j++){
        if (mat[i][j] == number){
          System.out.println("Position: " + i + "," + j);
          if (i>0){
            System.out.println("Up: " + mat[i-1][j]);
          }
          if (i< mat.length-1){
            System.out.println("Down: " + mat[i+1][j]);
          }
          if (j>0){
            System.out.println("Left: " + mat[i][j-1]);
          }
          if (j< mat[i].length-1){
            System.out.println("Right: " + mat[i][j+1]);
          }
        }
      }
    }
  }
}
