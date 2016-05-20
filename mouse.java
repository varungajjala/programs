import java.util.*;

public class mouse{
	public static class indexPair{
		int x;
		int y;
		indexPair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}

	public static boolean hasPath(int[][] maze){
		if(maze.length == 0){
			return false;
		}
		
		if(maze.length == 1 && maze[0].length == 0){
			return false;
		}

		if(maze.length == 1 && maze[0].length == 1){
			return true;
		}


		int[][] visitedNode = new int[maze.length][maze[0].length];
		Stack<indexPair> st = new Stack<indexPair>();
		indexPair c = new indexPair(0,0);
		st.push(c);
		visitedNode[0][0] = 1;
		while(true && !st.isEmpty()){
			indexPair temp = getPath(st.peek(), maze , visitedNode);
			if(temp.x == -1 && st.isEmpty()){
				return false;
			}else if(temp.x == -1){
				st.pop();
			}else if(temp.x == (maze.length - 1) && temp.y == (maze[0].length - 1)){
				return true;
			}else{
				st.push(temp);
				visitedNode[temp.x][temp.y] = 1;
			}
		}

		return false;
	}

	public static indexPair getPath(indexPair p, int[][] maze, int[][] visitedNode){
		int rowLength = maze.length;
		int columnLength = maze[0].length;
		if(((p.x+1) < rowLength) && maze[p.x + 1][p.y] == 1 && visitedNode[p.x + 1][p.y] != 1){
			indexPair npair = new indexPair((p.x + 1),p.y);
			System.out.println(npair.x + "," +npair.y);
			return npair;
		}

		if(((p.y+1)< columnLength) && maze[p.x][p.y + 1] == 1 && visitedNode[p.x][p.y + 1] != 1){
			indexPair npair = new indexPair(p.x,(p.y + 1));
			System.out.println(npair.x + "," +npair.y);
			return npair;
		}

		indexPair npair = new indexPair(-1,-1);

		return npair;
	}

	public static void main(String args[]){
		//int[][] maze = {{1,0,0,0,0},{1,1,0,0,0},{0,1,1,1,1},{0,0,0,0,1}};
		//int[][] maze = {{1,0,0,0,0},{1,1,0,0,0},{0,1,1,1,1},{0,0,0,0,1}};
		//int[][] maze = {{1,0,0,0,0},{1,1,0,0,0},{0,1,1,1,1},{0,0,0,0,1}};
		int[][] maze = {{1,1}};
		System.out.println(hasPath(maze));
	}
}
