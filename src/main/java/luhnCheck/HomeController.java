package luhnCheck;
/**
 * HomeController class is controlling a RequestMapping and give a respond for /checkluhn
 * 
 * @author Tobiasz Kubiak
 */

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class HomeController {  
	@RequestMapping("/checkluhn")
    String home(){
		
		StringBuilder sb = new StringBuilder("292723200000000021");
		
		char a = LuhnAlgorithm.GenerateCheckDigit(sb);
		
		StringBuilder finalNumberToCheck = sb.append(a);
		
		if(LuhnAlgorithm.CheckLuhnNumber(finalNumberToCheck))
			return "Number is valid";
		else
			return "Number is invalid";
		
    }

}  