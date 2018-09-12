/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        Node dummy = new Node(1111111, null);
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(dummy);
        
        List<Integer> level = new ArrayList<Integer>();
        
        while(queue.peek() != null)
        {
            root = queue.remove();
            if(root == dummy)
            {
                answer.add(level);
                level = new ArrayList<Integer>();
                if(queue.peek()!=null)
                {
                    queue.add(dummy);
                }
                continue;
            }
            
            level.add(root.val);
            for(Node child : root.children)
            {
                queue.add(child);
            }
        }
        return answer;
    }
}