package edu.fju.exam;

public class Director extends Employee {
	int b;
	public Director(String name,int m,int b){
		super(name,m);
		this.b=b;
		
		}
	@Override
	public void print(){
		System.out.println(name +"\t"+(m+5000)+"("+b+")"+"\t");
	}

}
