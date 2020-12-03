package com.loop;

import java.util.ArrayList;

public class looptwo {
	public static void main(String[] args) {
		ArrayList<Integer> asc = new ArrayList<Integer>();
		for(int i = 1; i<10; i++) {
			asc.add(i);
		}
		//System.out.println(asc);

		ArrayList<Integer> desc = new ArrayList<Integer>();

		for(int j =100; j>91; j--) {
			desc.add(j);
		}
		//System.out.println(desc);
		ArrayList<Integer> empty = new ArrayList<Integer>();
		
		for (int i= 0; i<desc.size(); i++) {
			empty.add(asc.get(i));
			//System.out.println(empty);

			empty.add(desc.get(i));
			//System.out.println(empty);

			
			
		}
		System.out.println(empty);
		

		
	}

}
