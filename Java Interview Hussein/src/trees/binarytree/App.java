package trees.binarytree;

public class App
{

	public static void main(String[] args)
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(bst.root, bst.createNode(30));
		bst.add(bst.root, bst.createNode(44));
		bst.add(bst.root, bst.createNode(8));
		bst.add(bst.root, bst.createNode(18));
		bst.add(bst.root, bst.createNode(0));
		bst.add(bst.root, bst.createNode(20));
		bst.add(bst.root, bst.createNode(68));
		
		bst.search(0, bst.root);
	}

}
