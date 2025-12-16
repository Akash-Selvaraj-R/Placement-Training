//count total number of characters in a string(ignore spaces) in java

class CountTotalCharacters{
    public static void main(String[] args){
        String str = "hello world";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("Total number of characters: "+count);
    }
    }
