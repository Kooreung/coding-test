import java.util.Stack;


class Solution {
    public int[] solution(int[] numbers, String direction) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i++) {
            stack.add(numbers[i]);
        }

        int[]answer = new int [stack.size()];

        if (direction.equals("right")) {
            stack.add(0, stack.pop());
        } else {
            stack.push(stack.remove(0));
        }

        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}