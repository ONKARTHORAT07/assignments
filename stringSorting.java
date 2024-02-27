import java.util.Scanner;




public class stringg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp;
        
        System.out.println("enter the toatl number");
        int n=sc.nextInt();
        String[] a=new String[n];
        System.out.println("enter the value to be add");

        // taking input from user
        for (int i = 0; i <= n-1; i++) {  //for input
            a[i]=sc.next(); 
        }

    //    no. of passes
        for(int i=0;i<n;i++){

            // no. of comparisions
            for(int j=0;j<n-i-1;j++){

                if(a[j].compareTo(a[j+1])>0){

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is\n");
            
        // display output
        for (int i = 0; i <=n-1; i++) {  //for print array
            System.out.println(""+a[i]);   
    }
}
}




           
