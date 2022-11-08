import java.util.Stack;

class ValideParanthesis {
    static boolean checkParenthesis(String str) {

        Stack<Character> st = new Stack<Character>();
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (str.charAt(i) == ')' && st.empty())
                return false;
            else if (str.charAt(i) == ')' && !st.empty())
                st.pop();
            else
                st.push(str.charAt(i));

            i++;

        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "()()()()()()(())()((()))()()(())(";
        System.out.println(checkParenthesis(str));
    }
}