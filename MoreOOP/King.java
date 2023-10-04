
import java.util.Random;

public class King {

    public King() {
        super();
        Random rand = new Random();
        this.power = rand.nextInt(10) + 5;
        this.hp = rand.nextInt(10) + 5;
    }

    void kick(Character c) {
        c.hp -= rand.nextInt(this.power);
    }
}
