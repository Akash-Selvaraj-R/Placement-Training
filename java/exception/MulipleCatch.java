public class MulipleCatch{
    public static void main(String[] args) {
        try{
            String[] data = {"10","20","abc"};
            int num= Integer.parseInt(data[2]);
            System.out.println("Number"+num);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        finally{
            System.out.println("Mutli-catch demo finally block");
        }
    }

}