package com.example.demo;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Java8Demo2 {
	public static void main(String[] args){
	  List<String> lst = new ArrayList<>();
    lst.add("1");
    lst.add("2");
    lst.add("3");
    lst.add("4");
    lst.add("5");
   List<Integer> newList=lst.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());
		  System.out.println(newList);
    }
    }
  
    
    


