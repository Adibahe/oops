import java.io.*;
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        int i=0;
        Scanner scan=new Scanner(System.in);
        try{
        FileReader fin = new FileReader("test.txt");
        BufferedReader bfin =new BufferedReader(fin);
        char data[]=new char [1000];
        bfin.read(data);
        String s=new String(data);
        System.out.println(s);
        FileWriter fou=new FileWriter("test.txt");
        BufferedWriter bfou=new BufferedWriter(fou);
        byte f[]=new byte[1000];
        f=(scan.next()).getBytes();
        for(byte a:f){
            data[i]=(char)a;
            i++;
        }
        bfou.write(data);
        bfou.close();
        fin.close();
        scan.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}