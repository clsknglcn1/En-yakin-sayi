import java.util.Arrays;
import java.util.Scanner;
public class EnYakin {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int [] list ={12,34,3,9,-34,101,0};
        System.out.println("lütfen bir sayı giriniz:");
        int number = num.nextInt();
        System.out.println("dizi:"+Arrays.toString(list));
        Arrays.sort(list);
        int maxNumber=0;
        int minNumber=0;
        for (int i:list){
            if (number<i){
                maxNumber=i;
                break;
            }

        }
        int[] reverse = new int [list.length];
        for(int i=0,j=list.length-1;i<list.length;i++,j--) {
            reverse[i]=list[j];
        }
        for (int i:reverse){
            if (i<number){
                minNumber=i;
                break;

            }
        }
        System.out.println("girilen sayı:"+ number);
        System.out.println("girilen sayıdan küçük en yakın sayı:"+minNumber);
        System.out.println("girilen sayıdan büyük en yakın sayı:"+maxNumber);


    }
}
