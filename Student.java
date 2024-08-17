package Coursework;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Student extends Person{
	private ArrayList<String> Course=new ArrayList<>();
	private ArrayList<Double> Mark=new ArrayList<>(); 
	
	
	//初始化学生
	public Student(String name,int age,String sex,int ID) {
		super(name,age,sex,ID);
	}
	
	
	//为学生添加课程
	public void AddCourse(String course,double mark) {
		Course.add(course);
		Mark.add(mark);
	}
	
	
	//修改指定课程分数
	public void RenewMark(String subject,double newMark) {
		int i=Course.indexOf(subject);
		Mark.set(i,newMark);
	}
	
	
	//新建学生基本信息
	public static void NewStudent() {
	    Scanner input=new Scanner(System.in);
        HashMap<String, Student> studentMap = new HashMap<>();

        System.out.println("Enter the student's name,age,sex,ID:");
        String NewName=input.nextLine();
        int NewAge=input.nextInt();
        input.nextLine();
        String NewSex=input.nextLine();
        int NewID=input.nextInt();
        input.nextLine();

        Student student=new Student(NewName,NewAge,NewSex,NewID);
        studentMap.put(NewName, student);
}
	
	
	//删除学生的课程
	public void DeleteCourse(String course) {
		int i=Course.indexOf(course);
		Mark.remove(i);
		Course.remove(i);
	}
	
	
	//返回学生课程及分数信息
	public void GetCourseInformation() {
		System.out.println("The Student's Courses and Marks:");
		for(int i=0;i<Course.size();i++)
			System.out.println(Course.get(i)+"      "+Mark.get(i));
	}

}
