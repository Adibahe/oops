import Beta.betanine;

class aplha{
    void alpha(){
        System.out.println("Alpha");
    }
    interface Alphanie{
        default void display(){
            System.out.println("Alphanie");
        }
        default void display1(){
            System.out.println("Alphanie");
        }
    }

}
interface Beta{
    default void beta(){
        System.out.println("Beta");
    }
    interface betanine{
        default void display(){
            System.out.println("Betanine");
        }
    }
}
class New extends aplha implements aplha.Alphanie,Beta,Beta.betanine{
    void Dipaly(){
        aplha.Alphanie.super.display();
        Beta.betanine.super.display();
    }
}
class Main{
public static void main(String[] args) {
    New n=new New();
    n.alpha();
    n.beta();
    n.display1();
    n.Dipaly();
}
}