import java.util.Scanner;

class Try_Catch{
    public static void main(String[] args){
        System.out.println(" Program Started ");
        
        Scanner sc = new Scanner(System.in);

       int a[] = new int[5];


        

    

    
    

    System.out.println("Enter the element of array : ");
                for(int i=1; i<5; i++){
                    a[i] = sc.nextInt();
                }

                
     System.out.println("Enter the divizor");
                int  n =  sc.nextInt();

    try{

        for(int i=1; i<5; i++){
            System.out.println("Reminder : " + a[i]%n);
        }

    }

    catch(Exception e){
        System.out.println(e);
        System.out.println(" Program Ended");
    }

    }
}