import java.util.*;
class CricketScore{
   String score;

   void updateScore(String score){
      this.score=score;
      System.out.println("Updated score  :"+score);
   }
   String getScore(){
      return score;
   }
}

class ServerThread extends Thread{
   CricketScore website;
   String [] score={"110/2","120/3","200/5","360/11"};
   int i;
   Random rand=new Random();
   ServerThread(CricketScore website){
      this.website=website;
   }
   public void run(){
      while(true){
      website.updateScore(score[i]);
      i++;
      try {
         sleep((rand.nextInt(3000)+1000));
      } catch (InterruptedException e) {
         System.out.println(e);
      }
      }
   }
}

class ClientThread extends Thread{
   CricketScore website;
   ClientThread(CricketScore website){
      this.website=website;
   }
   public void run(){
      while(true){
      System.out.println("Current thrad:"+website.getScore());
      try {
         sleep(2000);
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}

}
class Main{
   public static void main(String[] args) {
      CricketScore website=new CricketScore();
      ServerThread st=new ServerThread(website);
      st.start();
      ClientThread cl1=new ClientThread(website);
      cl1.start();
   }
}