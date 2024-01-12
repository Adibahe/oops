import java.util.*; 
class Operations{
  Scanner scan=new Scanner(System.in);
  void Fibonacci(){
    System.out.println("Enter the first two numbers");
    ArrayList<Integer> a=new ArrayList<Integer>();
    a.add(scan.nextInt());
    a.add(scan.nextInt());
    System.out.println("Generating Fibonacci series...");
    while(true){
      ListIterator<Integer> litr= a.listIterator();
      a.add(litr.next()+litr.previous());
      litr.next();
    }
  }
  
  int Dice(){
    Random rand =new Random();
    int a=10;
    while(a>6 || a==0){
    a =(int)(10*rand.nextDouble());
    }
    System.out.println(a);
    return a;
  }

  static void Encode(char[] arr){
    Random rand =new Random();
    for(int i=0;i<arr.length;i++){
      int xyz=(int)(100*rand.nextDouble());
      arr[i]=(char)xyz;
      }
       String s=new String(arr);
       System.out.println(s);
    }
  

  static void seprate(String s){
    char[] arr=new char[100];
    for(int i=0;i<(s.length());i++){
      arr[i]=s.charAt(i);
    }
    Encode(arr);
  }
}

class Decision{
  Scanner scan=new Scanner(System.in);
  Decision(String message){

    switch (message) {
      case "Fibonacci":
        Operations op=new Operations();
        op.Fibonacci();
        break;

      case "Dice":
      Operations op1=new Operations();
      {
        int nr=0;
        Boolean a=true;
        while(a){
          System.out.println("No.of Rolls:"+(++nr));
        switch(op1.Dice()){
          case 1:
          System.out.println(" -----");
          System.out.println("|     |");
          System.out.println("|  *  |");
          System.out.println(" -----");
          break;
          case 2:
          System.out.println(" -----");
          System.out.println("|  *  |");
          System.out.println("|  *  |");
          System.out.println(" -----");
          break;
          case 3:
          System.out.println(" -----");
          System.out.println("| * * |");
          System.out.println("|  *  |");
          System.out.println(" -----");
          break;
          case 4:
          System.out.println(" -----");
          System.out.println("| * * |");
          System.out.println("| * * |");
          System.out.println(" -----");
          break;
          case 5:
          System.out.println(" -----");
          System.out.println("| * * |");
          System.out.println("|  *  |");
          System.out.println("| * * |");
          System.out.println(" -----");
          break;

          case 6:
          System.out.println(" -----");
          System.out.println("| * * |");
          System.out.println("| * * |");
          System.out.println("| * * |");
          System.out.println(" -----");
          break;
        }
        if((scan.nextLine()).equals("END"))
        a=false;
        }

      }

      break;
      case "ENCODE":
      System.out.println("Enter the message to be encoded");
        Operations.seprate(scan.nextLine());
      break;
      
      default:
        System.out.println("Error!!,Enter the correct operation");
        break;
    }

  }
}
class Lab_4{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("command:");
    new Decision(scan.next());
    scan.close();
  }
}