import java.util.Scanner;

public class GoodPair {
    public static int goodPair(int []array,int size,int value){
        int pair=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(array[i]+array[j]==value){
                    pair++;
                }
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=scanner.nextInt();
        System.out.println("Enter the value:");
        int value=scanner.nextInt();
        int [] array=new int[size];
        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println("The good pairs count: "+goodPair(array,size,value));
    }
}
