//import java.util.Scanner;

/**
 * A classe {@code MainApp} tem como finalidade executar o jogo cara.
 * 
 *<p> @author Giuliano Souto Jardim Barbosa 
 *<p> @date 19/06/2021
 *<p> @param args define um array de String para caso o programa precise receber algum valor como argumento.

 */
//0 = sexo, 1=cor da pele, 2=cabelo_claro, 3=olho_claro, 4=nome, 5=cabelo_curto 
public class MainApp extends Auxiliar
{
    public static void main(String[] args){
        int userOption, player1Character, player2Character, conter, play, character;
        boolean answer;
        do{
            userOption = startMenu();
            if (userOption == 3){instructions();}
            else if(userOption == 1){       
                conter = 1;
                String[][] player1;
                String[][] player2;
                player1 = init();
                player2 = init();
                player1Character = chooseCharacter();
                player2Character = chooseCharacter();
                do{
                    if (conter % 2 == 1){ 
                        System.out.println("Player 1");
                        getPlayer1(player1);
                        play = play();
                        player1 = setPlayer1(player1, play, player2Character);
                    }
                    else{
                        System.out.println("Player 2");
                        getPlayer2(player2);
                        play = play();
                        player2 = setPlayer2(player2, play, player1Character);
                    }
                    conter += 1;
                    //    userOption = startMenu();
                    //}
                }while ((play != 0) && (play != 1) && (play != 2) && (play!= 3));
                if (conter % 2 == 1){character = player1Character;}
                else{character = player2Character;}
                answer = verify(play, character);
                if(answer == true){
                    if ((conter - 1) % 2 == 1){System.out.println("The winner was player 1!");}
                    else{System.out.println("The winner was player 2!");}
                    userOption = startMenu();}
                else{System.out.println("You loose the character was "+ whatIsTheCharacter(character));}
                userOption = startMenu(); 
            }
            else if(userOption == 2){
                break;}
            else{System.out.println("Please type a valid value!");}
        }while(userOption != 2);
        if(userOption == 2){
                System.out.println("Ending Game, thanks for playing!");}
    }
}
