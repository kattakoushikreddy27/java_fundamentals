import java.util.*; 

public class ls {
    
    public static int Lsearch(int arr[],int key){

        for(int i = 0;i<arr.length;i++){
            if( arr[i] == key){
               return i;
            }
             
        }
        return -1;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter the key:");
        int key = in.nextInt();

       int index =  Lsearch(arr, key);
       if(index == -1){
        System.out.println("not founf");
       }
       else{
        System.out.println("found at index :- "+index);
       }

    }
    
}


