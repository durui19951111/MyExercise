   class Myself 
   { 
       String name ; 
       int age ; 
       public String talk() 
       { 
           return "���ǣ�"+this.name+"�����꣺"+this.age+"��"; 
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
           return super.talk()+"������"+this.school+"��ѧ" ; 
       } 
   } 
 
   class information
   { 
       public static void main(String[] args)
       { 
           Student s = new Student("����",19,"�Ĵ�"); 
           System.out.println(s.talk()) ; 
       } 
   } 

