import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("size of the array: ");
		Scanner in = new Scanner(System.in);
    
		int size =in.nextInt();
		int array[] = new int[size] ; // creating an array
		//taking input
		for (int i=0;i<size;i++){
		    System.out.print("Enter element "+ (i+1) +" here: ");
		    array[i] = in.nextInt();
		
		}
    //printing output
		System.out.println("output");
		for(int i=0;i<size;i++){
		    System.out.println("array  "+ "["+(i)+"]" + " == "+array[i]);
		}
	}
}

// for strings
import java.util.*;
public class Main{
    public static void main(String []args){
        System.out.println("Enter the size of the string array");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        String sarray[] = new String[s];
        for(int i=0;i<s;i++){
            System.out.println("enter the string "+(i+1)+" :");
            sarray[i] = in.next();      
            
        }
        for(int i=0;i<sarray.length;i++){
            System.out.print(sarray[i]);
        }
    }
}

// for charters
import java.util.*;
public class Main{
    public static void main(String []args){
        System.out.println("Enter the size of the string array");
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        char carray[] = new char[s];
        for(int i=0;i<s;i++){
            System.out.println("enter the string "+(i+1)+" :");
            carray[i] = in.next().charAt(0);      
            
        }
        for(int i=0;i<s;i++){
            System.out.print(carray[i]);
        }
    }
}
