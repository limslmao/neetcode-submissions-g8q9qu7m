class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c == '[' or c == '(' or c == '{':
                stack.append(c)
            else:
                if len(stack) == 0:
                    return False

                partner = stack[-1]

                if c == ')' and partner == '(':
                    stack.pop()
                elif c == ']' and partner == '[':
                    stack.pop()
                elif c == '}' and partner == '{':
                    stack.pop()
                else:
                    return False
        
        return not stack
                    
        