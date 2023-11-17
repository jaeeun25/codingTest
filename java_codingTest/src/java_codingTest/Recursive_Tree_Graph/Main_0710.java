package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0710 {
	Node root;
	Stack<Integer> ch = new Stack<>();
	
	public int bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node n = q.poll();

				if(n.rt == null && n.lt == null) return level;
				if(n.lt != null) q.offer(n.lt);
				if(n.rt != null) q.offer(n.rt);
			}
			level++;
		}
		
		return level;
	}	
	
	public static void main(String[] args) {
		Main_0710 tree = new Main_0710();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		System.out.println(tree.bfs(tree.root));
		
		return ;	
	}
}
