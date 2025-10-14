import java.util.Scanner;

public class Bai5 {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args){
        int n = Integer.parseInt(sc.nextLine());

        int[][] a = new int[n+1][n+1];
        xoan_oc(a, n);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void xoan_oc (int[][] a, int n) {
        int top = 1;
        int bot = n;
        int left = 1;
        int right = n;
        int value = 1;

        while (value <= n*n){
            if (left > right) return;
            for (int i = left; i <= right; i++) {
                a[top][i] = value;
                value++;
            }
            top++;

            if (top > bot) return;
            for (int i = top; i <= bot; i++) {
                a[i][right] = value;
                value++;
            }
            right--;

            if (right < left) return;
            for (int i = right; i >= left; i--) {
                a[bot][i] = value;
                value++;
            }
            bot--;

            if (bot < top) return;
            for (int i = bot; i >= top; i--) {
                a[i][left] = value;
                value++;
            }
            left++;
        }
    }
}
