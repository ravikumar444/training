package com.example.demo;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.Employee;

public class Java8Demo2 {
	public static void main(String[] args){
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"d",100));
		empList.add(new Employee(3,"a",200));
		empList.add(new Employee(5,"v",300));
		empList.add(new Employee(2,"f",400));
		empList.add(new Employee(4,"b",500));
        for(int i=0;i<empList.size();i++){
        	Employee emp = empList.get(i);
        	if(emp.getSal()>=300){
        		System.out.println(emp);
        	}
        }
	}

}
