package Grafica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public static void main(String[] args)
	{
		JFrame f = new MyFrame();	
		f.setVisible(true);	
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private Toolkit tk = Toolkit.getDefaultToolkit();
	private Dimension d=tk.getScreenSize();
	private MyPanel gamePanel;
	private JButton playButton;
	
	public MyFrame()
	{
		super();
		initGUI();
		initEH();	
	}
	
	public void initGUI()
	{
		this.setSize(d.width*55/100, d.height*80/100);
		this.setTitle("HEX");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		gamePanel = new MyPanel();
		playButton = new JButton("Play");
		
		gamePanel.add(playButton);
		
		this.add(gamePanel);
			
	}
	
	public void initEH()
	{
		playButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				gamePanel.play();
				playButton.setEnabled(false);
				
			}
		});
	}
}
