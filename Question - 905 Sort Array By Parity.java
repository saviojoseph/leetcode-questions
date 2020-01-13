class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int res[] = new int[A.length];
        int x = 0;
        
        
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
            res[x] = A[i];
            x++;
            }
        }
        
         for(int y = 0; y < A.length; y++){
            if(A[y]%2 != 0){
            res[x] = A[y];
            x++;
            }
        }
        
        
        return res;
        

    }
}