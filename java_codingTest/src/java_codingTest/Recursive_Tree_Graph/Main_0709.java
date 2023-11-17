package java_codingTest.Recursive_Tree_Graph;
import java.util.*;

public class Main_0709 {
	Node root;
	Stack<Integer> ch = new Stack<>();
	static int cnt=Integer.MAX_VALUE;
	
	public void dfs(Node root) {
		if(root == null) {
			cnt = Math.min(cnt, ch.size()-1);
		}
		else {
			ch.push(root.data);
			dfs(root.lt);
			dfs(root.rt);
			ch.pop();
		}
	}
	
	// 풀이
	public int dfs2(int L, Node root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(dfs2(L+1, root.lt), dfs2(L+1, root.rt));
	}
	
	public static void main(String[] args) {
		Main_0709 tree = new Main_0709();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		
		//tree.dfs(tree.root);
		
		Main_0709 T = new Main_0709();
		
		System.out.println(T.dfs2(0, tree.root));

		return ;	
	}
}
