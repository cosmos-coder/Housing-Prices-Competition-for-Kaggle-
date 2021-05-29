package datastructures.learn;

import java.util.ArrayList;

public class ConvertNumbers {

	public static void main(String[] args)  {
		int num=22;
		ArrayList<Integer> ar=new ArrayList<>();
		int rem=0,binary=0;
		while(num>0) {
			rem=num%2;
			num/=2;
			ar.add(rem);
			
		}
		for(int i=ar.size()-1;i>=0;i--) {
			System.out.print(ar.get(i));
		}

	}

}
