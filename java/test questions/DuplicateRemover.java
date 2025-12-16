// remove all duplicates from the String


class DuplicateRemover{
    public static void main(String[] args){
        String str = "hello world";
        String res = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
                if(res.indexOf(str.charAt(i)) == -1){
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }
}
}

//explanation
// 1. we are using for loop to iterate over the string
// 2. we are using indexOf method to find the index of the character in the string
// 3. we are using if condition to check if the index of the character is equal to the index of the character in the string