import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class BinaryTree {
    
	static BinaryTree root;
	int data;
	BinaryTree left,right;
	BinaryTree(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	static void printLevelOrder(){
		if(root==null)
			System.out.println("Please insert some node into the tree");
		else{
			System.out.print("\n");
			Queue<BinaryTree> q = new LinkedList<BinaryTree>(); 
			q.add(root);
			while(q.size()!=0){
				BinaryTree temp=q.remove();
				System.out.print(temp.data);
				if(temp.left!=null){
					q.add(temp.left);
					if(temp.right!=null){
						q.add(temp.right);}}}}}
				
	static void deletenode(int data){
		if(search(data)==false){
			System.out.println("The node is not present please delete some valid node");
		}
		else{
			if(root.left==null){
				root=null;
			}
			else{
			BinaryTree fdpointer = null;
			BinaryTree lepointer  = null;
			Queue<BinaryTree> q=new LinkedList<BinaryTree>();
			Stack<BinaryTree> s=new Stack<BinaryTree>();
			q.add(root);
			while(q.size()!=0){
				BinaryTree temp=q.remove();
				System.out.println(temp.data);
				if(temp.data==data){
					fdpointer=temp;
					//System.out.println(fdpointer.data);
				}
				s.push(temp);
				if(temp.left!=null){
					q.add(temp.left);
					//System.out.println(temp.left.data);
					if(temp.right!=null){
						q.add(temp.right);
						//System.out.println(temp.right.data);
				
			}
			}
			}
			lepointer=s.pop();
			fdpointer.data=lepointer.data;
			while(s.empty()==false){
				BinaryTree temp=s.pop();
				if(temp.left==lepointer){
					temp.left=null;
					break;
				}
				if(temp.right==lepointer){
					temp.right=null;
					break;
				}
					
			}
		}
	}
	}
	static void insertnode(int data){
		if(root==null){
			BinaryTree temp=new BinaryTree(data);
			root=temp;
		}
		else{
			Queue<BinaryTree> q=new LinkedList<BinaryTree>();
			q.add(root);
			while(q.size()!=0){
				BinaryTree temp=q.remove();
				if(temp.left==null){
					temp.left=new BinaryTree(data);
					return;
				}
				else{
					if(temp.right==null){
						temp.right=new BinaryTree(data);
						return;
					}
					else{
						q.add(temp.left);
						q.add(temp.right);
					}
				}
			}
		}
	}
	

	static boolean search(int data){
		if(root.data==data)
			return true;
		else{
			return searchHelper(root,data);
		}
		
	}
	static boolean searchHelper(BinaryTree temp,int data){
		if(temp==null){
			return false;
		}
		else{
			if(temp.data==data)
				return true;
			else
				return(searchHelper(temp.left,data)||searchHelper(temp.right,data));
		}
	}
	static void printPreOrder(){
		if(root==null)
			System.out.println("Please insert some node into the binary tree");
		else{
			System.out.println(" ");
			printHelperPreOrder(root);
		}
	}
	static void printHelperPreOrder(BinaryTree temp){
		if(temp==null)
			return;
		System.out.print(temp.data);
		printHelperPreOrder(temp.left);
		printHelperPreOrder(temp.right);
	}
	static void printPostOrder(){
		if(root==null)
			System.out.println("Please insert some node into the binary tree");
		else{
			System.out.println(" ");
			printHelperPostOrder(root);
		}
	}
	static void printHelperPostOrder(BinaryTree temp){
		if(temp==null)
			return;
		
		printHelperPostOrder(temp.left);
		printHelperPostOrder(temp.right);
		System.out.print(temp.data);
	}
	static void printInOrder(){
		if(root==null)
			System.out.println("Please insert some node into the binary tree");
		else{
			System.out.println(" ");
			printHelperInOrder(root);
		}
	}
	static void printHelperInOrder(BinaryTree temp){
		if(temp==null)
			return;
		
		printHelperInOrder(temp.left);
		System.out.print(temp.data);
		printHelperInOrder(temp.right);
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree.insertnode(5);
		BinaryTree.insertnode(3);
		BinaryTree.insertnode(1);
		BinaryTree.insertnode(2);
		BinaryTree.insertnode(6);
		BinaryTree.insertnode(8);
		BinaryTree.insertnode(4);
		BinaryTree.insertnode(7);
		
		BinaryTree.printPreOrder();
		BinaryTree.printPostOrder();
		BinaryTree.printInOrder();
		BinaryTree.printLevelOrder();
		System.out.println("\n"+search(88));
		System.out.println(search(6));
        System.out.println(search(9));
        System.out.println(search(1));
        
        BinaryTree.deletenode(5);
        
        BinaryTree.printLevelOrder();
        System.out.println("\n");
        BinaryTree.deletenode(1);
        BinaryTree.deletenode(8);
        //BinaryTree.deletenode(8);
       // BinaryTree.deletenode(6);
        //BinaryTree.deletenode(2);
       // BinaryTree.deletenode(3);
        //BinaryTree.deletenode(4);
        System.out.println("hi");
        BinaryTree.printLevelOrder();
      
		

	}

}
