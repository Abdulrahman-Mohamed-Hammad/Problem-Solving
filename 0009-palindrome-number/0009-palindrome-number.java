class Solution {
    public boolean isPalindrome(int x) {
        var numberOfDigit = numberOfDigit(x);
        if(x < 0){return  false;}
        if(x == 0){return true;}
        if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE ){
            int i=0;
            String newNumber = "";
            int CopyNumber =x;
           while(i < numberOfDigit){

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
    
    public   int numberOfDigit(int number){

        int numberOfdigit =0;
        number = Math.abs(number);
        if(number ==0){return  1;}
        while (number > 0){
            number =number /10;
            numberOfdigit++;
        }
        return numberOfdigit;
    }
}