/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genome;

/**
 *
 * @author Hayden
 */
public class Maze {

    int size = 100;
    int difficulty = 15;
    int len = size / 6;
    int mazeArray[][] = new int[size][size];
    int masterMaze[][] = new int[size][size];
    int yPos = 1;
    int xPos = 1;
    int winCount = 0;
    boolean winFlag = false;

    public Maze() {
        size = 100;
        difficulty = 15;
        makeMaze();
       // printMaze();

    }

    public Maze(int i) {
        size = i;
        difficulty = 15;
        makeMaze();
        //printMaze();
    }

    public Maze(int i, int j) {
        size = i;
        difficulty = j;
        makeMaze();
        //printMaze();
    }

    public void setMazeArray(int a, int b, int c){
        mazeArray[a][b] = c;
    }
    
    public void makeMaze() {
        makeBorder();
        setMazeArray(1,1,3); // 3 is the starting position; Start at the 3
       
        yPos = 1;
        xPos = 1; //tracking where the player is
        setMazeArray(size-2, size-2, 4);// 4 is the end position; land on the 4 to win.
        placeWalls();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                masterMaze[i][j]=mazeArray[i][j];
            }
        }
    }

    public void printMaze() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + mazeArray[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void makeBorder() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == (size - 1) || j == 0 || j == size - 1) {
                    
                    setMazeArray(i,j,2);
                }
            }
        }
    }

    public int showWins(){
        return winCount;
    }
    
    public void newMaze(int i) {
        difficulty = i;
        clearBoard();
        makeMaze();
        
    }

    public void placeWalls() {
        insertWalls(difficulty);
        if (!possibleCheck()) {
            clearBoard();
            makeBorder();
            placeWalls();

        }
    }

    private void insertWalls(int i) {
        int a = 0;
        while (a < i) {
            int x = (int) (Math.random() * size);
            int y = (int) (Math.random() * size); //0-size-1
            int dir = (int) (Math.random() * 4); // 0-3

            if (dir == 0) {
                if (placeCheck(x, y)) {
                    for (int j = 0; j < len; j++) {
                        setMazeArray(x+j,y,2);
                    }
                    a++;
                }
            }
            if (dir == 1) {
                if (placeCheck(x, y)) {
                    for (int j = 0; j < len; j++) {
                        setMazeArray(x-j,y,2);
                    }
                    a++;
                }
            }
            if (dir == 2) {
                if (placeCheck(x, y)) {
                    for (int j = 0; j < len; j++) {
                        setMazeArray(x,y+j,2);
                    }
                    a++;
                }
            }
            if (dir == 3) {
                if (placeCheck(x, y)) {
                    for (int j = 0; j < len; j++) {
                        setMazeArray(x,y-j,2);
                    }
                    a++;
                }
            }

        }
    }
    
    public void cleanMaze(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mazeArray[i][j]=masterMaze[i][j];
            }
        }
    }

    private boolean placeCheck(int a, int b) {
        return !(a + len >= size
                || b + len >= size
                || a - len < 0
                || b - len < 0);
    }

    private boolean possibleCheck() {
        int a = 0;
        if (mazeArray[1][1] != 3 || mazeArray[size - 2][size - 2] != 4) {
            return false;
        }

        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                if (mazeArray[j][i] == 0) {
                    a++;
                }
            }
            if (a == 0) {
                return false;
            }
            a = 0;
        }

        for (int i = 1; i < size - 1; i++) {
            for (int j = 1; j < size - 1; j++) {
                if (mazeArray[i][j] == 0) {
                    a++;
                }
            }
            if (a == 0) {
                return false;
            }
            a = 0;
        }
        return true;
    }

    private void clearBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mazeArray[i][j] = 0;
            }
        }
        yPos = 1;
        xPos = 1;
    }

    public void mLeft() {
        if (mazeArray[yPos][xPos - 1] != 2) {
            setMazeArray(yPos,xPos,0);
//            mazeArray[yPos][xPos] = 0;
            xPos--;
            if (winCheck()) {
                win();
            }
//            mazeArray[yPos][xPos] = 3;
            setMazeArray(yPos,xPos,3);
        }
        
    }

    public void mRight() {
        if (mazeArray[yPos][xPos + 1] != 2) {
            setMazeArray(yPos,xPos,0);
//            mazeArray[yPos][xPos] = 0;
            xPos++;
            if (winCheck()) {
                win();
            }
//            mazeArray[yPos][xPos] = 3;
            setMazeArray(yPos,xPos,3);
        }
    }

    public void mUp() {
        if (mazeArray[yPos - 1][xPos] != 2) {
//            mazeArray[yPos][xPos] = 0;
            setMazeArray(yPos,xPos,0);
            yPos--;
            if (winCheck()) {
                win();
            }
//            mazeArray[yPos][xPos] = 3;
            setMazeArray(yPos,xPos,3);
        }
    }

    public void mDown() {
        if (mazeArray[yPos + 1][xPos] != 2) {
            setMazeArray(yPos,xPos,0);
//            mazeArray[yPos][xPos] = 0;
            yPos++;
            if (winCheck()) {
                win();
            }
//            mazeArray[yPos][xPos] = 3;
setMazeArray(yPos,xPos,3);
        }
    }

    public int detect() {
        if (mazeArray[xPos + 1][yPos] == 2) {
            return 1; //wall to right
        }
        if (mazeArray[xPos - 1][yPos] == 2) {
            return 2; //wall to left
        }
        if (mazeArray[xPos][yPos + 1] == 2) {
            return 3; //wall below
        }
        if (mazeArray[xPos][yPos - 1] == 2) {
            return 4; //wall above
        }
        return 0; //no walls touching

    }

    public void doOne(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (!winFlag) {
                    machineAction(a[i]);
                }
        }
    }
    

    
    public void machineAction(int i) {
        if(!winFlag){
        switch (i) {
            case 0:
                break;
            case 1:
                mUp();
                break;
            case 2:
                mDown();
                break;
            case 3:
                mLeft();
                break;
            case 4:
                mRight();
                break;
            case 5:
                if(detect()==4){ // if the wall is above
                    mLeft();
                }
                break;
            case 6:
                if(detect()==4){
                    mDown();
                }
                break;
            case 7:
                if(detect()==4){
                    mRight();
                }
                break;
            case 8:
                if(detect()==1){ // if the wall is to the right
                    mLeft();
                }
                break;
            case 9:
                if(detect()==1){
                    mUp();
                }
                break;
            case 10:
                if(detect()==1){
                    mDown();
                }
                break;
            case 11:
                if(detect()==3){//If the wall is below
                    mLeft();
                }
                break;
            case 12:
                if(detect()==3){
                    mUp();
                }
                break;
            case 13:
                if(detect()==3){
                    mRight();
                }
                break;
            case 14:
                if(detect()==2){ //If the wall is to the left
                    mUp();
                }
                break;
            case 15:
                if(detect()==2){
                    mRight();
                }
                break;
            case 16:
                if(detect()==2){
                    mDown();
                }
                break;
            default: break;
        }

        }

    }
    
    public int getFitness(){
        return xPos+yPos;
    }

    private boolean winCheck() {
        return yPos == size - 2 && xPos == size - 2;
    }

    private void win() {
//        for (int i = 0; i < size-1; i++) {
//            for (int j = 0; j < size-1; j++) {
//                mazeArray[i][j] = 2;
//            }
//        }
        winCount++;
        winFlag = true;
        xPos=1;
        yPos=1;
    }

}
