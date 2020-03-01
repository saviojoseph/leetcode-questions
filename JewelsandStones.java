class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
    
        char[] arr1 = J.toCharArray();
        char[] arr2 = S.toCharArray();
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){count++;}
            }
        }
        
        return count;
    }
}