   class Student
   { 
       String name;
      int age ; 
     private static String city = "�Ĵ�";
       public Student(String name,int age) 
       { 
           this.name = name ; 
           this.age = age ; 
       } 
       public String information() 
       { 
           return   "���ǣ�"+this.name+"�����꣺"+this.age+"�꣬���ԣ�"+city; 
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
           Student stu1 = new Student("����",25) ; 
           Student stu2 = new Student("����",30) ; 
           Student stu3 = new Student("����",35) ; 
           System.out.println("�޸�֮ǰ��Ϣ��"+stu1.information()) ; 
           System.out.println("�޸�֮ǰ��Ϣ��"+stu2.information()) ; 
           System.out.println("�޸�֮ǰ��Ϣ��"+stu3.information()) ; 
           System.out.println("    **************�޸�֮����Ϣ**************"); 
           //  �޸ĺ����Ϣ 
           Student.setCity("����") ; 
           System.out.println("�޸�֮����Ϣ��"+stu1.information()) ; 
           System.out.println("�޸�֮����Ϣ��"+stu2.information()) ; 
           System.out.println("�޸�֮����Ϣ��"+stu3.information()) ; 
       } 
}
