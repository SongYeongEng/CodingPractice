public class e{


 public static void main(String[] args){
    for (int i = 1; i <= 5; i++){
        System.out.println("Countdown:"+i);
        try{
            Thread.wait(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
        System.out.println("Liftoff!");

 }
}