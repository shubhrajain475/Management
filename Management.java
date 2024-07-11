
interface student{
	void name();
	void attendence();
}
interface teacher {
	void teach();
	void assignmentwork();
}
class subjects{
	void lecture1(){
		System.out.println("lecture 1.....");
	}
	void lecture2(){
		System.out.println("lecture 2.......");
	}
}
class Management extends subjects implements student,teacher{
	public void name(){
		System.out.println("studnets name....");
		
	}
	public void attendence(){
		System.out.println("student attendence.....");
	}
	public void teach(){
		System.out.println("Teacher is teaching");
	}
	public void assignmentwork(){
		System.out.println("Assignment work will be mentioned here.....");
	}
	public static void main(String ar[]){
		Management m1=new Management();
		
		m1.name();
		m1.attendence();
		m1.teach();
		m1.assignmentwork();
		m1.lecture1();
		m1.lecture2();
	}
}








