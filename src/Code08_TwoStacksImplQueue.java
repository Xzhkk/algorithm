import java.util.Stack;

public class Code08_TwoStacksImplQueue {

    public static class TwoStacksQueue {
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop;
        public TwoStacksQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }
        private void pushToPop(){
            if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
        }
        public void add(int pushInt){
            stackPush.push(pushInt);
            pushToPop();
        }
    }
}
