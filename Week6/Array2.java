import java.util.Scanner;

public class Array2{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=s.nextInt();
        int a[]=new int[n];
        int i,c1=0,c2=0,c3=0;
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]>0)
                c1+=1;
            else if(a[i]<0)
                c2+=1;
            else
                c3+=1;
        }
        System.out.printf("No. of Positve no.s = %d\nNo. of Negative no.s = %d\nNo. of Zeros = %d",c1,c2,c3);
    }
}
