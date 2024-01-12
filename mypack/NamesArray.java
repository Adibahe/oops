import java.util.*;
class Student{
    int roll;
    String Name;
    double Marks;

    Student(String n,double m,int r){
        roll=r;
        Marks=m;
        Name=n;
    }

    ArrayList<Student> s1=new ArrayList<Student>();
     void Set(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no.of students");
        for(int i=0;i<scan.nextInt();i++){
        s1.add(new Student(scan.next(),scan.nextDouble(),scan.nextInt()));
        }
        scan.close();
     }

     void Sort(){
        Collections.sort(s1,new Sorting());
     }
    void Display(){
        System.out.println(s1);
     }
}
class Sorting implements Comparator<Student>{
public int compare(Student o1,Student o2){
    if(o1.roll<o2.roll)
    return 1;
    else if(o1.roll>o2.roll)
    return -1;
    else
    return 0;
}
}
class NamesArray{
    public static void main(String[] args) {
        Student s=new Student("rf", 0, 0);
        s.Set();
        s.Sort();
        s.Display();
    }
}