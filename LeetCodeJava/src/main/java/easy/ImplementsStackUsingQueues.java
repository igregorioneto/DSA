package easy;

public class ImplementsStackUsingQueues {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(1);
        obj.push(2);
        int param_1 = obj.top();
        int param_2 = obj.pop();
        obj.push(3);
        boolean param_3 = obj.empty();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);

        for (int e:obj.stack) {
            System.out.print(e + " ");
        }
    }
}
