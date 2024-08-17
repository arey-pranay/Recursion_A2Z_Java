#### 04. Sort Stack With Recursion
- You'll need 2 func, 1st func(stack) to empty the stack and keeping the top in scope, when it returns, call func2(stack, curr).
- 2nd function will put the curr at proper place. If empty or curr > top, then just push. Otherwise, pop, call func2 again and push.

#### 05. Reverse Stack With Recursion
- Just like sorting you'll need 2 functions with almost exactly the same steps.
- But this time in func2, just pop the top element, call func2 and push it back again. This is a pushToBottomOfTheStack func.
