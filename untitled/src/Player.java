public class Player {

    private String name;
    private Player opponent;

    public Player(String name) {
        this.name = name;
    }
    public void setOpponent(Player player) {
        this.opponent = player;
    }

    public void start(PlasticBall40mm ball) {
        this.smash(ball);
    }

    private void smash(PlasticBall40mm ball) {
        Console.write(this.name + " plays: ");
        ball.hit();
        this.opponent.incomming(ball);
    }

    public void incomming(PlasticBall40mm ball) {
        this.smash(ball);
    }
}
