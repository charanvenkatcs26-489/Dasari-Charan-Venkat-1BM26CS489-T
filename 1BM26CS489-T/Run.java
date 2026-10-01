import java.util.*;

class Student{

   String usn;
   String name;
   
   void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Student usn no. :");
      this.usn = sc.nextLine();
      System.out.println("Enter Student name:");
      this.name = sc.nextLine();
   }

   void Display(){
      System.out.println("Student Details:-");
       System.out.println("Name: " + "  " + "usn: ");
      for(int i = 0; i < n; i++)
         {
            System.out.println(name + " " + usn);
        }
}

class Run{
   public static void main(String args[]){
      int n = 5;
      Student s[] = new Student[n];
      for(int i = 0; i < n; i++){
         s[i] = new Student();
         s[i].accept();
         s[i].Display();
      }
   }
}


OUTPUT:-
Enter usn:
1BM26CS489
Enter name:
Dasari Charan Venakt
Student Details are:-
Name:- Dasari Charan Venkat usn:- 1BM26CS489
