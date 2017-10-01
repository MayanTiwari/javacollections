package roughWork;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by mayan on 16/9/17.
 */
public class Calculator {
    public int evaluate(String input){
        final String[] arr = input.split(" ");
        final Deque<String> stack = new ArrayDeque<>();
        for(String s : arr){
            stack.add(s);
        }
        while(stack.size() > 1){
            int number1 = Integer.parseInt(stack.pop());
            String operator = stack.pop().toString();
            int number2 = Integer.parseInt(stack.pop());
            stack.push(String.valueOf(getResultByOperator(operator,number1,number2)));
        }
        return Integer.parseInt(stack.poll());
    }
    private int getResultByOperator(String operator,int number1,int number2){
        int result =0;
        switch (operator){
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
        }
        return result;
    }
}
