package com.lambda;
import java.util.ArrayList;

public class lambdacollection {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<>();
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		
		l.forEach(n->System.out.println(n));

	}
}
