import java.util.Random;

public class GamePiece {
    int positionX;
    int positionY;
    String name;
    String color;
    int minX;
    int maxX;
    int minY;
    int maxY;
    boolean frozen;



    public GamePiece(){
        this.positionX = 0;
        this.positionY = 0;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 500;
        this.frozen = false;
    }

    public GamePiece(String name, String color){
        this.positionX = 0;
        this.positionY = 0;
        this.minX = 0;
        this.maxX = 100;
        this.minY = 0;
        this.maxY = 500;
        this.frozen = false;
        this.name = name;
        this.color = color;

    }

    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getPositionX() {
        return this.positionX;
    }
    public int getPositionY(){
        return this.positionY;
    }
    public boolean isFrozen(){
        return this.frozen;
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
        if(!this.isFrozen()){
            this.positionX = positionX;
            this.positionY = positionY;
        }
        this.positionX = newX;
        this.positionY = newY;
        System.out.println("Moved");

        if(getMaxX() <= 100){

        } else {

        }
        if (getMaxY() <= 500){

        }

    }
//
    public void freeze() {
        this.frozen = true;
        System.out.println("Gamepiece is frozen");
    }
    public void unfreeze(){
        this.frozen = false;
        System.out.println("Gamepiece is unfrozen");
    }

}


class Runner{
    public static void main(String[] args){
     Random random = new Random();

        GamePiece gamePiece = new GamePiece();

        gamePiece.move(random.nextInt(),random.nextInt());
        System.out.println("X is at " + gamePiece.getPositionX());
        System.out.println("Y is at the expected position " + gamePiece.getPositionX());
        gamePiece.freeze();
        if(gamePiece.isFrozen() == true){

            System.out.println("game piece is FROZEN!! & cannot move");
        }
        gamePiece.move(random.nextInt(),random.nextInt());
        System.out.println();

        gamePiece.unfreeze();
        if(gamePiece.isFrozen() == false){
            System.out.println("Game piece is NOT frozen");
        }

    }
}
