class Solution
{ 
    static void reverse(Stack<Integer> s){
        func(s);
    }
    static void func(Stack<Integer> s){
        if(s.isEmpty()) return;
        int temp = s.pop();
        func(s);
        func2(s,temp);
    }
    static void func2(Stack<Integer> s, int toAdd){
        if(s.isEmpty()){
            s.push(toAdd);
            return;
        }
        int temp = s.pop();
        func2(s,toAdd);
        s.push(temp);
        return;
    }
}
