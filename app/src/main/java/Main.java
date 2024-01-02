import jp.ac.uryukyu.ie.e235710.*;

public class Main {
    public static void main(String[] args){
        int rolenumber;
        var select_game = new Start();
        select_game.selectGame();
        

        var select_role = new Role();
        rolenumber = select_role.selectRole();
    }
}
