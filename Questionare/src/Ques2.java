import java.util.HashMap;
import java.util.Map;


public class Ques2 {

	public void bankMap(String key)
	{
		Map banks = new HashMap();
		
		banks.put("PNB","Punjab National Bank");
		banks.put("SBI","State Bank");
		banks.put("RBI","Reserve Bank");
		banks.put("OBI","Other Bank");
		
		Map location = new HashMap();
		
		location.put("RBI","MUM");
		location.put("PNB","DEL");
		location.put("SBI","BLR");
		location.put("OBI","CAL");
		
		if(banks.containsKey(key) && (location.containsKey(key)))
		{
			System.out.println("Code entered:" + key);
			System.out.println("Bank Name:"+ banks.get(key));
			System.out.println("City code:" + location.get(key));
			
		}
			
		else
		{
			System.out.println("Incomplete data");
		}
	}
	
}
