package graphs.depthfirstsearch;

public class App
{
	public static void main(String[] args)
	{
		DepthFirstSearchGraph dfsg=new DepthFirstSearchGraph(8);
		dfsg.add(0, 2);
		dfsg.add(0, 1);
		dfsg.add(1, 4);
		dfsg.add(1, 3);
		dfsg.add(1, 2);
		dfsg.add(3, 1);
		dfsg.add(4, 1);
		dfsg.add(2, 5);
		dfsg.add(2, 1);
		dfsg.add(5, 2);
		dfsg.depthFirstSearch(0);
	}
}