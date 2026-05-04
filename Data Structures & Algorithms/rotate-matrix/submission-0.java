class Solution {
    int n;
    public void rotate(int[][] matrix) {
        this.n = matrix.length;
        // transpose
        for(int i =0; i < n; i++){
            for(int j = i +1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse

        for(int [] arr : matrix){
            reverse(arr);
        }
    }

    private void reverse(int [] arr){
        int left =0;
        int right = n -1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
