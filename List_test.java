package collection_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class List_test {

	public static void main(String[] args) {
		ArrayList <String> friends = new ArrayList<>();
		//ArrayList to store 
		friends.add("Meerah");
		friends.add("Hamad");
		friends.add("Maryam");
		friends.add("Manayer");
		friends.add("Rashed");
		
		System.out.println(friends); 
		friends.add(3, "Ahmed"); 
		System.out.println(friends);
		
		ArrayList<String>friends2 = new ArrayList<>();
		friends2 = (ArrayList<String>) friends.clone();
		System.out.println("The Second List " + friends2);
		
		friends2.remove(3);
		
		System.out.println("The Second List" + friends2);
		
		System.out.println("The Size of Second List" + friends2.size()); 
		System.out.println("The First part is" + friends.subList(0, 3)); 
		System.out.println("The Second part is" + friends.subList(3, 6)); 
		System.out.println("The Second List" + friends2);
		
		for ( int i =0; i<friends.size();i++) {
			System.out.println("Hi "+ friends.get(i));
		}
	for(String s: friends) {
		System.out.println("Hi" + s);
		System.out.println("How are you" + s);
	}
	friends.forEach(s->System.out.println("hi" +s));
	friends.forEach(s->{
					System.out.println("Hi" + s);
					System.out.println("How are you" + s);});
	
	friends.forEach(s->{
					 if(s.length()<5)
						 System.out.println("  "+s);
				    });
	
	List ls = friends.stream().filter(s->s.length()<5).collect(Collectors.toList());
	               System.out.println();
	               
	         

	               
	               
}}
