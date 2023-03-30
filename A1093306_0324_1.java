import java.util.*;
class Animal{
    String name;
    double height;
    int weight;
    int rate;
    void show(){
        System.out.printf("%s:%s , %s:%.2f , %s:%d , %s:%d%n","姓名",this.name,"身高(公尺)",this.height,"體重(公斤)",this.weight,"速度(公尺/分鐘)",this.rate);
    }
    double distance(int x,double y){
        double dis=x*y*this.rate;
        return dis;
    }
    int distance(int x){
        int dis=x*this.rate;
        return dis;
    }
}

public class A1093306_0324_1 {
    public static void main(String[] args){
        Animal[] animal=new Animal[4];
        for(int i=0;i<animal.length;i++){
            animal[i]=new Animal();
        }
        animal[0].name="雪寶";
        animal[0].height=1.1;
        animal[0].weight=52;
        animal[0].rate=100;

        animal[1].name="驢子";
        animal[1].height=1.5;
        animal[1].weight=99;
        animal[1].rate=200;

        animal[2].name="安那";
        animal[2].height=1.7;
        animal[2].weight=48;
        animal[2].rate=120;

        animal[3].name="愛紗";
        animal[3].height=1.7;
        animal[3].weight=50;
        animal[3].rate=120;
        for(int i=0;i<animal.length;i++){
            animal[i].show();
        }
        
        Scanner input=new Scanner(System.in);
        int[] time=new int[animal.length];
        double[] acceleration=new double[animal.length];
        for(int i=0;i<animal.length;i++){
            do{
                System.out.printf("請輸入%s奔跑時間(分鐘):",animal[i].name);
                time[i]=Math.round(input.nextFloat());
            }while(time[i]<=0);
            do{
                System.out.printf("請輸入%s奔跑加速度:",animal[i].name);
                acceleration[i]=input.nextDouble();
            }while(acceleration[i]<0);
            System.out.println("-".repeat(30));
        }
        for(int i=0;i<animal.length;i++){
            if(acceleration[i]==0){
                System.out.printf("%s的奔跑距離為:%d公尺%n",animal[i].name,animal[i].distance(time[i]));
            }else{
            System.out.printf("%s的奔跑距離為:%.2f公尺%n",animal[i].name,animal[i].distance(time[i],acceleration[i]));
            }
        }
    }
}
