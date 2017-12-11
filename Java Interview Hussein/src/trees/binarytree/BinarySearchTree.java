package trees.binarytree;

public class BinarySearchTree
{
	Node root;
	
	public BinarySearchTree()
	{
		root=null;
	}
	
	public void add(Node start, Node newNode)

	{
		if(root==null)
		{
			root=newNode;
			return;
		}
		if(newNode.value>start.value)
		{
			if(start.rightNode==null)
			{
				start.rightNode=newNode;
			}
			add(start.rightNode, newNode);
		}
		if(newNode.value<start.value)
		{
			if(start.leftNode==null)
			{
				start.leftNode=newNode;
			}
			add(start.leftNode, newNode);
		}
	}
	
	public void search(int value, Node start)
	{
		if(start==null)
		{
			System.out.println("The tree is empty");
			return;
		}
		else if(value==start.value)
		{
			System.out.println("Value "+value+" found!");
			return;
		}
		else if(value>start.value)
		{
			search(value, start.rightNode);
		}
		else if(value<start.value)
		{
			search(value, start.leftNode);
		}
	}
	
	public Node createNode(int value)
	{
		return new Node(value, null, null);
	}
}