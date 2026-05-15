package com.ou_solutions;

public class RatInMaze {
static int N;

	
	public static void main(String[] args) {
		
		int[][] maze= {
				{1,0,0,0},
				{1,1,0,1},
				{0,1,1,0},
				{1,0,1,1}};
		N=maze.length;
		
		RatInMaze rat = new RatInMaze();
		
		rat.solveMaze(maze);
		
		
	}


	private void solveMaze(int[][] maze) {
		
		N = maze.length;
		int sol [] [] = new int [N][N];
		
		solver(maze,0,0,sol);
		
		printSolution(sol);
		
	}
	
	void printSolution(int[][] sol) {
        for (int[] row : sol) {
            for (int cell : row) System.out.print(" " + cell + " ");
            System.out.println();
        }
    }


	private boolean solver(int[][] maze, int x, int y, int[][] sol) {
		
		if(x == N - 1 && y == N -1 && maze[x][y] == 1)
		{
			sol[x][y] = 1;
			return true;
		}
		
		if(isSafe(maze,x,y))
		{
			if (sol[x][y] == 1) return false;
			sol[x][y] = 1;
			
			if(solver(maze, x + 1, y, sol)) return true;
			
			if(solver(maze, x, y + 1, sol)) return true;
			
			sol[x][y] = 0;
			
			return false;
		}
		
		return false;
		
	}


	private boolean isSafe(int[][] maze, int x, int y) {
		
		if(x >= 0 && y >=0 && x < N && y < N  && maze[x][y] == 1)
		{
			return true;
		}
		
		return false;
		
	}
	
}
