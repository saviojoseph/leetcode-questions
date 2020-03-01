class Solution {
    public int[] sortedSquares(int[] A) {
        
        int[] arr2 = new int[A.length];
        int start = 0;
        int end = A.length - 1;
        
        while (start <= end){
            if (Math.abs(A[start]) > Math.abs(A[end])){
                arr2[end - start] = A[start] * A[start];
                start++;
            }else{
            
                arr2[end - start] = A[end]*A[end];
                end--;
        }
    
    }
        return arr2;
    }
}