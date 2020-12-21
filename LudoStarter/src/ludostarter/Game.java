/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludostarter;

import java.util.Scanner;

/**
 *
 * @author Dhono
 */
public class Game {

    private String player1;
    private String player2;
    private int dice1;
    private int dice2;
    private int scoreToWin;

    public void displayGameMenu() {
        System.out.println();
        System.out.println("(1) Start a new game ");
        System.out.println("(2) Play one round ");
        System.out.println("(3) Who is leading now? ");
        System.out.println("(4) Display game help ");
        System.out.println("(5) Exit game ");
        System.out.print("Choose an option: ");
    }

    public void selectGameOption(int optionSelected) {
        switch (optionSelected) {
            case 1:
                this.startNewgame();
                break;
            case 2:
                this.playOneRound(player1);
                this.playOneRound(player2);
                break;
            case 3:
                this.whoIsLeading();
                break;
            case 4:
                this.displayGameInstruction();
                break;
            default:
                break;

        }
    }
    
    public void startNewGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter player one name: ");
        String p1Name = sc.nextLine();
        System.out.println("Please enter player two name: ");
        String p2Name = sc.nextLine();
        System.out.println("Please enter the maximum score required to win: ");
        scoreToWin = sc.nextInt();
        
        player1 = new Player (p1Name);
        player2 = new Player (p2Name);
        
    }
    // suggested String p1Name = sc.nextLine();
    public void playOneRound(Player p){
        
    }

}
