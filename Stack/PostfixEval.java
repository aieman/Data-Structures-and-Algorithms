package com.company;

import java.util.Stack;

public class PostfixEval {

    public static int postfixEvaluation(String expression){
        if(expression.length() == 0)
            return Integer.MIN_VALUE;

        Stack<Integer> st = new Stack<Integer>();
        int num1 = 0, num2 = 0;
        String[] tokens = expression.split(" ");

        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("*")){
                num1 = st.pop();
                num2 = st.pop();

                int val = num1 * num2;

                st.push(val);
            }
            else if(tokens[i].equals("/")){
                num1 = st.pop();
                num2 = st.pop();

                int val = num1 / num2;

                st.push(val);
            }
            else if(tokens[i].equals("-")){
                num1 = st.pop();
                num2 = st.pop();

                int val = Math.abs(num1 - num2);

                st.push(val);
            }
            else if(tokens[i].equals("+")){
                num1 = st.pop();
                num2 = st.pop();

                int val = num1 + num2;

                st.push(val);
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.peek();
    }
}
