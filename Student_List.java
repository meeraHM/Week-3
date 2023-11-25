package collection_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	ArrayList <Student> st=new ArrayList();
		
		st.add(new Student());
		st.add(new Student());
		st.add(new Student());
		
		st.get(0).setName("Halima");
		st.get(0).setAge(28);
		st.get(0).setID(44);
		
		st.get(1).setName("Meera");
		st.get(1).setAge(26);
		st.get(1).setID(66);
		
		st.get(2).setName("Rafiaa");
		st.get(2).setAge(22);
		st.get(2).setID(77);
		
		System.out.println(st);
		
		List <Student> ls = st.stream().filter(s->s.getAge()<26).collect(Collectors.toList());
		st.forEach(s->{
			if(s.getAge()<25)
				System.out.println(s);});
		st.sort((Student s1, Student s2)->s2.getAge()-s1.getAge());
		System.out.println(st);
		st.sort((Student s1, Student s2)->s1.getName().compareTo(s2.getName()));
		System.out.println(st);
		
		
		System.out.println(st);

	}

	}


