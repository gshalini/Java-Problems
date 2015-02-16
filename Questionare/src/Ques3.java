import java.util.List;


public class Ques3 {

	public List hashMap(List<String> list1, List<String> list2)
	{
		
		int iteration = (int)Math.ceil(((float)(list1.size()-1))/((float)(list2.size()-1)));
		
		System.out.println(iteration);
				
		int j=(list1.size() - 1);
		
		try
		{
			for(int i=1;i<=iteration;i++)
			{
				if(i==1)
				{
					for(int k=0;k<=(list2.size()-1);k++)
					{
						list1.set(j,list2.get(k));
						j--;
					}
				}
				else if(i%2 == 1)
				{
					for(int k=1;k<=(list2.size()-1);k++)
					{
						list1.set(j,list2.get(k));
						j--;
					}
				}
				else if(i%2 == 0)
				{
					for(int k=(list2.size()-2);k>=0;k--)
					{
						list1.set(j,list2.get(k));
						j--;
					}
				}
				
			}
			
		}
		catch(Exception e)
		{
			
		}
		
		return list1;
	}
	
	public void printList(List<String> list,String[] array)
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println(array[i]+ "--->" +list.get(i));
		}
	}
}
