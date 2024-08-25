import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerOnLeft {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 2, 5};
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>(); //Prefer a Deque over Stack
        for (int i=0; i< arr.length; i++) {
            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
             if(stack.isEmpty()) {
                 result[i] = -1;
             }
            else {
            result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        Arrays.stream(result).forEach(System.out::println); //-1, 1, -1, 0, 2
    }
}
