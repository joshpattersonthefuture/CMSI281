public class StackApp {

      public static void main( String[] args ) {
        Stack newStack = new Stack();
        newStack.push(11);
        newStack.display(); //11
        newStack.push(22);
        newStack.display(); //11, 22
        newStack.push(33);
        newStack.display(); //11, 22, 33
        newStack.push(44);
        newStack.display(); //11, 22, 33, 44
        newStack.push(55);
        newStack.display();//55,44,33,22,11
        System.out.println("Top of stack:" + newStack.peek()); //11

        newStack.pop();
        newStack.display(); //11, 22, 33, 44
        newStack.pop();
        newStack.display(); //44, 22, 33
        newStack.pop();
        newStack.display(); //33, 22
        newStack.pop();
        newStack.display(); //22
        newStack.pop();
        newStack.display(); //throw empty
        newStack.push(66);
        newStack.display(); //66
        System.out.println("Top of stack:" + newStack.peek()); //66
      }
}