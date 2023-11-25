package collection_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListExample {

	public static void main(String[] args) {
		// ArrayList created to store 10 numbers
		List <Integer>list1 = new ArrayList<>(); 
				for (int i = 1;i<=10;i++) {
					list1.add(i);
				}
				//Add other number at postions 6
				list1.add(5,11);
				//create copy of list of numbers
				List<Integer>list2 = new ArrayList<>(list1);
				//remove the 3rd element from the 2nd list
				list2.remove(2); 
				
				//print the size
				System.out.println(" the size of list1 :" + list1.size());
				System.out.println(" the size of list2 :" + list2.size());
				
			   //sort the first list
				list1.sort(Integer::CompareTo);
				
				//print the sequare
				list2.forEach(num-> System.out.println(num * num+ " "););
				
				//create the new list
				
				List<integer>evenList =list1.stream().filter(num -> number %2 ==0 )
				
						collect(Collectors.toList(); )
						
				//print the list
						System.out.println("List of even numbers:" + evenNumbers); 
				

	}

}
