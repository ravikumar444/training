package com.example.demo;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Java8Demo4 {
	public static void main(String[] args){
	  List<String> lst = new ArrayList<>();
    lst.add("1");
    lst.add("3");
    lst.add("3");
    lst.add("5");
    lst.add("4");
    List<Integer> intList=new ArrayList();
    for(int i=0;i<lst.size();i++){
    	intList.add(Integer.parseInt(lst.get(i)));
    }
    Predicate<Integer> p=(emp)->emp<=4;
    List<Integer> it=intList.stream().filter(p).collect(Collectors.toList());
    		for(Integer emp:it){
    			System.out.println(emp);
    
    	
		}
	}
}
	

