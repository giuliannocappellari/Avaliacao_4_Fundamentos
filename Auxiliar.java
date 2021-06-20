import java.util.Scanner;

/**
 * A classe {@code Auxiliar} tem como finalidade guardar os métodos do jogo cara.
 *<p> @author Giuliano Souto Jardim Barbosa 
 *<p> @date 19/06/2021
 */

public class Auxiliar
{
    /**
     * O método {@code getLine} tem como finalidade printar uma linha na tela.
     */

    public static void getLine(){
        System.out.println("---------------------------------------------------------------------------");
    }

    /**
     * O método {@code rafael} tem como finalidade criar um vetor de 6 colunas com as caracteristicas do personagem.
     * <p> @return retorna o vetor criado
     */

    public static String[] rafael(){
        String[] rafael = new String[6];
        rafael[0] = "Man";
        rafael[1] = "White";
        rafael[2] = "Black";
        rafael[3] = "Brown";
        rafael[4] = "Rafael";
        rafael[5] = "Short";
        return rafael;
    }

    /**
     * O método {@code xiomara} tem como finalidade criar um vetor de 6 colunas com as caracteristicas do personagem.
     * <p> @return retorna o vetor criado
     */
    public static String[] xiomara(){
        String[] xiomara = new String[6];
        xiomara[0] = "Woman";
        xiomara[1] = "Brown";
        xiomara[2] = "Brown";
        xiomara[3] = "Brown";
        xiomara[4] = "Xiomara";
        xiomara[5] = "Long";
        return xiomara;
    }
    
    /**
     * O método {@code jane} tem como finalidade criar um vetor de 6 colunas com as caracteristicas do personagem.
     * <p> @return retorna o vetor criado
     */
    public static String[] jane(){
        String[] jane = new String[6];
        jane[0] = "Woman";
        jane[1] = "Brown";
        jane[2] = "Black";
        jane[3] = "Brown";
        jane[4] = "Jane";
        jane[5] = "Medium";
        return jane;
    }
    
    /**
     * O método {@code rogelio} tem como finalidade criar um vetor de 6 colunas com as caracteristicas do personagem.
     * <p> @return retorna o vetor criado
     */
    public static String[] rogelio(){
        String[] rogelio = new String[6];
        rogelio[0] = "Man";
        rogelio[1] = "White";
        rogelio[2] = "Gray";
        rogelio[3] = "Brown";
        rogelio[4] = "Rogelio";
        rogelio[5] = "Short";
        return rogelio;
    }
    
    /**
     * O método {@code init} tem como finalidade criar uma matriz[6][4] que armazenará os personagens e suas características 
     * <p> @return retorna a matriz criada
     */
    public static String[][] init(){
        String[][] board = new String[6][4];
        for (int i = 0; i < 6; i += 1){
            board [i][0] = rafael()[i];
            board [i][1] = xiomara()[i];
            board [i][2] = jane()[i];
            board [i][3] = rogelio()[i];
        } 
        return board;
    }
    
    /**
     * O método {@code getPlayer1} tem como finalidade criar uma matriz[6][4] que será o tabuleiro do jogador 1.
     * <p> @return retorna a matriz criada
     */
    public static void getPlayer1(String[][] player1){
        getLine();
        for (int j = 0; j < 4; j += 1){
            System.out.print(player1[4][j] + " -> ");
            for (int i = 0; i < 6; i += 1){
                System.out.print(player1[i][j] + " ");
            }
            System.out.println(" ");
        }
        getLine();
    }
    
    /**
     * O método {@code getPlayer2} tem como finalidade criar uma matriz[6][4] que será o tabuleiro do jogador 2.
     * <p> @return retorna a matriz criada
     */
    public static void getPlayer2(String[][] player2){
        getLine();
        for (int j = 0; j < 4; j += 1){        
            System.out.print(player2[4][j] + " -> ");
            for (int i = 0; i < 6; i += 1){
                System.out.print(player2[i][j] + " ");
            }
            System.out.println(" ");
        }
        getLine();
    }
    
