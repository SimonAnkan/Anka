import javax.swing.JOptionPane;
/*
 * I uppgift 4.1 
 * Ski Doo Summit
 * 
 * En intressant kommentar
 */

public class FyraPunktEtt {

	public static void main(String[] args) {
		
		int Minuter = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv antalet minuter du kommer prata i telefonen s� kommer vi avg�ra vilket abonnemang som �r b�st f�r dig.")); 
		
		if(Minuter <=33)
			JOptionPane.showMessageDialog(null, "V�lj Kontant"); 
		else if(Minuter <= 66)
			JOptionPane.showMessageDialog(null, "V�lj Normal");
		else
		    JOptionPane.showMessageDialog(null, "V�lj Plus");
		

	}

}
