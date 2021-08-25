package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

import java.util.Collections;
import com.example.demo.Employee;

public class Java8Demo1 {
	public static void main(String[] args){
		List<Employee> empList=new ArrayList();
		empList.add(new Employee(1,"d"));
		empList.add(new Employee(3,"a"));
		empList.add(new Employee(5,"v"));
		empList.add(new Employee(2,"f"));
		empList.add(new Employee(4,"b"));
		Comparator<Employee> compName=(a,b)->{
			return a.getEmpNm().compareTo(b.getEmpNm());
		};
		Collections.sort(empList,compName);
		System.out.println(empList);
	}
}