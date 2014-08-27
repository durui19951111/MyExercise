class Person
{
   String name;
   
    int score[] = new int[4] ;
   void xinxi() 
       { 
           System.out.println("姓名："+name+"，语文："+score[0]+"，数学:"+score[1]+"，英语:"+score[2]+"，专业"+score[3]); 
       } 
 }
 public class student 
   { 
       public static void main(String[] args)
       { 
           Person student1 = new Person() ; 
           Person student2 = new Person() ; 
           student1.name = "张三" ;
         int i;
           for(i=0;i<4;i++)
            
                student1.socre[i]=i+22;
            
           student2.name = "李四" ; 
           for(i=0;i<4;i++)
            
                student2.socre[i]=i+33;
            
               student1.xinxi() ;
           student2.xinxi() ; 
   }
}

