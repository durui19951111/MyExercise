class Person
{
   String name;
   
    int score[] = new int[4] ;
   void xinxi() 
       { 
           System.out.println("������"+name+"�����ģ�"+score[0]+"����ѧ:"+score[1]+"��Ӣ��:"+score[2]+"��רҵ"+score[3]); 
       } 
 }
 public class student 
   { 
       public static void main(String[] args)
       { 
           Person student1 = new Person() ; 
           Person student2 = new Person() ; 
           student1.name = "����" ;
         int i;
           for(i=0;i<4;i++)
            
                student1.socre[i]=i+22;
            
           student2.name = "����" ; 
           for(i=0;i<4;i++)
            
                student2.socre[i]=i+33;
            
               student1.xinxi() ;
           student2.xinxi() ; 
   }
}

