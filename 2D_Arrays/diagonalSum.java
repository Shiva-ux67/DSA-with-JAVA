public class diagonalSum {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[][] arr = new int[m][n];
        int c = 1;
        for(int i = 0; i < m;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = c++;
            }
        }
        for(int i = 0; i < m;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        int i = 0;
        int j = 0;
        int k = m - 1 ;
        while(i < m && k >= 0){
            sum += arr[i][j]; 
            sum += arr[i][k];
            if(arr[i][j] == arr[i][k]){
                sum -= arr[i][k];
            }
            i++;
            j++;
            k--;
        }
        System.out.println("The Diagonal Sum is to : "+ sum);
    }
}
