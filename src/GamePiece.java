public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;


//    public GamePiece(int positionX, int positionY, boolean frozen, String name, String color){
//        this.positionX = positionX;
//        this.positionY = positionY;
//        this.frozen = frozen;
//        this.name = name;
//        this.color = color;
//    }

    public GamePiece(){
        positionX = 0;
        positionY = 0;
        frozen = false;
        this.name = name;
        this.color = color;

    }

    public int getpositionX() {
        return positionX;
    }    public int getPositionY(){
        return positionY;
    }
    public boolean getFrozen(){
        return true;
    }

//    public GamePiece{
//        this.name = name;
//        this.color = color;
//
//    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int move(){
        return getpositionX();
        return getPositionY();
    }

    public boolean freeze() {
        return getFrozen();
    }
    public boolean unfreeze(){
        this.frozen = false;
    }

    public int move(){
        if(freeze() == true){
            positionX = 0;
            positionY = 0;
        }
    }


}

class Runner{
    public static void main(String[] args){
        GamePiece.freeze();
        GamePiece.unfreeze;
        
    }
}
