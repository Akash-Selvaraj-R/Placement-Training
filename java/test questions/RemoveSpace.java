//to remove all spaces from a string

class RemoveSpace{
    public static void main(String[] args){
        String str="Hello World";
        String str1="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}

