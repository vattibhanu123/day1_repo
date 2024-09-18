
class  Student{
    private int studentId;
    private String name;
    private int age;
    private double grade;
    Student(int studentId,String name,int age,double grade ){
        
        this.studentId=studentId;
        this.name=name;
        this.age=age;
        this.grade=grade; 
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public double getGrade(){
        return grade;
    }

    public void display(){
        System.out.println("Student Id :"+ getStudentId());
        System.out.println("Student name :"+ getName());
        System.out.println("Student age :"+ getAge());
        System.out.println("Student grade :"+ getGrade());
    }
}


public class Management {
    public static void main(String[] args) {
        Student student1 = new Student(1,"John",20,90.5);
        student1.display();
        System.out.println();
        Student student2 = new Student(2,"Joe",23,95.6);
        student2.display();
    
    }
}
