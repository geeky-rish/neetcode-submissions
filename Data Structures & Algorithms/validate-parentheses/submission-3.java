class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }

        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }

}