package JavaOOPS;

public class Interface {

    public static void main(String[] args) {
//        Queen q = new Queen();
//        q.moves();
//        King k = new King();
//        k.moves();
//        Rook rook=new Rook();
//        rook.moves();

        Bear b = new Bear();
        b.eat();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}

interface Herbivore{
    abstract void eat();
}
interface Carnivore{
    abstract void eat();
}

class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Eats");
    }
}