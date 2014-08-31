   class Student
   { 
       String name;
      int age ; 
     private static String city = "四川";
       public Student(String name,int age) 
       { 
           this.name = name ; 
           this.age = age ; 
       } 
       public String information() 
       { 
           return   "我是："+this.name+"，今年："+this.age+"岁，来自："+city; 
       } 
       public static void setCity(String c) 
       { 
           city = c ; 
       } 
   } 
   public class Newstu1
   { 
       public static void main(String[] args)
       { 
           Student stu1 = new Student("张三",25) ; 
           Student stu2 = new Student("李四",30) ; 
           Student stu3 = new Student("王五",35) ; 
           System.out.println("修改之前信息："+stu1.information()) ; 
           System.out.println("修改之前信息："+stu2.information()) ; 
           System.out.println("修改之前信息："+stu3.information()) ; 
           System.out.println("    **************修改之后信息**************"); 
           //  修改后的信息 
           Student.setCity("北京") ; 
           System.out.println("修改之后信息："+stu1.information()) ; 
           System.out.println("修改之后信息："+stu2.information()) ; 
           System.out.println("修改之后信息："+stu3.information()) ; 
       } 
}
