package STACKS_AND_QUEUES;

import java.util.Stack;

public class Delete_middle_element_of_a_stack {
    public static void main(String[] args) {

    }
    public void deleteMid(Stack<Integer> s,int sizeOfStack){
        int mid = sizeOfStack / 2;
        removeMid(s , mid);
    }

    static void removeMid(Stack<Integer> stack , int mid){
        if(mid == 0){
            stack.pop();
            return;
        }

        int element = stack.pop();
        removeMid(stack , mid-1);
        stack.push(element);
    }
}
