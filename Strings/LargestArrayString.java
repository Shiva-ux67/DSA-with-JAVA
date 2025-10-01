public class LargestArrayString {
    public static void main(String[] args) {
        String[] names = {"Shiva", "Akhil","Nancy","Mahiva"};
        String s = "";
        int len = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > len){
                s = names[i];
                len = names[i].length();
            }
        }
        System.out.println("The largest String is the: "+ s);
    }
}
