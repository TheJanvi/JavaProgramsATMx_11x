package Ex_24_OOPs_Access_Modifiers.Police;

public class Cop {
    private int gun;
    String ICard;


// param con
    public Cop(int Bullet){
        this.gun = Bullet;

    }
// method / behavior
    protected void canIsShoot(){
        System.out.println("Yes you can shoot!");
    }
}
