class MaxThread extends Thread{
    int start,end;
    int largest;
    int a[];
    MaxThread(int a[],int start,int end){
        this.a=a;
        this.start=start;
        this.end=end;
    }
    public void run(){
        for(int i=start;i<end;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
    }
}
class Max_Thread{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        MaxThread ob1=new MaxThread(arr, 0, 5);
        MaxThread ob2=new MaxThread(arr, 5, 10);
        ob1.start();
        ob2.start();
        try {
            ob1.join();
            ob2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        if(ob1.largest > ob2.largest)
        System.out.println(ob1.largest);
        else 
        System.out.println(ob2.largest);
    }
}
