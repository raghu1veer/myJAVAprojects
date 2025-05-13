import java.util.Scanner;

class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Introduce(){
        System.out.println("hello my name is" + getName() );

    }

}
class Student extends Person {
    private int mathmarks;
    private int chemmarks;
    private int phymarks;
    private int grade;
    private int average;
    private int percentage;
    private int total;

    public void setMarks(int mathmarks,int chemmarks,int phymarks){
        this.mathmarks = mathmarks;
        this.chemmarks=chemmarks;
        this.phymarks = phymarks;

    }
    public int  getMathmarks(){
        return mathmarks;

    }
    public int  getChemmarks(){
        return chemmarks;

    }
    public int  getPhymarks(){
        return phymarks;

    }

    public void displayMarks(){
        System.out.println("Physics marks is " +getPhymarks());
        System.out.println("Chemistry marks is " +getChemmarks());
        System.out.println("Maths marks is " +getMathmarks());
    }
    public Student(int age, String name , int grade) {
        super(age, name);
        this.grade =grade;
    }

    public int getGrade() {
        return grade;
    }



    public void Introduce(){
        System.out.println("hello my name is " + getName() + " studying in grade"+ getGrade());

    }

    public void calcTotal(){
        total = phymarks + chemmarks + mathmarks;
    }


    public void calcPercentage() {
        double per = (total / 300.0) * 100;
        System.out.println("Percentage of the student is " + per + "%");

    }


}

class Teacher extends Person{
    private double attendance;
    double dayspresent ;
    public Teacher(int age, String name ) {
        super(age, name);


    }
    public void Introduce(){
        System.out.println("hello i am teacher of " + getName() );

    }

    public void setDaysPresent(int days){
        this.dayspresent = days;
    }
    public void calculateAttendance(){
        attendance = dayspresent/1.2;
    }
    public double getAttendance(){
        return attendance;
    }

    public void displayAttendance(){
        System.out.println("Attendance of " +getName() + " is " + getAttendance());
    }

}






public class Main{
    public static void main(String[] args) {
        System.out.println("welcome to the School management system");
        Student student = new Student(16 ,"Shivam",10);
        student.Introduce();
        Teacher teacher = new Teacher(25,"shivam");
        teacher.Introduce();

        System.out.println("enter the numbers of days student was present : ");
        Scanner sc = new Scanner(System.in);
        int dayspresent = sc.nextInt();
        teacher.setDaysPresent(dayspresent);
        teacher.calculateAttendance();
        teacher.displayAttendance();

        System.out.println("enter the marks of Student :");

        System.out.println("enter marks of PHYSICS :");
        Scanner sc1 = new Scanner(System.in);
        int phymarks = sc.nextInt();

        System.out.println("enter marks of CHEMISTRY :");
        Scanner sc2 = new Scanner(System.in);
        int chemmarks = sc.nextInt();

        System.out.println("enter marks of MATHS :");
        Scanner sc3 = new Scanner(System.in);
        int mathmarks = sc.nextInt();

        student.setMarks(mathmarks,chemmarks,phymarks);

        student.displayMarks();
        student.calcTotal();
        student.calcPercentage();



        System.out.println("thankyou");


    }
}