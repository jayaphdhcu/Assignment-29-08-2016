import java.io.*;
public class  TestClass {
	public static void main(String[] a) {
		
		Person obj1=new Person("JayaLakshmi","VVIT,Nambur");
		System.out.println(obj1.toString());

		Student obj2=new Student("Rohit","VVIT,NAMBUR","B.Tech",2,300000.00);
		System.out.println(obj2.toString());

		Staff obj3=new Staff("JayaLakshmi","VVIT, Nambur","VVIT",65000.00);
		System.out.println(obj3.toString());
	}
}
class Person {
	private String name;
	private String address;

	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}

	public String getName(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String toString(){
		return "\n\n ---------Object : Person -----------\n\nName:"+getName()+"\naddress:"+getAddress();
	}

}
class Student extends Person
{
	private String program;
	private int year;
	private double fee;

	public Student(String name,String address,String program,int year,double fee){
		super(name,address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}

	public String getProgram(){
		return this.program;
	}
	public void setProgram(String program) {
		this.program=program;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year){
		this.year=year;
	}
	public double getFee() {
		return this.fee;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public String toString() {
		return "\n\n-----------Object : Student ------------\n\nName="+getName()+"\nAddress="+getAddress()+"\nProgram="+getProgram()+"\nYear="+getYear()+"\nFee="+getFee();
	}
}
class Staff extends Person{
	private String school;
	private double pay;

	public Staff(String name,String address,String school,double pay) {
		super(name,address);
		this.school=school;
		this.pay=pay;
	}

	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public double getPay() {
		return this.pay;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public String toString() {
		return "\n\n-------------Object : Staff ------------\n\n"+"Name="+getName()+"\nAddress="+getAddress()+"\nSchool="+getSchool()+"\nPay="+getPay();
	}
}