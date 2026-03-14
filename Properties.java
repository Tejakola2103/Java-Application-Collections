import java.util.*;
import java.io.*;
class Student {
	 private int studId;
	 private String studName;
	 private int studMarks;

	Student(int studId,String studName,int studMarks){
		this.studId=studId;
		this.studName=studName;
		this.studMarks=studMarks;
	}
	
	 
	int getId(){
	return studId;
	}
	
	 String getName(){
	 return studName;
	}

	int getStudMarks(){
     	return studMarks;
	}
}
class Test{

	public static void main(String args[])throws Exception {
	Scanner sc=new Scanner(System.in);
	File f=new File("two.properties");
	f.createNewFile();
	FileOutputStream fs=new FileOutputStream(f);
	Properties p=new Properties();
	Student obj=new Student(sc.nextInt(),sc.next(),sc.nextInt());
	 int id=obj.getId();
	 String name=obj.getName();
	 int marks=obj.getStudMarks();
	p.setProperty(id+"","studId");
	p.setProperty(name,"StudName");
	p.setProperty(marks+"","studMArks");
	p.store(fs,"Student-Details");

	Scanner m=new Scanner(f);
	 while(m.hasNextLine()){
	 System.out.println(m.nextLine());
	}
	}
}
	

	
	
	
