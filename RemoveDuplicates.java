public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "ABCABC";
        String input2 = "ABC";
        String result = "";
        if(input2.contains(result)){
        for (int i = 0; i < input.length(); i++)
         {
            char ch = input.charAt(i);
            if (result.indexOf(ch) == -1)
            {
                result += ch;
            }
        }
        System.out.println("Without duplicates: " + result);
    }
        else {
            System.out.println(" ");
}
}}

