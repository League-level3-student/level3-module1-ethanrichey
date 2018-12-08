package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arrS = new ArrayList();
		//2. Add five Strings to your list
		arrS.add("Man");
		arrS.add("Gamer");
		arrS.add("Gaming");
		arrS.add("FortniteNinja");
		arrS.add("FortniteGamer");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < arrS.size(); i++) {
		String w = arrS.get(i);
		System.out.println(w);
		}
		
	
	
		
		//4. Print all the Strings using a for-each loop
	for( String s : arrS) {
		System.out.print(s);
	}	
		//5. Print only the even numbered elements in the list.
	for(int i = 0; i < arrS.size(); i++) {
		String w = arrS.get(i);
		if(i%2 == 0) {
			System.out.println(arrS.get(i));
		}
	}

		//6. Print all the Strings in reverse order.
	for(int i = arrS.size(); i >= 0; i--) {
		String w = arrS.get(i);
		System.out.println(w);
		}
		//7. Print only the Strings that have the letter 'e' in them.
	for(int i = 0; i < arrS.size(); i++) {
		String w = arrS.get(i);
		
		}
}
}
