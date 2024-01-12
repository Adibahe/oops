class demo extends Thread{
    display D;
    String Name;
demo(String name,display d){
    Name=name;
    D=d;
}
public void run(){
    D.greet(Name);
}
}
class display extends Thread{
    synchronized void greet(String name){
        for(int i=0;i<10;i++){
            System.out.println(name);
        }
    }
}
class Main{
    public static void main(String[] args) {
        display d=new display();
        demo d1=new demo("Buntie",d);
        demo d2=new demo("Buntie",d);
        demo d3=new demo("Buntie",d);
        d1.start();
        d2.start();
        d3.start();

    }
}