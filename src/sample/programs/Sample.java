package sample.programs;
class Student{
    String name;
    int rollNo;
    Student(int num){
    rollNo = num;
    }   
    public void print(){
    System.out.print(name +" " + rollNo+"");
    }
}

public class Sample {
    public static void main(String[] args) {
    Student s = new Student(12);
    s.print();
    }
}
