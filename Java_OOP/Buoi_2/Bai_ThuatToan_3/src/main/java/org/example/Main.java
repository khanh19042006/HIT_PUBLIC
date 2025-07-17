import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];

        int val = 1;
        int top = 1;
        int bot = n;
        int right = n;
        int left = 1;
        while (val <= n*n){
            for (int i = left; i <= right; i++){
                a[top][i] = val;
                val++;
            }
            top++;

            if (top > bot) break;

            for (int i = top; i <= bot; i++){
                a[i][right] = val;
                val++;

            }
            right--;

            if (right < left) break;

            for (int i = right; i >= left; i--){
                a[bot][i] = val;
                val++;
            }
            bot--;

            if (bot < top) break;

            for (int i = bot; i >= top; i--) {
                a[i][left] = val;
                val++;
            }
            left++;

            if (left > right) break;
        }

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}