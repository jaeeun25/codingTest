package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0707 {
	Node root;
	public void bfs(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int L=0;
		
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Node n = q.poll();
				System.out.print(n.data + " ");
				
				// 말단 노드인지 체크
				if(n.lt != null) q.offer(n.lt);
				if(n.rt != null) q.offer(n.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Main_0707 tree = new Main_0707();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		
		tree.bfs(tree.root);
		
		return ;	
	}
}
