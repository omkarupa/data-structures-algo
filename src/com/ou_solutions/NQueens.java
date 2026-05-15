package com.ou_solutions;
import java.util.*;

public class NQueens {
	
	 static int n = 4;
	 
	 public static void main(String[] args) {
		
		 char [] [] board = new char[n][n];
		 
		 for(int i = 0 ; i< n; i++)
		 {
			 Arrays.fill(board[i], '.');
		 }
		 
		 printBoard(board);
		 
		 solve(board,0);
		 
	}

	private static boolean solve(char[][] board, int row) {
		
		if(row == board.length)
		{
			printBoard(board);
			return true;
		}
		
		for(int col = 0;col<board.length;col++)
		{
			
			System.out.println("going for checking isSafe : Row " + row + " col " + col);
			
			if(isSafe(board,row,col))
		{
				
				board [row] [col] = 'Q';
				
				printBoard(board);
				
				System.out.println("Row " + row + " col" + col);
				
				if(solve(board,row+1))
				{
					System.out.println("recurssion true " +  "Row " + row + " col" + col);
					return true;
				}
				else {
					System.out.println("recurssion false " +  "Row " + row + " col" + col);
				}
				
				System.out.println("Removing Q from Row " + row + " col" + col);
				
				board[row][col] = '.';
				
				
				printBoard(board);
		}
			
			System.out.println("Not safe at " +  "Row " + row + " col " + col);
		
			
		}
		
		return false;
		
}

	
	private static boolean isSafe(char[][] board, int row, int col) {
		
		// checking if current row upper row is there any queen then not safe place hence return false
		for(int i = 0; i< row;i++)
		{
			if(board[i][col] == 'Q')
				return false;
		}
		
		
		for(int i = row - 1,j = col - 1; i >= 0 && j >= 0;i--,j--)
		{
			if(board[i][j] == 'Q')
				return false;
		}
		
		for(int i = row - 1,j = col +1; i >= 0 && j < board.length; i--,j++)
		{
			if(board[i][j] == 'Q')
				return false;
		}
		
		
		return true;
	}

	private static void printBoard(char[][] board) {
		
		 System.out.println("Solution:");

	        for (char[] row : board) {
	            for (char cell : row) {
	                System.out.print(cell + " ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	}
	
	
}