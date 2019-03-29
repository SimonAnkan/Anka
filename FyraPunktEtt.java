import javax.swing.JOptionPane;
/*
 * I uppgift 4.1 
 * Ski Doo Summit
 * 
 * En intressant kommentar
 */

public class FyraPunktEtt {

	public static void main(String[] args) {
		
		int Minuter = Integer.parseInt(JOptionPane.showInputDialog(null, "Skriv antalet minuter du kommer prata i telefonen så kommer vi avgöra vilket abonnemang som är bäst för dig.")); 
		
		if(Minuter <=33)
			JOptionPane.showMessageDialog(null, "Välj Kontant"); 
		else if(Minuter <= 66)
			JOptionPane.showMessageDialog(null, "Välj Normal");
		else
		    JOptionPane.showMessageDialog(null, "Välj Plus");
		

	}

}
