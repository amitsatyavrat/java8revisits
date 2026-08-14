package com.java.javabhakt.streamconepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RevisitJava8StreamConcepts {

	public static void main(String[] args) {

		//get
		List<Employee> empList = getEmpList();
		 empList.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e.getEmpId() +"-"+ e.getGender()));
		 
		 //sort
		 empList.stream()
	        .sorted(Comparator.comparing(Employee::getRating))
	        .forEach(e -> System.out.println(e.getEmpId() +"-"+ e.getRating()));
		 
		 //sort reverse
		 empList.stream()
	        .sorted(Comparator.comparing(Employee::getRating).reversed())
	        .forEach(e -> System.out.println(e.getEmpId() +"-"+ e.getRating()));
		 
		 //sort by salary and rating
		 empList.stream()
	        .sorted(Comparator.comparing(Employee::getSalary))
	        .sorted(Comparator.comparing(Employee::getRating))
	        .forEach(e -> System.out.println(e.getEmpId() + "-" + e.getSalary() +"-"+ e.getRating()));
		
	}
	
	public static List<Employee> getEmpList(){
        return Arrays.asList(
                new Employee("E1100","Amit","Kumar","amitkumar@gmail.com","Male","True",101146,0),
                new Employee("E1101","Jobin","Joseph","jobin@ovh.net","Male","FALSE",29310,2),
                new Employee("E1102","James","Thumi","james@twitter.com","Female","FALSE",62291,4),
                new Employee("E1103","Samarth","Sharma","samarth@last.fm","Male","FALSE",142439,4),
                new Employee("E1104","Shanvi","Sharma","shanvi@google.ru","Female","FALSE",128764,5),
                new Employee("E1105","Tailor","Dongi","don@gmail.com","Female","FALSE",152924,4),
                new Employee("E1106","Huge","Braybrooke","huge@prnewswire.com","Male","TRUE",128907,0),
                new Employee("E1107","Ramaswami","Venkatraman","rama@ehow.com","Male","TRUE",2510,0)
        );
    }

}
