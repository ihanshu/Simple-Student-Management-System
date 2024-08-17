package Coursework;

public class Person {
	private String name;
	private int age;
	private String sex;
	private int ID;
	
	//初始化
	public Person(String name,int age,String sex,int ID){
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.ID=ID;
	}
	
	//返回姓名
	public String GetName() {
		return this.name;
	}
	
	
	//返回年龄
	public int GetAge() {
		return this.age;
	}
	
	
	//返回性别
	public String GetSex() {
		return this.sex;
	}
	
	
	//返回ID
	public int GetID() {
		return this.ID ;
	}
	
	//返回基本信息
	public void GetBasicInformation() {
		System.out.println("Name: "+GetName());
		System.out.println("Age: "+GetAge());
		System.out.println("Sex: "+GetSex());
		System.out.println("ID: "+GetID());
		
	}
}
