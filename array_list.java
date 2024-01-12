import java.util.*;
public class array_list{
    public static void main(String[] args) {
    ArrayList<String> al =new ArrayList<String>(20);
    al.ensureCapacity(20);
    System.out.println("intial size of array:"+al.size());
    System.out.println("Array:"+al);

    al.add("Arre");
    al.add("Aewr");
    al.add("Ae");
    al.add("Aew");
    al.add("Ad");
    al.add("c");
    al.add("b");
    System.out.println("Array:"+al);
    System.out.println("size:"+al.size());
    al.remove(3);
    al.remove(5);
    al.remove(0);
    System.out.println("Array:"+al);
    System.out.println("size:"+al.size());
    al.trimToSize();

    String newarr[]=new String [al.size()];
    newarr=al.toArray(newarr);
    for(String i:newarr)
    System.out.print(i);

}}
