package dad.holagui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class HolamundoAWT {

	public static void main(String[] args) {

		Label saludarLabel = new Label();
		saludarLabel.setText("Aqui saldrá el saludo");
		saludarLabel.setBounds(20,20,120,50);
		
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20,80,120,30);
		saludarButton.addActionListener(e -> saludarLabel.setText("¡Hola Mundo!"));
		
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludarLabel);
		rootPanel.add(saludarButton);
		
		Frame frame = new Frame();
		frame.setTitle("Hola Mundo con AWT");
		frame.setSize(320,200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.setVisible(true);
	}

}
