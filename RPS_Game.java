import java.util.Scanner;
public class RPS_Game {
    
    public void RPS_Game(){
//Declaration and Initiation
        Scanner in=new Scanner(System.in);
        String rps[]={"rock","paper","scissors"};
        String PlayerMove;
        String ComputerMove;
        int RandInt0_2;
        String playAgain;
    while(true){
        RandInt0_2=(int)(Math.random()*(3));
        //Player Choice
        while(true){
        System.out.println("Please Choose (r , p or s)");
        PlayerMove=in.nextLine();
        if(PlayerMove.equals("r")||PlayerMove.equals("p")||PlayerMove.equals("s")){
            break;
        }
            System.out.println("-- "+PlayerMove+" Is Not A Move--");
        } 
        //convert
        if(PlayerMove.equals("r")){
        PlayerMove="rock";
        }else if(PlayerMove.equals("p")){
        PlayerMove="paper";
        }else if(PlayerMove.equals("s")){
        PlayerMove="scissors";
        }
        System.out.println("You Chose: "+PlayerMove);
        //Computer Move
        ComputerMove=rps[RandInt0_2];
        System.out.println("Computer Choose: "+ComputerMove);
        //Reasult
        if(PlayerMove.equals(ComputerMove)){
            System.out.println("It's Tie!");
        }
        else{
            if(PlayerMove.equals("rock")){
                if(ComputerMove.equals("paper")){
                    System.out.println("You Lose!");
                }
                else{System.out.println("You Win!!");}
            }
            if(PlayerMove.equals("paper")){
                if(ComputerMove.equals("scissors")){
                    System.out.println("You Lose!");
                }
                else{System.out.println("You Win!!");}
            }
            if(PlayerMove.equals("scissors")){
                if(ComputerMove.equals("rock")){
                    System.out.println("You Lose!");
                }
                else{System.out.println("You Win!!");}
            }
            }
        System.out.println("==enter (y) to Play Again (n) to exit==");
        playAgain=in.nextLine();
        if(!playAgain.equals("y")){
        break;
        }
    }
    }
}
