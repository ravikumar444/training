package com.example.demo;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;


public class Java8Demo1{
	public static void main(String [] args){
		List<Employee> emplst=new ArrayList<>();
		emplst.add(new Employee(1,"d", 100));
		emplst.add(new Employee(6,"f", 700));
		emplst.add(new Employee(4,"c", 300));
		emplst.add(new Employee(2,"b", 150));
		emplst.add(new Employee(7,"e", 200));
		emplst.add(new Employee(5,"g", 550));
		emplst.add(new Employee(3,"a", 1000));

		for (Employee emp:emplst){
			if(emp.getSal()>=300){
				System.out.println(emp.getEmpId()+"-----"+emp.getEmpNm()+"----"+emp.getSal());
			}
		}
		
	}
}