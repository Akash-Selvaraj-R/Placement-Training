//simple example for 2d array in java using the elements as [1,2,3],[4,5,6]

class Array2D{
	public static void main(String[] args){
		int arr[][] = {{1,2,3},{4,5,6}};
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//output
//1 2 3 
//4 5 6 