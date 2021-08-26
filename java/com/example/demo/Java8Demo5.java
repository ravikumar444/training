package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo5 {
	public static void main(String [] args){
	List<String> lst = new ArrayList<>();
    lst.add("1");
    lst.add("3");
    lst.add("3");
    lst.add("5");
    lst.add("4");



//    map function is used for converting one format to another



    List<String> sortedLst = lst.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());
    
    for (String str : sortedLst) {
        System.out.println(str);
    }
	}

}




    
