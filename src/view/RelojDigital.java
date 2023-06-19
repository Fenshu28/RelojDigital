
package view;

public class RelojDigital {
    public static void main(String[] args) throws InterruptedException {
        int h=0,m=0,s=0;
        do{
            System.out.println(h+":"+m+":"+s);
            s++;
            if(s==60){
                s=0;
                m++;
            }else if(m==60){
                m=0;
                h++;
            }else if(h==24){
                h=0;
            }
            Thread.sleep(1000);
        }while(true);
    }
    
}
