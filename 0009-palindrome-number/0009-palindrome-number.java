class Solution {
    public boolean isPalindrome(int x) {
    
        if(x < 0){return  false;}
        if(x == 0){return true;}
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE ){
            int i=0;
            String newNumber = "";
            int CopyNumber =x;
           while(CopyNumber > 0){

             newNumber =newNumber +CopyNumber % 10;
               CopyNumber =CopyNumber /10;

               i++;
           }
            System.out.println(newNumber);
           if(newNumber.equalsIgnoreCase(String.valueOf(x))){
               return true;
           }

        }
        return false;
    }

}