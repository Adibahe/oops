class aplha implements Beta,Beta.betanine{
    void alpha(){
        System.out.println("Alpha");
    }
    interface Alphanie{
        static void display(){
            System.out.println("Alphanie");
        }
        default void display1(){
            System.out.println("Alphanie");
        }
    }
    void dispaly(){
        Beta.super.beta();
    }

}
interface Beta{
    default void beta(){
        System.out.println("Beta");
    }
    interface betanine{
        static void display(){
            System.out.println("Betanine");
        }
    }
}
class Main{
public static void main(String[] args) {
    aplha a=new aplha();
    a.alpha();
    a.dispaly();
}
}