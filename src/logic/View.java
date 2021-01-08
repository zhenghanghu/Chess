package Logic;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Piece.*;

public class View extends JFrame {
	
	private static final int LENGTH = 8;
	
	private Piece[][] p;
	
	private JPanel[][] cellPanels;
	private JLabel[][][][] cellLabels;
	private int boardSize, cellSize, borderSize; 
	private JPanel contentPane;
	
	private Icon[][] pieceIcons = new ImageIcon[2][6];
	
	public View(int size) {
		
		/* Initialize */
		Color darkSide = new Color(129, 118, 126);
		Color lightSide = new Color(236, 241, 235);
		Color borderColor = new Color(64, 59, 65);
		
		boardSize = size;
		cellSize = boardSize / LENGTH;
		borderSize = cellSize / 4;
		setResizable(false);
		setTitle("CHESS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(borderColor);
		contentPane.setPreferredSize(new Dimension(boardSize + 2 * borderSize, boardSize + 2 * borderSize + 25));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		pack();
		
		/* Menu */
		JMenuBar menuBar = new JMenuBar();
	    JMenu file = new JMenu("文件(F)");
	    file.setMnemonic('F');

	    JMenuItem open = new JMenuItem("打开");
	    JMenuItem quit = new JMenuItem("退出");

	    file.add(open);
	    file.addSeparator();
	    file.add(quit);

	    menuBar.add(file);
	    setJMenuBar(menuBar);
	    
	    for (int i = 0; i < 2; i++)
	    	for (int j = 0; j < 6; j++) {
	    		String name = "./icons/" + i + "_" + j + ".png";
	    		pieceIcons[i][j] = new ImageIcon(name);
	    	}
	    
	    cellPanels = new JPanel[LENGTH][LENGTH];
		cellLabels = new JLabel[LENGTH][LENGTH][2][6];
	    /* Board Construction */
	    for (int i = 0; i < LENGTH; i++) {
			/* 1 - 8 */
			JLabel lbl = new JLabel(String.valueOf(i + 1), JLabel.CENTER);
			lbl.setLocation(0,  boardSize - cellSize * (i + 1) + borderSize);
			lbl.setSize(borderSize, cellSize);
			lbl.setForeground(Color.WHITE);
			contentPane.add(lbl);
			lbl = new JLabel(String.valueOf(i + 1), JLabel.CENTER);
			lbl.setLocation(borderSize + boardSize,  boardSize - cellSize * (i + 1) + borderSize);
			lbl.setSize(borderSize, cellSize);
			lbl.setForeground(Color.WHITE);
			contentPane.add(lbl);
			
			/* A - H */
			lbl = new JLabel(Character.toString((char)('A' + i)), JLabel.CENTER);
			lbl.setLocation(borderSize + cellSize * i, borderSize + boardSize);
			lbl.setSize(cellSize, borderSize);
			lbl.setForeground(Color.WHITE);
			contentPane.add(lbl);
			lbl = new JLabel(Character.toString((char)('A' + i)), JLabel.CENTER);
			lbl.setLocation(borderSize + cellSize * i, 0);
			lbl.setSize(cellSize, borderSize);
			lbl.setForeground(Color.WHITE);
			contentPane.add(lbl);
			for (int j = 0; j < LENGTH; j++) {
				/* Board Cell Color */
				JPanel panel = new JPanel();
				cellPanels[j][i] = panel;
				Color color = (i + j) % 2 == 0 ? darkSide : lightSide;
				panel.setBackground(color);
				panel.setLocation(borderSize + cellSize * i, boardSize - cellSize * (j + 1) + borderSize);
				panel.setSize(cellSize, cellSize);
				contentPane.add(panel);
				panel.setLayout(null);
				
				/* Piece Label */
				for (int c = 0; c < 2; c++) 
					for (int t = 0; t < 6; t++) {
						final JLabel lbll = new JLabel();
						lbll.setHorizontalAlignment(JLabel.CENTER);
						lbll.setBounds(0, 0, cellSize, cellSize);
						lbll.setVisible(false);
						lbll.setIcon(pieceIcons[c][t]);
						panel.add(lbll);
						cellLabels[j][i][c][t] = lbll;
					}
			}
		}
	    
	    /* Piece Array */
		p = new Piece[LENGTH][LENGTH];
		/* Set Pawns */
		for (int i = 0; i < LENGTH; i++) {
			cellLabels[1][i][0][5].setVisible(true);
			cellLabels[6][i][1][5].setVisible(true);
		}
	    
	    
	}
	
	// 建piece[][], boardView, Panel[][], Label[][]
	
	// Listeners
	
	// get()
}
