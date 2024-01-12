import java.util.*;
class tset{
    void demo(){
        TreeSet<Character> TS=new TreeSet<Character>();
        TS.add('h');
        TS.add('b');
        TS.add('c');
        TS.add('a');
        TS.add('d');
        System.out.println(TS);

    }
}
class Main{
    public static void main(String[] args) {
        tset ts =new tset();
        ts.demo();
    }
}