import java.math.BigInteger;


class Solution {
   
    public int myAtoi(String s) {
         String trimmed = s.trim();
        if(trimmed.contains("+-") || trimmed.contains("-+") || trimmed.startsWith("++") ){
            return 0;
        }

        String first = trimmed.replaceAll("[^0-9-+].*", "");
        System.out.println(first);
        String result = first.replaceAll("\\s+","");
        System.out.println(result);
        String[] finalArray = result.split("");
        String myNumberString ="";
        BigInteger mynumber = BigInteger.ZERO;
        boolean isNegitive = false;
        BigInteger temp = BigInteger.ONE;

        for (int i = 0; i < finalArray.length; i++){
            switch (finalArray[i]){
                case "-":
                    if(i != 0){
                        return Method(myNumberString,isNegitive);
                    }
                    isNegitive = true;
                    break;
                case "+":
                if(!myNumberString.isEmpty()){
                        return Method(myNumberString,isNegitive);

                }
                   continue;
                case "0","1","2","3","4","5","6","7","8","9":
                    myNumberString = myNumberString + finalArray[i];
                    break;
            }
        }
        System.out.println(mynumber);
        return  Method(myNumberString,isNegitive) ;
    }



    int Method(String n,boolean isNegitive){
        if(n.isEmpty()){return 0;}
        BigInteger num = new BigInteger(n);
      
        if(num.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0){
            num = isNegitive?num.multiply(BigInteger.valueOf(-1)):num;
           return isNegitive ? Integer.MAX_VALUE +1 :Integer.MAX_VALUE;
        }
         num = isNegitive?num.multiply(BigInteger.valueOf(-1)):num;
        return num.intValue();
    }}