package edu.fju.exam;

public class Manager extends Employee {
	
	public Manager(String name,int m){
		super(name,m);
		}
	@Override
	public void print(){
		System.out.println(name +"\t"+ (m+5000)+"\t");
	}
	
}
