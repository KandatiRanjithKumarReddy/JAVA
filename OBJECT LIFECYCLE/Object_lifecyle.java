public class Object_lifecyle {
    public static void main(String[] args) {
        student obj1= new student(1, "Ranjith");
        student obj2=new student(2, "Kandati Ranjith Kumar Reddy");
        student obj3 =obj2;

        obj2=null;
        obj1.DisplayStudentDetails();

        obj3.DisplayStudentDetails();
    }
    
}

class student{
    private int rollNo;
    private String name;

    public student(int rollNo,String name) {
        this.rollNo=rollNo;
        this.name=name;
    }

    public void DisplayStudentDetails(){
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }

    
}
