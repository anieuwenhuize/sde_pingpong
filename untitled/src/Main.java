public class Main {
    public static void main(String[] args) {

        Console.write("( •_•)O*¯`·.¸.·´¯`°Q(•_• )");

        try {

            // Here, we have a player class and a ball.
            Player player1 = new Player("Ping");
            Player player2 = new Player("Pong");

            PlasticBall40mm ball = new PlasticBall40mm();

            // The game needs two players who face each other.
            // Good luck!
            player2.setOpponent(player1);
            player1.setOpponent(player2);
            
            player1.start(ball);

        }catch (StackOverflowError ex) {
            Console.write("Game over");
        }

    }
}