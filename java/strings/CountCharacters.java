public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int count = 0;
        for (char ch : str.toCharArray())
            {
            if (ch == ' '){
                count++;
        }
    }
    System.out.println("Total length in string: " + count);
    }
}
   