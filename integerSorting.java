import java.util.Scanner;

public class omm {
    public static void main(String[] args) {
        // int sum = 0;
        Scanner sc = new Scanner(System.in);
        int temp;
        
        System.out.println("enter the toatl number");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the value to be add");
        for (int i = 0; i <= n-1; i++) {  //for input
            a[i]=sc.nextInt();
    
        }

        for(int i=0;i<n;i++){

            for(int j=0;j<n-i-1;j++){

                if(a[j]>a[j+1]){

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is\n");
            
        for (int i = 0; i <=n-1; i++) {  //for print array
            System.out.println(a[i]);   
    }
}
}




           
