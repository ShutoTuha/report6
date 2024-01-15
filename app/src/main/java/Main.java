import jp.ac.uryukyu.ie.e235710.*;

public class Main {
    public static void main(String[] args){
        int rolenumber;
        var select_game = new Start();
        var select_role = new Role();
        var player = new Card();


        select_game.selectGame();
        rolenumber = select_role.selectRole();
        player.show_restcard(rolenumber);
    }
}