    /**
     * O método {@code startMenu} tem como finalidade exibir um menu inicial e ler a opção digitada pelo usuário.
     * <p> @return retorna um inteiro digitado pelo usuário.
     */
    public static int startMenu(){
        int userOption;
        Scanner entrada;
        System.out.println("  FACE TO FACE");
        System.out.println(" ----------------");
        System.out.println("|1) Start        |");
        System.out.println("|----------------|");
        System.out.println("|2) End Game     |");
        System.out.println("|----------------|");
        System.out.println("|3) Instructions |");
        System.out.println(" ----------------");
        entrada = new Scanner(System.in);
        userOption = entrada.nextInt();
        entrada.close();
        return userOption;
    }
    
    /**
     * O método {@code chooseCharacter} tem como finalidade randomizar um número inteiro de 0 a 4.
     * <p> @return retorna o inteiro randomizado.
     */
    public static int chooseCharacter(){
        int choose =  (int) (Math.random() * 4);
        return choose;
    }
    
    /**
     * O método {@code whatIsTheCharacter} tem como finalidade retornar o nome do personagem randomizado.
     * <p> @return retorna o nome do personagem randomizado.
     */
    public static String whatIsTheCharacter(int character){
        String characterName = "";
        switch (character) {
            case 0:
            characterName = "Rafael";
            break;
            case 1:
            characterName = "Xiomara";
            break;
            case 2:
            characterName = "Jane";
            break;
            case 3:
            characterName = "Rogelio";
            break;
        }
        return characterName;
    }
    
    /**
     * O método {@code play} tem como finalidade exibir na tela as opções de jogada, e receber um inteiro digitado pelo usuário.
     * <p> @return retorna o inteiro digitado pelo usuário.
     */
    public static int play(){
        //0 = sexo, 1=cor da pele, 2=cabelo_claro, 3=olho_claro, 4=nome, 5=cabelo_curto 
        boolean isValid;
        int played;
        do{
            Scanner entrada;
            System.out.println("                               Options");
            getLine();
            System.out.println("|1) Gender:           |11-> Man    |12-> Woman   |           |             |");
            System.out.println("|2) Ethnicity:        |21-> White  |22-> Brown   |           |             |");
            System.out.println("|3) Hair color:       |31-> Gray   |32-> Brown   |33-> Black |             |");
            System.out.println("|4) Eye color:        |41-> Brown  |42-> Blue    |           |             |");
            System.out.println("|5) Name:             |00-> Rafael |01-> Xiomara |02-> Jane  |03-> Rogelio |");
            System.out.println("|6) Hair style:       |61-> Short  |62-> Medium  |63-> Long  |             |");
            getLine();
            System.out.println("Please choose one option: ");
            entrada = new Scanner(System.in);
            played = entrada.nextInt();
            isValid = verifyPlayed(played);
            if (isValid == false){System.out.println("Please type a valid value!");
            getLine();}
        } while (isValid == false);
        return  played;
    }
    
    /**
     * O método {@code verifyPlayed} tem como finalidade verificar se a jogada feita bate com algum valor presente na matrize.
     * <p> @return retorna um valor booleano
     */
    public static boolean verifyPlayed(int played){
        boolean isValid = false;
        switch (played){
            case 0:
            isValid = true;
            break;
            case 1:
            isValid = true; 
            break;
            case 2:
            isValid = true;
            break;
            case 3:
            isValid = true;
            break;
            case 11:
            isValid = true;
            break;
            case 12:
            isValid = true;
            break;
            case 21:
            isValid = true;
            break;
            case 22:
            isValid = true;
            break;
            case 31:
            isValid = true;
            break;
            case 32:
            isValid = true;
            break;
            case 33:
            isValid = true;
            break;
            case 61:
            isValid = true;
            break;
            case 62:
            isValid = true;
            break;
            case 63:
            isValid = true;
        }
        return isValid;
    }
    
    /**
     * O método {@code instructions} tem como finalidade exiir as intruções do jogo.
     */
    public static void instructions(){
        System.out.println("Welcome to Face-To-Face");
        System.out.println("This is one game made for two people");
        System.out.println("You and your adversary are gonna be one character");
        System.out.println("And both of you will need to guess your adversary's character");
        System.out.println("To make it, on your turn, you'll need to type a valid number");
        System.out.println("This number act as one character characteristic");
        System.out.println("If it match with your adversary's character");
        System.out.println("The character transforms to a 'X'");
        System.out.println("You can take a shot the character's name with the corresponding number");
        System.out.println("If your kick is right you win the game");
        System.out.println("If your kick is wrong you lose the game");
        System.out.println("Good luck!");
    }

