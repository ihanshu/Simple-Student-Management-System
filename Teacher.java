package Coursework;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Teacher extends Person{
	
	private ArrayList<String> Course=new ArrayList<>();
	
	
	//初始化教师
	public Teacher(String name,int age,String sex,int ID) {
		super(name,age,sex,ID);
	}
	
	public Teacher() {
		this("default",0,"-",0);
	}
	
	//添加课程名目
	public void AddCourse(String course) {
	      Course.add(course);
	}
	
	
	//新建教师基本信息
	public static void NewTeacher() {
	    Scanner input=new Scanner(System.in);
        HashMap<String, Teacher> teacherMap = new HashMap<>();

        System.out.println("Enter the teacher's name,age,sex,ID");
        String NewName=input.nextLine();
        int NewAge=input.nextInt();
        input.nextLine();
        String NewSex=input.nextLine();
        int NewID=input.nextInt();
        input.nextLine();

        Teacher teacher=new Teacher(NewName,NewAge,NewSex,NewID);
        teacherMap.put(NewName, teacher);
}
	
	//返回教师授课信息
	public void GetCourseInformation() {
		System.out.println("The Teacher's Courses:");
		for(int i=0;i<Course.size();i++)
			System.out.println(Course.get(i));
	}

	

}
