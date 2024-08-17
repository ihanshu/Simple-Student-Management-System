package Coursework;
/**This is a student information system
 * @author Ustunomiya Hikoo
 * @author www.bjtu.edu.cn
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CourseSystem {

	public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //内置初始信息
        //(1)教师
        Teacher YuanJidong=new Teacher("Yuan Jidong",34,"M",1000);
        YuanJidong.AddCourse("Java");
        Teacher WangZhihai=new Teacher("Wang Zhihai",60,"M",1001);
        WangZhihai.AddCourse("Computer Introduction");
        Teacher LiSize=new Teacher("Li Size",62,"M",1002);
        LiSize.AddCourse("Calculus");
        Teacher HuJun=new Teacher("Hu Jun",59,"M",1003);
        HuJun.AddCourse("Discrete Mathematics");
        
        //(2)学生
        Student HanYichen=new Student("Han Yichen",19,"M",2272201);
        HanYichen.AddCourse("Discrete Mathematics",85);
        HanYichen.AddCourse("Java",100);
        HanYichen.AddCourse("Computer Introduction", 85);
        HanYichen.AddCourse("Calculus", 95);
        
        Student LinZhongyan=new Student("Lin Zhongyan",18,"M",2272202);
        LinZhongyan.AddCourse("Discrete Mathematics", 95);
        LinZhongyan.AddCourse("Java",95);
        LinZhongyan.AddCourse("Computer Introduction",90);
        LinZhongyan.AddCourse("Calculus", 100);
        
        Student LiuJiatong=new Student("Liu Jiatong",18,"F",2272203);
        LiuJiatong.AddCourse("Discrete Mathematics", 55);
        LiuJiatong.AddCourse("Computer Introduction",85);
        LiuJiatong.AddCourse("Calculus",37);
        
        Student FuTianqi=new Student("Fu Tianqi",18,"F",2272204);
        FuTianqi.AddCourse("Java",70);
        FuTianqi.AddCourse("Discrete Mathematics",85);
        FuTianqi.AddCourse("Calculus",73);
        
        
        //(3)课程
        Course Java=new Course();
        Java.SetTeacher("Yuan Jidong");
        Java.AddStudent("Han Yichen", 100);
        Java.AddStudent("Lin Zhongyan",95);
        Java.AddStudent("Fu Tianqi",70);
        
        Course ComputerIntroduction=new Course();
        ComputerIntroduction.SetTeacher("Wang Zhihai");
        ComputerIntroduction.AddStudent("Han Yichen", 85);
        ComputerIntroduction.AddStudent("Lin Zhongyan",90);
        ComputerIntroduction.AddStudent("Liu Jiatong",85);
        
        Course Calculus=new Course();
        Calculus.SetTeacher("Li Size");
        Calculus.AddStudent("Han Yichen",95);
        Calculus.AddStudent("Lin Zhongyan",100);
        Calculus.AddStudent("Liu Jiatong",37);
        Calculus.AddStudent("Fu Tianqi",73);
        
        Course DiscreteMathematics=new Course();
        DiscreteMathematics.SetTeacher("Hu Jun");
        DiscreteMathematics.AddStudent("Han Yichen", 85);
        DiscreteMathematics.AddStudent("Lin Zhongyan",95);
        DiscreteMathematics.AddStudent("Liu Jiatong",55);
        DiscreteMathematics.AddStudent("Fu Tianqi",73);
       
        ArrayList<Teacher> teacher=new ArrayList<>();
        teacher.add(YuanJidong);
        teacher.add(WangZhihai);
        teacher.add(LiSize);
        teacher.add(HuJun);
        
        ArrayList<Course> course=new ArrayList<>();
        course.add(Java);
        course.add(ComputerIntroduction);
        course.add(Calculus);
        course.add(DiscreteMathematics);
        
        ArrayList<Student> student=new ArrayList<>();
        student.add(HanYichen);
        student.add(LinZhongyan);
        student.add(LiuJiatong);
        student.add(FuTianqi);
        
      //建立哈希映射
      		HashMap<String,Teacher> teachers=new HashMap<>();
      		teachers.put("Yuan Jidong",YuanJidong);
              teachers.put("Wang Zhihai",WangZhihai);
              teachers.put("Li Size",LiSize);
              
              HashMap<String,Student> students=new HashMap<>();
              students.put("Han Yichen",HanYichen);
              students.put("Lin Zhongyan",LinZhongyan);
              students.put("Liu Jiatong",LiuJiatong);
              students.put("Fu Tianqi", FuTianqi);
              
              HashMap<String,Course> courses=new HashMap<>();
              courses.put("Java", Java);
              courses.put("Computer Introducion", ComputerIntroduction);
              courses.put("Calculus", Calculus);
              
        
		//登录并检查账号密码
		User user=new User();
		System.out.println("**********Log in*************");
		System.out.println("Enter your username and password\n"+
		"(Original username and password are both 123)");
		System.out.print("Username:");
		String Username=input.nextLine();
		System.out.print("Password:");
		String Password=input.nextLine();
		user.Check(Username,Password);
		
		while(true) {             //在主菜单重复循环  
		
		//询问功能选择
	    System.out.println("**********Main Menu*************");
		System.out.println("1.Query Data\n2.Renew Data\n3.User settings");
		System.out.println("********************************");
		System.out.print("Choose the function:");
		int option=input.nextInt();
		
		
       
		/*查询功能模块
		 * 1.查询指定课程的学生数目
		 * 2.查询指定课程的任课教师
		 * 3.查询指定课程的学生名单
		 * 4.查询指定课程的学生排名表
		 * 5.查询指定课程的平均分
		 * 6.查询指定课程的成绩等级
		 * 7.查询指定学生的基本信息（包括姓名、年龄、ID、性别、学习课程、分数等）
		 * 8.查询指定教师的基本信息（包括姓名、年龄、ID、性别、教授课程等）*/
		if(option==1) {
			System.out.println("**********Query Data************");
			System.out.println("1. Number of students for Particular Course\n"
					         + "2. Name of teacher for Particular Course\n"
					         + "3. List of student lists for Particular Course\n"
					         + "4. List of student grades for Particular Course\n"
					         + "5. Average Grade for Particular Course\n"
					         + "6. Grade Level for Particular Course\n"
					         + "7. Get Particular Student Basic Information\n"
					         + "8. Get Particular Teacher Basic Information");
			System.out.println("********************************");
			System.out.print("Enter the item you want to query:");
			int option1=input.nextInt();
			System.out.print("Enter the course you want to query:");
			Scanner input1=new Scanner(System.in);
			String Temp=input1.nextLine();
			Course Course=courses.get(Temp);
			if(course==null) {
				System.out.println("No Finding! Return to main menu.");
				System.out.println("********************************");
				continue;
			}
			
			if(option1==1) Course.GetStudentNumber();
			
			else if(option1==2) Course.GetTeacher();
			
			else if(option1==3) Course.GetStudentList();
			
			else if(option1==4) Course.GetStudentRank(); 
			
			else if(option1==5) Course.GetAverage();
			
			else if(option1==6) Course.GetLevel();
			
			else if(option1==7) {
				System.out.print("Enter the student's name:");
				String NameTemp=input1.nextLine();
				Student Student=students.get(NameTemp);
				Student.GetBasicInformation();
				Student.GetCourseInformation();
			}
			
			else if(option1==8) {
				System.out.print("Enter the teacher's name:");
				String NameTemp=input1.nextLine();
				Teacher Teacher=teachers.get(NameTemp);
				Teacher.GetBasicInformation();
			}
			
			else {
				System.out.println("Please enter correct option! Return to Main Menu.");
				continue;
			}
		
		}
		
		/*修改功能模块
		 * 1.更新指定课程的学生分数
		 * 2.新建教师信息
		 * 3.新建学生学习
		 * 4.为指定学生加课
		 * 5.为指定教师加课
		 * 6.为指定学生退课*/
		else if(option==2) {
			System.out.println("**********Renew Data************");
			System.out.println("1.Renew Student's Mark for Particular Course\n"
					         + "2.Add New Teacher into System\n"
					         + "3.Add New Student into System\n"
					         + "4.Add Course for Student\n"
					         + "5.Add Course for Teacher\n"
					         + "6.Delete Student from Particular Course");
			System.out.println("********************************");
			System.out.print("Enter the item you want to query:");
			Scanner input2=new Scanner(System.in);
			int option2=input.nextInt();
			if(option2==1) {
				System.out.println("Enter the student's name:");
				String NameTemp=input2.nextLine();
				System.out.println("Enter the subject:");
				String CourseTemp=input2.nextLine();
				System.out.println("Enter the new mark:");
				double newMark=input2.nextDouble();
				
                Student Student=students.get(NameTemp);
                Course Course=courses.get(CourseTemp);
                Student.RenewMark(CourseTemp,newMark);
                Course.RenewMark(NameTemp, newMark);
			}
			
			else if(option2==2) {
				 Teacher.NewTeacher();
			}
			
			else if(option2==3) {
				 Student.NewStudent();
			}
			
			else if(option2==4) {
				System.out.println("Enter the student's name:");
				String NameTemp=input2.nextLine();
				System.out.println("Enter the subject:");
				String CourseTemp=input2.nextLine();
				System.out.println("Enter the mark:");
				double newMark=input2.nextDouble();
				
                Student Student=students.get(NameTemp);
                Course Course=courses.get(CourseTemp);
                Student.AddCourse(CourseTemp, newMark);
                Course.AddStudent(NameTemp, newMark);
			}
			
			else if(option2==5) {
				System.out.println("Enter the teacher's name:");
				String NameTemp=input2.nextLine();
				System.out.println("Enter the subject:");
				String CourseTemp=input2.nextLine();
				
				Teacher Teacher=teachers.get(NameTemp);
			    Teacher.AddCourse(CourseTemp);
				
			}
			
			else if(option2==6) {
				System.out.println("Enter the student's name:");
				String NameTemp=input2.nextLine();
				System.out.println("Enter the subject:");
				String CourseTemp=input2.nextLine();
				
				Student Student=students.get(NameTemp);
                Course Course=courses.get(CourseTemp);
                
                Student.DeleteCourse(CourseTemp);
				Course.DeleteStudent(NameTemp);
			}
			
			else {
				System.out.println("Please enter correct option! Return to Main Menu.");
				continue;
			}
			
		}
	
		
		
		/*账户设置模块
		 * 1.登出账号
		 * 2.修改用户名
		 * 3.修改密码
		 * 4.退回主菜单
		 */
		else if(option==3) {
			System.out.println("*********User settings**********");
			System.out.println("1.Log out\n"
					         + "2.Change Username\n"
					         + "3.Change Password\n"
					         + "4.Return Main Menu");
			System.out.println("********************************");
			System.out.print("Enter your option:");
			int option3=input.nextInt();
			
			if(option3==1) {
				user.exitSystem(user);
			}
			else if(option3==2) {
				System.out.print("Enter new username:");
				String newUsername=input.next();
				user.changeUsername(newUsername);
			}
			
			else if(option3==3) {
				System.out.print("Enter new password:");
				String newPassword=input.next();
				user.changePassword(newPassword);
			}
			
			else if(option3==4) {
				continue;
			}
			
			else {
				System.out.println("Wrong, back to main menu.");
				continue;
			}

		} 
		
	    }
	}	

}
