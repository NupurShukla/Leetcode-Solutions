/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    int position;
    Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.position = 0;
        stack = new Stack<NestedInteger>();
        for(int i=nestedList.size()-1; i>=0; i--)
        {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        Integer ni = stack.peek().getInteger();
        stack.pop();
        return ni;
    }

    @Override
    public boolean hasNext() {
        if(stack.empty())
        {
            return false;
        }
        else
        {
            NestedInteger ni = stack.peek();
            if(ni.isInteger())
            {
                return true;
            }
            else
            {
                List<NestedInteger> l = ni.getList();
                stack.pop();
                for(int i=l.size()-1; i>=0; i--)
                {
                    stack.push(l.get(i));
                }
                return hasNext();
            }
        }    
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */