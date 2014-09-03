   class Myself 
   { 
       String name ; 
       int age ; 
       public String talk() 
       { 
           return "我是："+this.name+"，今年："+this.age+"岁"; 
       } 
   } 
 
   class Student extends Myself 
   { 
       String school ; 
       public Student(String name,int age,String school) 
       { 
           this.name = name ; 
           this.age = age ; 
           this.school = school ; 
       }  
       public String talk() 
       { 
           return super.talk()+"，我在"+this.school+"上学" ; 
       } 
   } 
 
   class information
   { 
       public static void main(String[] args)
       { 
           Student s = new Student("杜瑞",19,"四川"); 
           System.out.println(s.talk()) ; 
       } 
   } 

