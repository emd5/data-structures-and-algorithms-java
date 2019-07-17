package multiBracketValidation;

import java.util.Stack;

public class MultiBracketValidation {

    private static final String OPENSQUARE = "[";
    private static final String OPENCURLY = "{";
    private static final String OPENPAREN = "(";
    private static final String CLOSESQUARE = "]";
    private static final String CLOSECURLY = "}";
    private static final String CLOSEPAREN = ")";

    public static boolean multiBracketValidation(String input){

        String[] inputArray = input.split("");
        Stack stack = new Stack();
        int countLetters = 0;

        for(int i=0; i < inputArray.length; i++){

            if(inputArray[i].equals(OPENSQUARE) || inputArray[i].equals(OPENCURLY) || inputArray[i].equals(OPENPAREN)){
                stack.push(inputArray[i]);
            }
            else{
                if(inputArray[i].equals(CLOSECURLY) && stack.peek().equals(OPENCURLY)){
                    stack.pop();
                }
                else if(inputArray[i].equals(CLOSESQUARE) && stack.peek().equals(OPENSQUARE)){
                    stack.pop();
                }
                else if(inputArray[i].equals(CLOSEPAREN) && stack.peek().equals(OPENPAREN)){
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(multiBracketValidation("{Hello}")); //true
        System.out.println(multiBracketValidation("{}")); //true
        System.out.println(multiBracketValidation("{[]}")); //true
        System.out.println(multiBracketValidation("{({}")); //false

    }

}
