class Employee<T,V>{
  T  id;
  V name;
  Employee(T id,V name){
    this.id=id;
    this.name=name;
  }
  void Display(){
    System.out.println("Id:"+id);
    System.out.println("Name:"+name);
  }
  public static void main(String[] args) {
    Employee<Integer,String> emp1=new Employee<Integer,String>(278348,"Gsds");
    emp1.Display();
  }
}