import java.util.*;
import java.io.*;
class Product implements Comparable<Product>{
    String PName,MName;
    double Quantity,discount;
    Product(String Pn,String Mn,double q,double d){
        PName=Pn;
        MName=Mn;
        Quantity=q;
        discount=d;
    }

    public int compareTo(Product p){
        return -Double.compare(this.Quantity,p.Quantity);
    } 

    static void Display(ArrayList<Product> alist){
        Iterator<Product> itr=alist.iterator();
        Product i;
        while(itr.hasNext()){
            i=itr.next();
            if(true){
            System.out.println((i).PName);
            System.out.println((i).MName);
            System.out.println((i).Quantity);
            System.out.println((i).discount);
            System.out.println("Final cost:"+(i.Quantity-(i.Quantity*(i.discount/100))));
            }
        }
    }
}
class lab_7{
    public static void main(String[] args)  {
        ArrayList<Product> alist=new ArrayList<Product>();
        try {
            FileReader f=new FileReader("Product.txt");
            BufferedReader bf=new BufferedReader(f);
            String line;
            String data[];
            while((line=bf.readLine())!=null){
                data=line.split(",");
                if(data.length==4){
                    String name=data[0];
                    String mname=data[2];
                    double quantity=Double.parseDouble(data[1]);
                    double Dis=Double.parseDouble(data[3]);
                    alist.add(new Product(name,mname,quantity,Dis));
                }

            }
            bf.close();
        } catch (Exception e) {}
        Collections.sort(alist,Comparator.reverseOrder());
        Product.Display(alist);
    }
}