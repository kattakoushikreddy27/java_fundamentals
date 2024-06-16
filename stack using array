import java.util.*;

public class practise{
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());
        s.push(1);
        s.push(2);
        s.push(1);
        s.push(123);
        System.out.println(s.size());
    }
}

class stack{
    int size = 100;
    int arr[] = new int[size];
    int top = -1;

    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop() {
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}
