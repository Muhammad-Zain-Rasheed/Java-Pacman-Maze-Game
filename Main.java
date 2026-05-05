import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Scanner Input_Object = new Scanner(System.in);
        Random Random_Object = new Random();

        Structure Structure_Object = new Structure();

        Player Player_Object = new Player();
        Player_Object.Player_Location(Structure_Object);

        Enemies Enemies_Object = new Enemies();
        Enemies_Object.Enemies_Location(Structure_Object);

        while(true){
            Structure_Object.Show_Maze();
            Player_Object.Player_Movement(Structure_Object, Input_Object);
            Enemies_Object.Enemies_Movement(Structure_Object, Random_Object, Player_Object);
        }
    }
}



class Structure{
    char[][] maze = {
            {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','.','x'},
            {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'}
    };


    void Show_Maze(){
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze[i].length; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}



class Player {
    int playerx = 5;
    int playery = 9;
    int Score = 0;


    void Player_Location(Structure Structure_Object) {
        Structure_Object.maze[playerx][playery] = 'p';
    }


    void Player_Movement(Structure Structure_Object, Scanner Input_Object){
        if (Structure_Object.maze[playerx][playery] == 'E') {
            System.out.println("Enemy Caught You! Game Over !!!");
            System.out.println("Your Score is = " + Score);
            System.exit(0);
        }
        System.out.print("Move (W,A,S,D,w,a,s,d) = ");
        char move = Input_Object.nextLine().toLowerCase().charAt(0);
        int movex = playerx;
        int movey = playery;
        if (move == 'w'){
            movex--;
        } else if (move == 'a'){
            movey--;
        } else if (move == 'd'){
            movey++;
        } else if (move == 's') {
            movex++;
        } else {
            System.out.println("Invalid Move !!!");
            System.out.print("Move (W,A,S,D,w,a,s,d) = ");
            move = Input_Object.nextLine().toLowerCase().charAt(0);
        }

        if (Structure_Object.maze[movex][movey] != 'x'){
            if (Structure_Object.maze[movex][movey] == 'E') {
                System.out.println("Enemy Caught You! Game Over !!!");
                System.out.println("Your Score is = " + Score);
                System.exit(0);
            }
            Structure_Object.maze[playerx][playery] = ' ';
            playerx = movex;
            playery = movey;
            Structure_Object.maze[playerx][playery] = 'p';
            Score++;
            System.out.println("Your Score is = " + Score);
        } else {
            System.out.println("Hit a Wall! Game Over !!!");
            System.out.println("Your Score is = " + Score);
            System.exit(0);
        }
    }
}



class Enemies {
    int enemy1x = 1;
    int enemy1y = 1;
    int enemy2x = 1;
    int enemy2y = 17;
    int enemy3x = 9;
    int enemy3y = 1;
    int enemy4x = 9;
    int enemy4y = 17;


    void Enemies_Location (Structure Structure_Object){
        Structure_Object.maze[enemy1x][enemy1y] = 'E';
        Structure_Object.maze[enemy2x][enemy2y] = 'E';
        Structure_Object.maze[enemy3x][enemy3y] = 'E';
        Structure_Object.maze[enemy4x][enemy4y] = 'E';
    }


    void Enemies_Movement (Structure Structure_Object, Random Random_Object, Player Player_Object){

        int direction_enemy1 = Random_Object.nextInt(4);
        int move_enemy1_x = enemy1x;
        int move_enemy1_y = enemy1y;
        if (direction_enemy1 == 0) {
            move_enemy1_x--; // for upward
        } else if (direction_enemy1 == 1) {
            move_enemy1_x++; // for downward
        } else if (direction_enemy1 == 2) {
            move_enemy1_y--; // for leftside
        } else if (direction_enemy1 == 3) {
            move_enemy1_y++; // for rightside
        }
        if (Structure_Object.maze[move_enemy1_x][move_enemy1_y] == 'p') {
            System.out.println("Enemy Caught You! Game Over !!!");
            System.exit(0);
        }
        if (Structure_Object.maze[move_enemy1_x][move_enemy1_y] != 'x') {
            Structure_Object.maze[enemy1x][enemy1y] = '.';
            enemy1x = move_enemy1_x;
            enemy1y = move_enemy1_y;
            Structure_Object.maze[enemy1x][enemy1y] = 'E';
        }

        int direction_enemy2 = Random_Object.nextInt(4);
        int move_enemy2_x = enemy2x;
        int move_enemy2_y = enemy2y;
        if (direction_enemy2 == 0) {
            move_enemy2_x--; // for upward
        } else if (direction_enemy2 == 1) {
            move_enemy2_x++; // for downward
        } else if (direction_enemy2 == 2) {
            move_enemy2_y--; // for leftside
        } else if (direction_enemy2 == 3) {
            move_enemy2_y++; // for rightside
        }
        if (Structure_Object.maze[move_enemy2_x][move_enemy2_y] == 'p') {
            System.out.println("Enemy Caught You! Game Over !!!");
            System.exit(0);
        }
        if (Structure_Object.maze[move_enemy2_x][move_enemy2_y] != 'x') {
            Structure_Object.maze[enemy2x][enemy2y] = '.';
            enemy2x = move_enemy2_x;
            enemy2y = move_enemy2_y;
            Structure_Object.maze[enemy2x][enemy2y] = 'E';
        }

        int direction_enemy3 = Random_Object.nextInt(4);
        int move_enemy3_x = enemy3x;
        int move_enemy3_y = enemy3y;
        if (direction_enemy3 == 0) {
            move_enemy3_x--; // for upward
        } else if (direction_enemy3 == 1) {
            move_enemy3_x++; // for downward
        } else if (direction_enemy3 == 2) {
            move_enemy3_y--; // for leftside
        } else if (direction_enemy3 == 3) {
            move_enemy3_y++; // for rightside
        }
        if (Structure_Object.maze[move_enemy3_x][move_enemy3_y] == 'p') {
            System.out.println("Enemy Caught You! Game Over !!!");
            System.exit(0);
        }
        if (Structure_Object.maze[move_enemy3_x][move_enemy3_y] != 'x') {
            Structure_Object.maze[enemy3x][enemy3y] = '.';
            enemy3x = move_enemy3_x;
            enemy3y = move_enemy3_y;
            Structure_Object.maze[enemy3x][enemy3y] = 'E';
        }

        int direction_enemy4 = Random_Object.nextInt(4);
        int move_enemy4_x = enemy4x;
        int move_enemy4_y = enemy4y;
        if (direction_enemy4 == 0) {
            move_enemy4_x--; // for upward
        } else if (direction_enemy4 == 1) {
            move_enemy4_x++; // for downward
        } else if (direction_enemy4 == 2) {
            move_enemy4_y--; // for leftside
        } else if (direction_enemy4 == 3) {
            move_enemy4_y++; // for rightside
        }
        if (Structure_Object.maze[move_enemy4_x][move_enemy4_y] == 'p') {
            System.out.println("Enemy Caught You! Game Over !!!");
            System.exit(0);
        }
        if (Structure_Object.maze[move_enemy4_x][move_enemy4_y] != 'x') {
            Structure_Object.maze[enemy4x][enemy4y] = '.';
            enemy4x = move_enemy4_x;
            enemy4y = move_enemy4_y;
            Structure_Object.maze[enemy4x][enemy4y] = 'E';
        }
    }
}