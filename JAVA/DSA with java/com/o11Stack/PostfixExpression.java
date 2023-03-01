package com.o11Stack;

import java.util.Stack;

public class PostfixExpression {

    public static void main(String[] args) {
//        String a="a+b*d";
//        System.out.println(Prefix("a-b/c*d*e+f"));
//        System.out.println(Prefix("(((a+b)-c)*d)"));
//        System.out.println(Prefix("x+y-z/p"));
//        System.out.println(Prefix("(a+b)*c"));
//        System.out.println(Prefix(a));
        System.out.println(Long.parseLong("1101110010111011110001001101010111100",2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(EvalPrefix("32+7*4-"));
    }

    static public int EvalPrefix(String s) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                stack.push(s.charAt(i) - '0');
            continue;
            }
            int second_op = stack.pop();
            int first_op = stack.pop();
            if (s.charAt(i) == '+') {
                sum = second_op + first_op;
                stack.push(sum);
            } else if (s.charAt(i) == '-') {
                sum = first_op-second_op;
                stack.push(sum);
            } else if (s.charAt(i) == '*') {
                sum = second_op * first_op;
                stack.push(sum);
            } else if (s.charAt(i) == '/') {
                sum = first_op/second_op;
                stack.push(sum);
            }

        }
        return sum;
    }
   static public String Prefix(String s)
    {
        Stack<Character> stack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            // if ( is found
            if(s.charAt(i)=='(') {
                stack.push(s.charAt(i));
                continue;
            }
            // if found operand or any number
           else if((s.charAt(i)>='0' && s.charAt(i)<='9') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='z')) {
                ans.append(s.charAt(i));
                continue;
            }
            // if found )
            else if(s.charAt(i)==')')
            {
                while(stack.peek()!='(')
                {
                    ans.append(stack.pop());
                }
                stack.pop(); // we need to pop ( thing also
            }
            else {
                // if stack is empty
                if(stack.isEmpty())
                {
                    stack.push(s.charAt(i));
                    continue;
                }
                // if charAt is bigger precedence
                if((stack.peek()=='+' || stack.peek()=='-') && (s.charAt(i)=='*' || s.charAt(i)=='/')){
                    stack.push(s.charAt(i));
                continue;
                }
                // if both have same precedence
                else if((s.charAt(i)=='+' || s.charAt(i)=='-') && (stack.peek()=='+' || stack.peek()=='-'))
                {
                    ans.append(stack.pop());
                    stack.push(s.charAt(i));
                    continue;
                }
                else if((s.charAt(i)=='*' || s.charAt(i)=='/') && (stack.peek()=='*' || stack.peek()=='/'))
                {
                    ans.append(stack.pop());
                    stack.push(s.charAt(i));
                    continue;
                }
                // if top elemnt is not even a operator
                if(stack.peek()=='(' || stack.peek()==')')
                {
                    stack.push(s.charAt(i));
                    continue;
                }
                else
                {
                    // if charAt is smaller precedence
                    while(true)
                    {
                        ans.append(stack.pop());
                        if(stack.isEmpty()) {
                            stack.push(s.charAt(i));
                            break;
                        }

                        if(stack.peek()=='+' || stack.peek()=='-'){
                            ans.append(stack.pop());
                            stack.push(s.charAt(i));
                            break;}
                    }
                }
            }
        }
        while(!stack.isEmpty())
            ans.append(stack.pop());
        return ans.toString();
    }
}
