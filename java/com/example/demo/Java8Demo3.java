package com.example.demo;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Java8Demo3{
	public static void main(String [] args){
		List<Employee> emplst=new ArrayList<>();
		emplst.add(new Employee(1,"d", 100));
		emplst.add(new Employee(6,"f", 700));
		emplst.add(new Employee(4,"c", 300));
		emplst.add(new Employee(2,"b", 150));
		emplst.add(new Employee(7,"e", 200));
		emplst.add(new Employee(5,"g", 550));
		emplst.add(new Employee(3,"a", 1000));
		Predicate<Employee> p=(emp) ->emp.getsal() >=300;
		List<Employee> filteredEmpList=emplst.stream().
				filter(p).
				collect(Collectors.toList());

		for (Employee emp:filteredEmpList){
			
				System.out.println(emp);
			}
		}
	}
