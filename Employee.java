package com.example.demo;

import java.util.List;
import java.util.Collections;

public class Employee {




 

    private int empId;
    private String empNm;
    private int sal;

 

    public Employee() {

 

    }

 

    public Employee(int empId, String empNm, int sal) {
        super();
        this.empId = empId;
        this.empNm = empNm;
        this.sal = sal;
    }

 

    public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}



	public int getEmpId() {
        return empId;
    }

 

    public void setEmpId(int empId) {
        this.empId = empId;
    }

 

    public String getEmpNm() {
        return empNm;
    }

 

    public void setEmpNm(String empNm) {
        this.empNm = empNm;
    }

 

    public int getSal() {
        return sal;
    }

 

    public void setSal(int sal) {
        this.sal = sal;
    }

 

}














