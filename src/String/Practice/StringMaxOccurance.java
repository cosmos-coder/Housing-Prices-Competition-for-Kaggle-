package String.Practice;
import java.util.*;

public class StringMaxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="java";
		char ch[]=st.toCharArray();
		
		Hashtable<Character,Integer> ht=new Hashtable<>();
		for(int i=0;i<ch.length;i++)
		{
			
			if (!ht.containsKey(ch[i]))
			{  int freq=0;
				ht.put(ch[i],++freq);
			}
			else 
			{
				int count=ht.get(ch[i]);
				ht.put(ch[i], count+1);
			}
			
		}
		int mx=0;
		char chr=' ';
	for(Map.Entry<Character,Integer> el: ht.entrySet())
	{   char key=el.getKey();
	   
	    int val=el.getValue();
	    if (val>=mx)
	    {	mx=val;
	        chr=key;}

		}
	System.out.println("Character with maximum occurance is :"+chr+"\nnumber of times= "+mx);
		
	}
}
