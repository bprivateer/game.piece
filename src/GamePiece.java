public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;


    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.name = name;
        this.color = color;

    }
//    public int move(){
//        if(freeze() == true){
//            positionX = 0;
//            positionY = 0;
//        }
//    }


    public int getpositionX() {
        return positionX;
    }
    public int getPositionY(){
        return positionY;
    }
    public boolean isFrozen(){
        return true;
    }


    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }


    public void move(int newX, int newY){

    }
//
    public void freeze() {
        this.frozen = true;
    }
    public void unfreeze(){
        this.frozen = false;
    }



}

class Runner{
    public static void main(String[] args){


        GamePiece gamePiece = new GamePiece();

        gamePiece.move(2,9);
        if(gamePiece.positionX == 2) {
            System.out.println("X is at 2!");
        } else {
            System.out.println("X is not at 2 as expected. Instead it is at " + gamePiece.positionX);
        }
        if(gamePiece.positionY ==9){
            System.out.println("Y is at the expected position of 9");
        } else {
            System.out.println("Position is ot at expected output " + gamePiece.positionY);
        }
        gamePiece.freeze();
        if(gamePiece.frozen == true){
            System.out.println("game piece is FROZEN!!");
        }
        gamePiece.unfreeze();
        if(gamePiece.frozen == false){
            System.out.println("Game piece is NOT frozen");
        }

    }
}
