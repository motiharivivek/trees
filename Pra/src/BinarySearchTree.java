
public class BinarySearchTree {
BinarySearchTree left;
BinarySearchTree right;
int data;
static BinarySearchTree root;
BinarySearchTree(int data){
	this.left=null;
	this.right=null;
	this.data=data;
	
}

static void insertnode(int data){
	if(root==null){
		BinarySearchTree temp=new BinarySearchTree(data);
		root=temp;
	}
	else insertHelper(root,data);
	
}
static void insertHelper(BinarySearchTree temp, int data){
	if(data<temp.data){
		if(temp.left==null){
			temp.left=new BinarySearchTree(data);
		}
		else{
			insertHelper(temp.left,data);
		}
	}
	else{
		if(data>temp.data){
			if(temp.right==null){
				temp.right=new BinarySearchTree(data);
			}
			else{
				insertHelper(temp.right,data);
			}
		}
		else{
			System.out.println("The node already exists into the BinarySearchTree.");
		}
	}
}
static boolean search(int data){
	if(root==null)
		return false;
	else  return searchHelper(root,data);
}
static boolean searchHelper(BinarySearchTree temp,int data){
	if(temp==null)
		return false;
	else{
	if(temp.data==data)
		return true;
	else{
		if(data>temp.data)
			return searchHelper(temp.right,data);
		else{
			if(data<temp.data)
				return searchHelper(temp.left, data);
			else return false;
		}
		
	}
}
}
static void printInOrder(){
	if(root==null)
		System.out.println("Please insert some node into the BinarySearchTree");
	else printInOrderHelper(root);
}
static void printInOrderHelper(BinarySearchTree temp){
	if(temp==null)
		return;
	else{
	printInOrderHelper(temp.left);
	System.out.print(temp.data+" ");
	printInOrderHelper(temp.right);
	}
}
static void printPreOrder(){
	if(root==null)
		System.out.println("Please insert some node into the BinarySearchTree");
	else printPreOrderHelper(root);
}
static void printPreOrderHelper(BinarySearchTree temp){
	if(temp==null)
		return;
	System.out.print(temp.data+" ");
	printPreOrderHelper(temp.left);
	printPreOrderHelper(temp.right);
}
static void printPostOrder(){
	if(root==null)
		System.out.println("Please insert some node into the BinarySearchTree");
	else printPostOrderHelper(root);
}
static void printPostOrderHelper(BinarySearchTree temp){
	if(temp==null)
		return;
	printPostOrderHelper(temp.left);
	printPostOrderHelper(temp.right);
	System.out.print(temp.data+" ");
	
}
static void deletenode(int data){
	
}

public static void main(String[] args) {
		
BinarySearchTree.insertnode(50);
BinarySearchTree.insertnode(15);
BinarySearchTree.insertnode(62);
BinarySearchTree.insertnode(5);
BinarySearchTree.insertnode(20);
BinarySearchTree.insertnode(58);
BinarySearchTree.insertnode(91);
BinarySearchTree.insertnode(3);
BinarySearchTree.insertnode(8);
BinarySearchTree.insertnode(37);
BinarySearchTree.insertnode(60);
BinarySearchTree.insertnode(24);
//BinarySearchTree.insertnode(24);
BinarySearchTree.printInOrder();
System.out.println("\n");
BinarySearchTree.printPreOrder();
System.out.println("\n");
BinarySearchTree.printPostOrder();
System.out.println(search(90));
	}

}
