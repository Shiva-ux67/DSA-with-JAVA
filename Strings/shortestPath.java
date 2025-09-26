public class shortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNNN";
        int x = 0; 
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if(curr == 'W'){
                x--;
            }
            else if(curr == 'N'){
                y++;
            }
            else if(curr == 'E'){
                x++;
            }else{
                y--;
            }
        }
        double distance = Math.sqrt(y*y - x*x);
        System.out.println("the shortest path is the: "+ distance);
    }
}
