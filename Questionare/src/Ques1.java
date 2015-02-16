import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ques1 {

	public String[] sortString(String[] string1, String[] string2)
	{
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(string1));
		List<String> list2 = new ArrayList<String>(Arrays.asList(string2));
		int y=0;
		for(int i=0; i<list2.size();i++)
		{
			//System.out.println("---------");
			//System.out.println(y);
			for(int j=y; j<list1.size();j++)
			{
				if(list1.get(j).equals(list2.get(i)))
				{
					int x=j;
					while(x<(list1.size() - 1))
					{
						list1.set(x,list1.get(x+1));
						x=x+1;
					}
					
					list1.remove(x);
					
					y=j;
					break;
				}
			}
		}
		
		string1 = list1.toArray(new String[0]);
		
		return string1;
	}
	
	public void printStringArray(String[] string)
	{
		for(int i=0;i<string.length;i++)
		{
			System.out.println(string[i]);
		}
	}
}
