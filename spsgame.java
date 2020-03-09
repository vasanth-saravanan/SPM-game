import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class spsgame {
    public static void main(String args[]){
        String player1,player2,p1choise,p2choise;
        int p1won=0,p2won=0,tie=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to SPS Game");
        System.out.println("-------------------");
        System.out.println("Rules : Only 2 players can play this game");

        System.out.println("Enter the Name of player 1 : ");
        player1 = input.next();
        System.out.println("All the best "+player1);

        System.out.println("Enter the Name of player 2 : ");
        player2 = input.next();
        System.out.println("All the best "+player2);

        System.out.println("How many matches do you want? :");
        int rounds = input.nextInt();
        System.out.println("let's go...");


        int n = 0;
        while(n < rounds){
            n++;
            System.out.println(player1+", Enter any one from (stone,paper,scissor) : ");
            p1choise = input.next();

            if(p1choise.equals("stone")  || p1choise.equals("paper") || p1choise.equals("scissor")){
                for (int i=0;i<100;i++){
                    System.out.println();
                }
            }
            else {
                System.out.println("you entered out of these three words => stone,paper,scissor");
                System.out.println("This is your last chance,Please enter any one from (stone,paper,scissor)");
                p1choise = input.next();
                if(p1choise.equals("stone")  || p1choise.equals("paper") || p1choise.equals("scissor")){
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                }else {
                    n = rounds+1;
                    System.out.println(player1+", you entered invalid data,you have lost your chance,so THE OVER ALL CHAMPION IS "+ player2 );
                    if(n==rounds+1){
                        break;
                    }
                }
            }

            System.out.println(player2+", Enter any one from (stone,paper,scissor) : ");
            p2choise = input.next();
            if(p2choise.equals("stone")  || p2choise.equals("paper") || p2choise.equals("scissor")){
                if(p1choise.equals("stone") && p2choise.equals("scissor")){
                    System.out.println(player1 +" Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p1won++;
                }
                else if(p1choise.equals("stone") && p2choise.equals("paper")){
                    System.out.println(player2 + " Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p2won++;
                }
                else if(p1choise.equals("paper") && p2choise.equals("stone")){
                    System.out.println(player1 + " Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p1won++;
                }
                else if(p1choise.equals("paper") && p2choise.equals("scissor")){
                    System.out.println(player2 + " Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p2won++;
                }
                else if(p1choise.equals("scissor") && p2choise.equals("paper")){
                    System.out.println(player1 + " Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p1won++;
                }
                else if(p1choise.equals("scissor") && p2choise.equals("stone")){
                    System.out.println(player2 + " Won the match");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    p2won++;
                }
                else if(p1choise.equals(p2choise)){
                    System.out.println("Match Tie");
                    System.out.println();
                    System.out.println("------------------------------------------------");
                    tie++;
                }

            }
            else {
                System.out.println("you entered out of these three words => stone,paper,scissor");
                System.out.println("This is your last chance,Please enter any one from (stone,paper,scissor)");
                p2choise = input.next();
                if(p2choise.equals("stone")  || p2choise.equals("paper") || p2choise.equals("scissor")){
                    if(p1choise.equals("stone") && p2choise.equals("scissor")){
                        System.out.println(player1 +" Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p1won++;
                    }
                    else if(p1choise.equals("stone") && p2choise.equals("paper")){
                        System.out.println(player2 + " Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p2won++;
                    }
                    else if(p1choise.equals("paper") && p2choise.equals("stone")){
                        System.out.println(player1 + " Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p1won++;
                    }
                    else if(p1choise.equals("paper") && p2choise.equals("scissor")){
                        System.out.println(player2 + " Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p2won++;
                    }
                    else if(p1choise.equals("scissor") && p2choise.equals("paper")){
                        System.out.println(player1 + " Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p1won++;
                    }
                    else if(p1choise.equals("scissor") && p2choise.equals("stone")){
                        System.out.println(player2 + " Won the match");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        p2won++;
                    }
                    else if(p1choise.equals(p2choise)){
                        System.out.println("Match Tie");
                        System.out.println();
                        System.out.println("------------------------------------------------");
                        tie++;
                    }

                }else {
                    n = rounds+1;
                    System.out.println(player2+", you entered invalid data,you have lost your chance,so THE OVER ALL CHAMPION IS "+ player1 );
                    if(n==rounds+1){
                        break;
                    }
                }
            }


        }
        if(n==rounds){
            if(p1won > p2won){
                System.out.println("Number of Total matches : "+ rounds);
                System.out.println(player1 + " won "+p1won+" out of "+rounds+ " matches");
                System.out.println(player2 + " won "+p2won+" out of "+rounds+ " matches");
                System.out.println("Number of Tie matches : "+ tie);
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("THE OVER ALL CHAMPION IS "+player1);
                System.out.println("----------------------------------");
                System.out.println("Better luck next time, "+player2);
            }
            else if(p1won < p2won){
                System.out.println("Number of Total matches : "+ rounds);
                System.out.println(player1 + " won "+p1won+" out of "+rounds+ " matches");
                System.out.println(player2 + " won "+p2won+" out of "+rounds+ " matches");
                System.out.println("Number of Tie matches : "+ tie);
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("THE OVER ALL CHAMPION IS "+player2);
                System.out.println("----------------------------------");
                System.out.println("Better luck next time, "+player1);
            }
            else {
                System.out.println("Number of Total matches : "+ rounds);
                System.out.println(player1 + " won "+p1won+" out of "+rounds+ " matches");
                System.out.println(player2 + " won "+p2won+" out of "+rounds+ " matches");
                System.out.println("Number of Tie matches : "+ tie);
                System.out.println();
                System.out.println("----------------------------------");
                System.out.println("MATCH TIE");
                System.out.println("----------------------------------");
                System.out.println("Ok cool... "+player1+" and "+player2+", be ready for next match...");
            }


        }

    }
}
