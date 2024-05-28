class Student
{
    int roll_no;
    String name;
    int marks; 
}

public class Object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll_no=1;
        s1.name="Rajnish Maurya";
        s1.marks=34;

        Student s2=new Student();
        s2.roll_no=2;
        s2.name="Ramesh Maurya";
        s2.marks=43;

        Student s3=new Student();
        s3.roll_no=3;
        s3.name="Rajesh Maurya";
        s3.marks=45;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;


        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].roll_no +" "+ students[i].name + ": " + students[i].marks);
        }

        for(Student st: students)  // enhanced loop
        {
            System.out.println(st.name+" "+ st.marks);
        }
    }
}
