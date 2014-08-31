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
     return ("我是："+this.name+"，今年："+this.age+"岁，来自："+this.city);
     }
}
public class Newstu{
public static void main(String[] args)
         {
           Student  stu1 =new Student("杜瑞",19,"四川");
           System.out.println(stu1.information()) ;
     }
}

