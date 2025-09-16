public class spiralMatrix {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
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
        System.out.println();

        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length -1 ;
        int endCol = arr[0].length -1;

        while(startCol <= endCol && startRow <= endRow){
        for(int top = startRow; top <= endCol; top++ ){
            System.out.print(arr[startRow][top]+" ");
        }
        for(int right = startRow + 1; right <= endCol; right++){
            System.out.print(arr[right][endCol]+" ");
            
        }
        for(int bottom = endCol -1 ; bottom >= startRow; bottom--){
            System.out.print(arr[endRow][bottom]+" ");
            
        }
        for(int left = endRow - 1; left > startRow; left--){
            System.out.print(arr[left][startCol]+" ");

        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
}
}
