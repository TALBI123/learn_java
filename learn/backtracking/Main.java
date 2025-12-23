
import java.util.ArrayList;

import board.Board;

class Main {

    public static void main(String[] args) {

        // Board board = Board.getInstance(6);
        // Board board1 = Board.getInstance(3);
        // board.printBoard();
        // Animale an[] = new Animale[2];
        // an[0] = new Chien();
        // an[1] = new Chat();
        // for (Animale elem : an) {
        //     elem.parler();
        // }
        Animale chien =  new Chien();
        Animale chat = new Chat();
        parler(chien);
        parler(chat);
    }
    public static void parler(Animale animal){
        animal.parler();
    }
}

class Animale {

    // public
    int x = 6;

    Animale() {
        // this();
    }

    void parler() {
        System.out.println("skafanos");
    }
}

class Chien extends Animale {

    Chien() {

    }

    void parler() {
        System.out.println("slogiya haw");

    }
    void camera(){
        System.out.println("7day");
    }
}

class Chat extends Animale {

    Chat() {

    }

    void parler() {
        System.out.println("meow");

    }
    void sleep(){
        System.out.println("N3as");
    }
}

