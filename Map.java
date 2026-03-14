import java.util.*;
class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private int empsalary;

	Employee(int empId,String empName,int empsalary){
	this.empId=empId;
	this.empName=empName;
	this.empsalary=empsalary;
	}

	  int getId(){
	  return empId;
	}

	String getempName(){
	 return empName;
	}

	int getSalary(){
	 return empsalary;
	}

	public int compareTo(Employee e1){
	 return e1.empsalary-this.empsalary;
	}

}

class Test{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	Map<Employee,Integer>map=new TreeMap<>();
	for(int i=1;i<=3;i++){
	Employee e1=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
	 map.put(e1,sc.nextInt());
	}
	
	
	for(Map.Entry<Employee,Integer>k:map.entrySet()){
	
	 System.out.println(k.getKey().getId()+" "+k.getKey().getempName()+" "+k.getKey().getSalary()+" "+k.getValue());
	
   }
}
}
	
	
