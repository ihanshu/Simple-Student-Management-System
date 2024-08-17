package Coursework;

import java.util.ArrayList;

public class Course {
	private ArrayList<String> StudentName=new ArrayList<>(); 
	private ArrayList<Double> Mark=new ArrayList<>(); 
	private String Teacher;
	
	//初始化
	public Course() {
	      
	}
	
	//为课程添加学生
	public void AddStudent(String name,double mark) {
		StudentName.add(name);
		Mark.add(mark);
	}
	
	//为课程设置教师
	public void SetTeacher(String Teacher) {
		this.Teacher=Teacher;
	}
	
	//返回教师
	public void GetTeacher() {
		System.out.println("The teacher is "+this.Teacher);
	}
	
	//返回学生人数
	public void GetStudentNumber() {
		System.out.println("The student number is "+StudentName.size());
	}
	
	//返回学生学号表
	public void GetStudentList() {
		System.out.println("------------Student-------------");
		for(int i=0;i<this.StudentName.size();i++)
			System.out.println((i+1)+".      "+this.StudentName.get(i));
	}

	//返回成绩排名表
	public void GetStudentRank() {
		 
		 for (int i = 0; i < Mark.size() - 1; i++) {
	            double currentMin =Mark.get(i);
	            String currentName =StudentName.get(i);
	            int currentIndex = i;

	            for (int j = i + 1; j < Mark.size(); j++) {
	                if (currentMin < Mark.get(j)) {
	                    currentMin = Mark.get(j);
	                    currentName = StudentName.get(j);
	                    currentIndex = j;
	                }
	            }

	            if (currentIndex != i) {
	                Mark.set(currentIndex, Mark.get(i));
	                StudentName.set(currentIndex,StudentName.get(i));
	                Mark.set(i, currentMin);
	                StudentName.set(i, currentName);
	            }
	        }
		 System.out.println("--------Student Rank List---------");
		 for(int i=0;i<Mark.size();i++)
			 System.out.println((i+1)+"."+StudentName.get(i)+"         "+Mark.get(i));
		 
	    
	}
	
	//返回平均分
	public void GetAverage() {
		double sum = 0.0;
        for (Double mark: Mark) {
            sum+=mark;
        }
        double average = sum / Mark.size();
        System.out.printf("The average mark is %.2f\n",average);
	}
	
	//返回成绩档次
	public void GetLevel() {
		int a=0,b=0,c=0,d=0,f=0;
		for(int i=0;i<Mark.size();i++) {
			if(Mark.get(i)>=90) a++;
			else if(Mark.get(i)>=80) b++;
			else if(Mark.get(i)>=70) c++;
			else if(Mark.get(i)>=60) d++;
			else f++;
		}
		System.out.println("-----The student mark level-----");
		System.out.println("   A                   "+a);
		System.out.println("   B                   "+b);
		System.out.println("   C                   "+c);
		System.out.println("   D                   "+d);
		System.out.println("   F                   "+f);
	}
	
	//更新指定课程分数
	public void RenewMark(String name,double newMark) {
		int i=StudentName.indexOf(name);
		Mark.set(i, newMark);
	}
	
	//删除指定学生
	public void DeleteStudent(String name) {
		int i=StudentName.indexOf(name);
		StudentName.remove(i);
		Mark.remove(i);
	}
	

	
	
	
}
	

	
