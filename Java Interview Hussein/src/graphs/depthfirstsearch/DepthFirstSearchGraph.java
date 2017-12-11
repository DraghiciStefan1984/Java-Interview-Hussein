package graphs.depthfirstsearch;

import java.awt.print.Book;
import java.util.Stack;

public class DepthFirstSearchGraph
{
	int size;
	AdjacencyList[] adjacencyList;
	
	public DepthFirstSearchGraph(int size)
	{
		this.size = size;
		adjacencyList=new AdjacencyList[this.size];
		for(int i=0; i<size; i++)
		{
			adjacencyList[i]=new AdjacencyList();
			adjacencyList[i].head=null;
		}
	}
	
	public void add(int source, int destination)
	{
		Node newNode=new Node(destination, null);
		newNode.nextNode=adjacencyList[source].head;
		adjacencyList[source].head=newNode;
	}
	
	public void depthFirstSearch(int startVertex)
	{
		Boolean[] visitedNodesBooleanArray=new Boolean[size];
		for(int i=0; i<size; i++)
		{
			visitedNodesBooleanArray[i]=false;
		}
		
		Stack<Integer> visitedNodesStack=new Stack<>();
		visitedNodesStack.push(startVertex);
		
		while(!visitedNodesStack.isEmpty())
		{
			int visitedNode=visitedNodesStack.pop();
			visitedNodesStack.push(visitedNode);
			visitedNodesBooleanArray[visitedNode]=true;
			Node head=adjacencyList[visitedNode].head;
			Boolean isDone=true;
			
			while(head!=null)
			{
				if(visitedNodesBooleanArray[head.value]==false)
				{
					visitedNodesStack.push(head.value);
					visitedNodesBooleanArray[head.value]=true;
					isDone=false;
					break;
				}
				else
				{
					head=head.nextNode;
				}
			}
			
			if(isDone==true)
			{
				
			}
		}
	}
}