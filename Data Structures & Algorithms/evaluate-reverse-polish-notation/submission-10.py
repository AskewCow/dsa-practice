class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []

        for i in range(len(tokens)):
            c = tokens[i]

            if c == "+":
                x, y = stack.pop(), stack.pop()
                stack.append(x + y)
            elif c == "-":
                x, y = stack.pop(), stack.pop()
                stack.append(y - x)
            elif c == "*":
                x, y = stack.pop(), stack.pop()
                stack.append(x * y)
            elif c == "/":
                x, y = stack.pop(), stack.pop()
                stack.append(int(y / x))           
            else:
                stack.append(int(c))
        return stack[0]