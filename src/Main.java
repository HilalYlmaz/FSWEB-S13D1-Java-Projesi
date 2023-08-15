import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("soru iki aşağıda");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(25, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("soru üç aşağıda");
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println("soru dört aşağıda");
        System.out.println("dikdörtgenin alanı");
        Scanner scanner= new Scanner(System.in);

        try{
            System.out.println("uzunluğu giriniz : ");
            double x = scanner.nextDouble();
            System.out.println("yüksekliği giriniz : ");
            double y= scanner.nextDouble();
            double result = area(x,y);
            System.out.println("alan=" + result);
        }catch (Exception ex){
            System.out.println("invalid input");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock){
        if (clock <0 || clock >23) return false;
        if (!isBarking) return false;
        return clock<8 || clock >=20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        if ((firstAge>= 13 && firstAge<=19) ||
                (secondAge>= 13 && secondAge<=19) ||
                (thirdAge>= 13 && thirdAge<=19)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(isSummer){
            return  temp > 25 && temp <= 45;
        }
        return  temp > 25 && temp <= 35;
    }
    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x*y;
    }
    
}

