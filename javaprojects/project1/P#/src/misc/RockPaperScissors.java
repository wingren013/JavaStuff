package misc;
import javax.swing.JOptionPane;


public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check=0;
		String Choice= "m";
		String computerChoicestring = " ";
		String chooserChoice = JOptionPane.showInputDialog(null, "Choose 1 for rock, 2 for paper, and 3 for scissors");
		double computerChoice = Math.random();
		if (computerChoice < 0.34) {
			computerChoicestring = "rock";
		} else if(computerChoice <= 0.67) {
			computerChoicestring = "paper";
		} else {
			computerChoicestring = "scissors";
		}
		
		
		int userChoice= Integer.parseInt(chooserChoice);
		
		if(userChoice == 1){
		    Choice = "rock";
		    check=0;
		}else if(userChoice == 2){
		    Choice = "paper";
		    check=0;
		}else if(userChoice == 3){
		    Choice = "scissors";
		    check=0;
		}else{
		    chooserChoice = JOptionPane.showInputDialog(null, "Choose 1 for rock, 2 for scissors, and 3 for paper");
		    check=1;
		}
		if(check==1){
		if(userChoice == 1){
		    Choice = "rock";
		    check=0;
		}else if(userChoice == 2){
		    Choice = "paper";
		    check=0;
		}else if(userChoice == 3){
		    Choice = "scissors";
		    check=0;
		}else{
		    chooserChoice = JOptionPane.showInputDialog(null, "Choose 1 for rock, 2 for scissors, and 3 for paper");
		    check=1;
		}
		}

	    
		    if (computerChoicestring == Choice){
		        JOptionPane.showMessageDialog(null, "The result is a tie!");		        
		    }
		    else if(Choice == "rock"){
		        if(computerChoicestring == "scissors"){
		        	JOptionPane.showMessageDialog(null, "rock wins");   
		        }else{
		        	JOptionPane.showMessageDialog(null, "paper wins");
		        }
		    }
		    else if(Choice == "paper"){
		        if(computerChoicestring == "rock"){
		        	JOptionPane.showMessageDialog(null, "paper wins");
		        }else{
		        	JOptionPane.showMessageDialog(null, "scissors wins");
		        }
		    }
		    else if(Choice == "scissors"){
		        if(computerChoicestring == "rock"){
		        	JOptionPane.showMessageDialog(null, "rock wins");
		        }else{
		            JOptionPane.showMessageDialog(null, "scissors wins");
		        }
		    }
		}



}