    /**
     * O método {@code verify} tem como finalidade verificar se o valor digitado pelo usuário é uma caracteristica de algum personagem.
     * <p> @return retorna um valor booleano
     */
    public static boolean verify(int alternative, int character){
        boolean answer = false;
        switch (alternative) {
            case 0:
            if(character == 0){answer = true;}
            else{answer = false;}
            break;
            case 1:
            if(character == 1){answer = true;}
            else{answer = false;}
            break;
            case 2:
            if(character == 2){answer = true;}
            else{answer = false;}
            break;
            case 3:
            if(character == 3){answer = true;}
            else{answer = false;}
            break;
            case 11:
            if(character == 0 || character == 3)
            {
                answer = true;
            }
            else
            {answer = false;}
            break;
            case 12:
            if(character == 1 || character == 2)
            {
                answer = true;
            }
            else
            {answer = false;}
            break;
            case 21:
            if(character == 0 || character == 3)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 22:
            if(character == 1 || character == 2)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 31:
            if(character == 3)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 32:
            if((character == 1))
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 33:
            if(character == 0 || character == 2)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 61:
            if(character == 0 || character == 3)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 62:
            if(character == 2)
            {
                answer = true;
            }
            else{answer = false;}
            break;
            case 63:
            if(character == 1)
            {
                answer = true;
            }
            else{answer = false;}
        }
        return answer;
    } 

    /**
     * O método {@code setPlayer1} tem como finalidade editar uma matriz[6][4] que será o tabuleiro do jogador 1.
     * <p> @return retorna a matriz editada
     */
    public static String[][] setPlayer1(String[][] player1, int param, int character){
        boolean answer;
        answer = verify(param, character);
        switch (param) {
            case 0:
            if (answer == true){System.out.println("You won the character was Rafael");}
            else{}
            break;
            case 1:
            if (answer == true){System.out.println("You won the character was Xiomara");}
            else{}
            break;
            case 2:
            if (answer == true){System.out.println("You won the character was Jane");}
            else{}
            break;
            case 3:
            if (answer == true){System.out.println("You won the character was Rogelio");}
            else{}
            break;
            case 11:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            break;
            case 12:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
            case 21:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            break;
            case 22:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
            case 31:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            break;
            case 32:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][2] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
            case 33:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
            case 41:
            break;
            case 42:
            break;
            case 61:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
                }
            }
            break;
            case 62:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][1] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
            case 63:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player1 [i][1] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player1 [i][0] = "X";
                    player1 [i][2] = "X";
                    player1 [i][3] = "X";
                }
            }
            break;
        }
        return player1;
    }

    /**
     * O método {@code setPlayer2} tem como finalidade editar uma matriz[6][4] que será o tabuleiro do jogador 2.
     * <p> @return retorna a matriz editada
     */
    
    public static String[][] setPlayer2(String[][] player2, int param, int character){
        boolean answer;
        answer = verify(param, character);
        switch (param) {
            case 0:
            if (answer == true){System.out.println("You won the character was Rafael");}
            else{}
            break;
            case 1:
            if (answer == true){System.out.println("You won the character was Xiomara");}
            else{}
            break;
            case 2:
            if (answer == true){System.out.println("You won the character was Jane");}
            else{}
            break;
            case 3:
            if (answer == true){System.out.println("You won the character was Rogelio");}
            else{}
            break;
            case 11:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            break;
            case 12:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][3] = "X";
                }
            }
            break;
            case 21:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            break;
            case 22:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            break;
            case 31:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            break;
            case 32:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][2] = "X";
                    player2 [i][3] = "X";
                }
            }
            break;
            case 33:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][3] = "X";
                }
            }
            break;
            case 41:
            break;
            case 42:
            break;
            case 61:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][3] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                    player2 [i][2] = "X";
                }
            }
            break;
            case 62:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][2] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][1] = "X";
                    player2 [i][3] = "X";
                }
            }
            break;
            case 63:
            if (answer == false){
                for (int i = 0; i < 6; i += 1){
                    player2 [i][1] = "X";
                }
            }
            else{
                for (int i = 0; i < 6; i += 1){
                    player2 [i][0] = "X";
                    player2 [i][2] = "X";
                    player2 [i][3] = "X";
                }
            }
            break;
        }
        return player2;
    }
}