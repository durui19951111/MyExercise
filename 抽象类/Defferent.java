   abstract class Person 
   { 
       String name ; 
       int age ; 
       String occupation ;  
       public abstract String talk() ; 
   } 
   class Student extends Person 
   { 
       public Student(String name,int age,String occupation) 
       { 
           this.name = name ; 
           this.age = age ; 
           this.occupation = occupation ; 
       } 
         public String talk() 
       { 
           return "学生——>姓名："+this.name+"，年龄："+this.age+"，职业： 
                  "+this.occupation+"！" ; 
       } 
   }  
   class Worker extends Person 
  { 
       public Worker(String name,int age,String occupation)  
    {
     this.name = name ; 
     this.age = age ; 
     this.occupation = occupation ;
     } 
   public String talk() 
    { 
return "工人——>姓名："+this.name+"，年龄："+this.age+"，职业： 
"+this.occupation+"！" ; 
    }  
}
class Defferent 
{ 
public static void main(String[] args)
{ 
Student s = new Student("杜瑞",20,"学生") ; 
Worker w = new Worker("张三",30,"工人") ; 
System.out.println(s.talk()) ; 
System.out.println(w.talk()) ; 
} 
}