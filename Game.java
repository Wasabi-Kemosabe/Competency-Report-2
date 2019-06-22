import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        Character mario = new Character("(M)", 100, 20, 30);
        Character toad = new Character("=D", 200, 30, 50);
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Select 1 for Mario or 2 for Toad");
        System.out.println("Select an option: ");
        int op = sc.nextInt();

        switch (op) {
        case 1:
            mario.printing();
            System.out.println("Attack times: ");
            int x = sc1.nextInt();
            for (int i = 0; i < x; i++) {
                mario.attack(toad);
            }
            break;
        case 2:
            toad.printing();
            System.out.println("Attack times: ");
            int y = sc1.nextInt();
            for (int i = 0; i < y; i++) {
                toad.attack(mario);
            }
            break;
        }

        // mario.attack(toad);

        if (mario.getLifePoints() <= 0) {
            mario.die();
        }
    }
}