class Student
{
   String name;
   int age;
   String city;
   public Student(String name, int age, String city)
     {
        this.name=name;
        this.age=age;
        this.city=city;
      }
     public String information()
   {
     return ("���ǣ�"+this.name+"�����꣺"+this.age+"�꣬���ԣ�"+this.city);
     }
}
public class Newstu{
public static void main(String[] args)
         {
           Student  stu1 =new Student("����",19,"�Ĵ�");
           System.out.println(stu1.information()) ;
     }
}

