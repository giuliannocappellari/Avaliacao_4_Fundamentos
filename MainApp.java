import java.util.Scanner;

/**
 * Escreva a descrição da classe Main aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
//0 = sexo, 1=cor da pele, 2=cabelo_claro, 3=olho_claro, 4=nome, 5=cabelo_curto 
public class MainApp
{
    public static String[] rafael(){
        String[] rafael = new String[6];
        rafael[0] = "homem";
        rafael[1] = "branco";
        rafael[2] = "preto";
        rafael[3] = "castanho";
        rafael[4] = "rafael";
        rafael[5] = "curto";
        return rafael;
    }

    public static String[] xiomara(){
        String[] xiomara = new String[6];
        xiomara[0] = "mulher";
        xiomara[1] = "parda";
        xiomara[2] = "castanho";
        xiomara[3] = "castanho";
        xiomara[4] = "xiomara";
        xiomara[5] = "longo";
        return xiomara;
    }

    public static String[] jane(){
        String[] jane = new String[6];
        jane[0] = "mulher";
        jane[1] = "parda";
        jane[2] = "preto";
        jane[3] = "castanho";
        jane[4] = "jane";
        jane[5] = "medio";
        return jane;
    }

    public static String[] rogelio(){
        String[] rogelio = new String[6];
        rogelio[0] = "homem";
        rogelio[1] = "branco";
        rogelio[2] = "grizalho";
        rogelio[3] = "castanho";
        rogelio[4] = "rogelio";
        rogelio[5] = "curto";
        return rogelio;
    }

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

    public static void getPlayer1(String[][] player1){
        for (int j = 0; j < 4; j += 1){        
            for (int i = 0; i < 6; i += 1){
                System.out.print(player1[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void getPlayer2(String[][] player2){
        for (int j = 0; j < 4; j += 1){        
            for (int i = 0; i < 6; i += 1){
                System.out.print(player2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int startMenu(){
        int userOption;
        Scanner entrada;
        System.out.println("1) Start");
        System.out.println("2) Instructions");
        System.out.println("3) End Game");
        entrada = new Scanner(System.in);
        userOption = entrada.nextInt();
        entrada.close();
        return userOption;
    }

    public static int chooseCharacter(){
        int choose =  (int) (Math.random() * 4);
        switch (choose) {
            case 0:
            System.out.println("Your character is Rafael");
            break;
            case 1:
            System.out.println("Your character is Xiomara");
            break;
            case 2:
            System.out.println("Your character is Jane");
            break;
            case 3:
            System.out.println("Your character is Rogelio");
            break;
        }
        return choose;
    }

    public static int play(){
        //0 = sexo, 1=cor da pele, 2=cabelo_claro, 3=olho_claro, 4=nome, 5=cabelo_curto 
        Scanner entrada;
        System.out.println("1) Sexo: 11-> Homem 12-> Mulher");
        System.out.println("2) Cor da pele: 21-> Branco 22-> Pardo");
        System.out.println("3) Cor do cabelo: 31-> Grizalho 32-> Castanho 33-> Preto");
        System.out.println("4) Cor do Olho: 41-> Castanho 42-> Azuis");
        System.out.println("5) Nome: 0-> Rafael 1-> Xiomara 2-> Jane 3-> Rogelio");
        System.out.println("6) Comprimento do cabelo: 61-> Curto 62-> Médio 63-> Longo");
        entrada = new Scanner(System.in);
        int played = entrada.nextInt(); 
        return  played;
    }
    
    public static boolean verify(int alternative, int character){
        boolean answer = false;
        switch (alternative) {
            case 0:
            System.out.println("Your character is Rafael");
            break;
            case 1:
            System.out.println("Your character is Xiomara");
            break;
            case 2:
            System.out.println("Your character is Jane");
            break;
            case 3:
            System.out.println("Your character is Rogelio");
            break;
            case 11:
            if(character == 0 || character == 3)
            {
                answer = true;
            }
            else
            {answer = false;}
            case 12:
            if(character == 1 || character == 2)
            {
                answer = true;
            }
            else{answer = false;}
            case 21:
            if((character == 0) || (character == 3))
            {
                answer = true;
            }
            else{answer = false;}
            case 22:
            if((character == 1) || (character == 2))
            {
                answer = true;
            }
            else{answer = false;}
            case 31:
            if(character == 3)
            {
                answer = true;
            }
            else{answer = false;}
            case 32:
            if((character == 1))
            {
                answer = true;
            }
            else{answer = false;}
            case 33:
            if((character == 0) || (character == 2))
            {
                answer = true;
            }
            else{answer = false;}
            case 61:
            if((character == 0) || (character == 3))
            {
                answer = true;
            }
            else{answer = false;}
            case 62:
            if((character == 2))
            {
                answer = true;
            }
            else{answer = false;}
            case 63:
            if((character == 1))
            {
                answer = true;
            }
            else{answer = false;}
        }
        return answer;
    } 

    public static String[][] setPlayer1(String[][] player1, int param, int character){
        boolean answer;
        answer = verify(param, character);
        switch (param) {
            case 0:
            System.out.println("Your character is Rafael");
            break;
            case 1:
            System.out.println("Your character is Xiomara");
            break;
            case 2:
            System.out.println("Your character is Jane");
            break;
            case 3:
            System.out.println("Your character is Rogelio");
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
                    player1 [i][1] = "X";
                    player1 [i][2] = "X";
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

    public static void main(String[] args){
        int userOption, player1Character, player2Character, conter, play;
        conter = 1;
        userOption = startMenu();
        //while (userOption == 1){         
        String[][] player1;
        String[][] player2;
        player1 = init();
        player2 = init();
        player1Character = chooseCharacter();
        player2Character = chooseCharacter();
        do{
            if (conter % 2 == 1){ 
                getPlayer1(player1);
                play = play();
                player1 = setPlayer1(player1, play, player1Character);
                getPlayer1(player1);
                conter += 1;
            }
            else{
                getPlayer2(player2);
                play = play();
                conter += 1;
            }
            //    userOption = startMenu();
            //}
        }while ((play != 0) && (play != 1) && (play != 2) && (play!= 3));
    }
}
