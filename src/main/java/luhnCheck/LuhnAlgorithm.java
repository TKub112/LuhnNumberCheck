package luhnCheck;

/**
 * LuhnAlgorithm class is implementation of Luhn validation
 * 
 * @author Tobiasz Kubiak
 */

public class LuhnAlgorithm {
	 /**
	 * Method that calculate a check digit
	 * 
	 * @param numberToCheck - given number to generate a check digit
	 * @return checkDigit - calculated check digit
	 */
     public static char GenerateCheckDigit(StringBuilder numberToCheck){
            boolean evenPosition = true;
            int sumator = 0;
            for (int indexStr = numberToCheck.length()-1; indexStr>= 0 ; indexStr--){
	        		int tmp = (char) Character.getNumericValue(numberToCheck.charAt(indexStr));
	                if(!evenPosition){
	                    tmp*=2;
	                    if (tmp>9){
	                    	 tmp=1+(tmp%10);
	                    }
	                }
	                evenPosition=!evenPosition;
	                sumator+=tmp;
	                
            }
            sumator=sumator%10;
            if(sumator != 0){
            	
            	sumator=10-sumator;
            }
            
            char checkDigit=(char)(sumator+'0');  
            System.out.println(checkDigit);
            return checkDigit;
     }
     /**
 	 * Method that validate a number
 	 * 
 	 * @param numberToCheck - given number to generate a check  number
 	 * @return boolean true false - if true the number is valid,otherwise if false the number is not valid
 	 */
     public static boolean CheckLuhnNumber(StringBuilder numberToCheck){
         boolean evenPosition = false;
         int sumator = 0;
         for (int indexStr = numberToCheck.length()-1; indexStr>= 0 ; indexStr--){
        	 	 int tmp = (char) Character.getNumericValue(numberToCheck.charAt(indexStr));
                 if(!evenPosition){
                         tmp *= 2;
                         if (tmp>9){
                        	  tmp=(tmp%10)+1;
                         }
                 }
                 evenPosition=!evenPosition;
                 sumator+=tmp;
                 
         }
         if(sumator%10 == 0)
         	return true;
         else
        	return false;
        	 
         
  }
}



