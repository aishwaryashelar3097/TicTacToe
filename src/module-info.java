module TicTacToe {
	import java.io.*;
	import java.util.Scanner;
	
			public static final int ROWS=3,COLS=3;
	        public static int[][] board = new int [ROWS][COLS];
	        public static int currentState;
	        public static int currenrRow, currentCol;
	        
	        public static Scanner in = new Scanner(System.in);
	        
	        public static void main(String[] args) {
	        	initGame();
	        	do {
	        		playerMove(movePlayer);
	        		updateGame(movePlayer,currentRow,currentCol);
	        		printBoard();
	        		
	        		if (currentState == CROSS_WON) {
	        			System.out.println("'X' won! Bye!");
	        		} else if (currentState == ZERO_WON) {
	        			System.out.println("'0' won! Bye!");
	        		} else if (currentState == DRAW) {
	        			System.out.println("It's a Draw! Bye!");
	        		}
	        		
	        	}
	        	
	        }
	        public static void printBoard() {
	        	for (int row=0;row <  ROWS; ++row) {
	        		for(int col=0;col<COLS; ++col) {
	        			printCell(board[row][col]);
	        			if (col!=COLS-1) {
	        				System.out.print("|");
	        			}
	        		}
	        		System.out.println();
	        		if(row!=ROWS-1) {
	        			System.out.println("-----");
	        		}
	        	}
	        System.out.println();
	        }
	        /**Initialize the game board contents*/
	        public static void initGame() {
	        	for (int row=0;row<ROWS;++row) {
	        		for(int col=0;col<COLS;++col) {
	        			board[row][col]=EMPTY;
	        		}
	        	}
	        	currentState = PLAYING;
	        	currentPlayer = CROSS;
	        }
	        
}