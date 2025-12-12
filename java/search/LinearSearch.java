/*
given a 2d array or martix,
search for a vaulue using linear search written row and column index of the element
*/

class LinearSearch{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 8;
        int[] ans = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    System.out.println("element found at index " + ans[0] + " " + ans[1]);
                    return;
                }
            }
        }
        System.out.println("element not found");
    }
}

