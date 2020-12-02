package crapsrevised;
public class CrapsRevised {

//--------------------------------------------------DICE FUNCTIONS----------------------------------------------- 

    //Dice 1 rolling
    public static int die1(){   
        int d1 = (int)(Math.random()*6) + 1;
        return d1;
    }        
    
    //Dice 2 rolling
    public static int die2(){ 
        int d2 = (int)(Math.random()*6) + 1;
        return d2;
    }
    
//--------------------------------------------------GAME SIMULATION FUNCTIONS----------------------------------------------- 

    //print first 10 rounds in detail
    public static int[] DetailGames(){
        
        //declare/initialize
        int point;
        int roundNum = 1;
        int wins = 0;
        int losses = 0;
        String outcome;
        
        for(int i = 0; i < 10; i++){
        
        //initial roll
        int d1 = die1();
        int d2 = die2();
        int sum = d1 + d2;
        int rollNum = 1;
        
        switch (sum){
            //First roll is a win
            case 7: case 11:
                wins++;
                outcome = "WIN!";
                //round info
                printRoundInfo(roundNum, rollNum, d1, d2, sum);
                //outcome and totals
                printOutcomeInfo(wins, losses, outcome);
                break;
                
            //first roll is a loss
            case 2: case 3: case 12:
                losses++;
                outcome = "LOSS!";
                //round info
                printRoundInfo(roundNum, rollNum, d1, d2, sum);
                //outcome and totals
                printOutcomeInfo(wins, losses, outcome);
                break;
             
            //no win or loss - more rounds
            default:
                //print round info with point set
                printRoundInfo(roundNum, rollNum, d1, d2, sum);
                point = sum;
                System.out.println("Point is " + point);
                    
                    //loop - no win/loss
                    do{
                        //increases rollnum before next roll
                        rollNum++;
                        
                        //dice roll
			d1 = die1(); 
                        d2 = die2();
                        sum = d1 + d2; 
                        
                        //PRINT
                        printRoundInfo(roundNum, rollNum, d1, d2, sum);
                     
                    } while (sum != 7 && sum != point);
                    
                        //winning roll
			if (sum == point){
                            wins++;
                            outcome = "WIN!";
                            printOutcomeInfo(wins, losses, outcome);
                        }   
                        //losing roll
			else{    
                            losses++;
                            outcome = "LOSS!";
                            printOutcomeInfo(wins, losses, outcome);   
                        }   
            }
            //Round ends - new round  
            roundNum++; 
        }
        //return all game info to pas to next function
        int gameInfo[] = {wins, losses};
        return gameInfo;
    }
    
    public static void RemainingGames(int gameInfo[]){
        
        //declare/initialize
        int point;
        int wins = gameInfo[0];
        int losses = gameInfo[1];
        
        for(int i = 0; i < 99990; i++){
        
            //initial roll
            int d1 = die1();
            int d2 = die2();
            int sum = d1 + d2;

            switch (sum){

                //first roll is a loss
                case 7: case 11:
                    wins++;
                    break;

                //first roll is a win
                case 2: case 3: case 12:
                    losses++;
                    break;

                //MORE ROLLS
                default:
                    point = sum;
                    //loop - no win/loss
                    do{
                        //dice roll
                        d1 = die1(); 
                        d2 = die2();
                        sum = d1 + d2; 

                    } while (sum != 7 && sum != point);

                    //winning roll
                    if (sum == point) { wins++; }     

                    //losing roll
                    else { losses++; }
            }           
        }
        
        //FINAL PRINT
        System.out.println();
        System.out.println("OVERALL: ");
        System.out.println(wins + " win(s) , " + losses + " loss(es)");
    
    }

//--------------------------------------------------PRINTING FUNCTIONS----------------------------------------------- 

//Print round info when round has ended
    public static void printRoundInfo(int roundNum, int rollNum, int d1, int d2, int sum){
        System.out.println("Round " + roundNum + " ," + " Roll " + rollNum + " -- " +  
                              "Die 1: " + d1 + " , Die 2: " + d2 + " -- Total: " + sum);
    }
//Print OUTCOME when game has ended
    public static void printOutcomeInfo(int wins, int losses, String outcome){
        System.out.println(outcome + "\n" + wins + " win(s) , " + losses + " loss(es)" + "\n" + 
                "\n" + "-------------------------------------------------------------------------------" + "\n");
    }
    
//--------------------------------------------------------MAIN----------------------------------------------------------------
    
    public static void main(String[] args) {
        
        //First 10 rounds - detailed
        int gameInfo[] = DetailGames();
        
        //simulate remaining rounds
        RemainingGames(gameInfo);
    }
    
}
