
import java.util.Stack;

public class valid_parenthesis {

    public static void main(String[] args) {
        String test1, test2, test3, test4, test5;
        //test 1
        test1 = "()";
        //test 2
        test2 = "()[]{}";
        //test 3
        test3 = "(]";
        //test 4
        test4 = "([])";
        //test 5
        test5 = "([)]";

        valid_parenthesis solution = new valid_parenthesis();
        System.out.println("result 1 : " + solution.isValid(test1));
        System.out.println("result 2 : " + solution.isValid(test2));
        System.out.println("result 3 : " + solution.isValid(test3));
        System.out.println("result 4 : " + solution.isValid(test4));
        System.out.println("result 5 : " + solution.isValid(test5));
    }

    //rules if all brackets have same type return true
    //logic use stack if an opening bracket push onto the stack
    // if you see a closing you pop it.
    // now check if the stack is empty ? true : false
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            //check any opening characters
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
                stack.push(ch[i]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                //check what character are we currently at
                if (ch[i] == ')') {
                    //check if there's a pair
                    if (stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                } else if (ch[i] == ']') {
                    if (stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                } else if (ch[i] == '}') {
                    if (stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                }
                //wrong ulit
/*            if (stack.empty() || stack.peek() != ')'){
            return false;
            }
            if (stack.empty() || stack.peek() != ']'){
            return false;
            }
            if (stack.empty() || stack.peek() != '}'){
            return false;
            }*/
            }

            /*else if (ch[i] == ']') {
                stack.pop();
            }else if (ch[i] == ')') {
                stack.pop();
            }else if (ch[i] == '}') {
                stack.pop();
            }*/
        }
        //then check if stack is empty or not

        return stack.isEmpty();

    }
}
