class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        func(s);
        return s;
    }
    public void func(Stack<Integer> st){
        if(st.isEmpty()) return;
        int a = st.pop();
        func(st);
        func2(st,a);
        return;
    }
    public void func2(Stack<Integer> st, int toAdd){
        if(st.isEmpty()) {
            st.push(toAdd);
            return;
        }
        if(toAdd > st.peek()) {
            st.push(toAdd);
            return;
        }
        int temp = st.pop();
        func2(st, toAdd);
        st.push(temp);
        return;
    }
}
