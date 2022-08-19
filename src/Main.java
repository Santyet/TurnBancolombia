import java.util.Scanner;

public class Main {

    private Scanner sc;
    private static TurnCL turns;

    public Main() {

        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Main m = new Main();
        turns = new TurnCL();

        int option = 0;
        do{
            option = m.showMenu();
            m.executeOperation(option);

        }while (option!=5);

    }

    public void executeOperation(int operation) {

        switch (operation) {

            case 1:
                turns.addLast();
                break;

            case 2:
                turns.print();
                break;

            case 3:
                turns.printR();
                break;

            case 4:
                turns.delete();
                break;

            case 5:
                System.out.println("Bye!");
                break;

            default:
                System.out.println("Please type a valid option.\n");
                break;
        }
    }

    public int showMenu() {

        int option=0;

        System.out.println(
                "\nPlease select an option:\n" +
                        "(1) To give a turn.\n" +
                        "(2) To show the actual turn.\n" +
                        "(3) To pass turn.\n" +
                        "(4) To delete actual turn and continue.\n" +
                        "(5) To exit.\n");
        option= Integer.parseInt(sc.nextLine());
        return option;
    }
}
