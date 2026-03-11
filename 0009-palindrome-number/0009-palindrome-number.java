class Solution {
    public boolean isPalindrome(int x) {
    
        if(x < 0){return  false;}
        if(x == 0){return true;}
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE ){
            String newNumber = "";
            int CopyNumber =x;
           while(CopyNumber > 0){

             newNumber =newNumber +CopyNumber % 10;
               CopyNumber =CopyNumber /10;
           }
           if(newNumber.equalsIgnoreCase(String.valueOf(x))){
               return true;
           }

        }
        return false;
    }

}