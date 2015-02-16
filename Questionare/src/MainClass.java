import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] string1 = {"ABC","DEF","XYZ","PQR","GHI","CDE","KLM","OPQ"};
		String[] string2 = {"DEF","XYZ"};
		String[] string3 = new String[20];
		
		String[] str1 = {"a","b","c","d","e","f","g","h","i"};
		String[] str2 = {"aa","bb","gg"};
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(str1));
		List<String> list2 = new ArrayList<String>(Arrays.asList(str2));
		List<String> list3 = new ArrayList<String>();
		
		Ques1 object1 = new Ques1();
		string3 = object1.sortString(string1,string2);
		
		object1.printStringArray(string3);

		System.out.println("------------------");
		
		Ques2 object2 = new Ques2();
		object2.bankMap("RBI");
		
		System.out.println("-------------------");
		
		Ques3 object3 = new Ques3();
		list3 = object3.hashMap(list1, list2);
		
		object3.printList(list3,str1);
		
	}

}
