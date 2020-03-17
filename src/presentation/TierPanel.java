package presentation;

import java.awt.Color;

import javax.swing.JPanel;

import business.TierDataManager;

public class TierPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	TierDataManager tierDataManager;
	int x, y, width, height;
	
	public TierPanel(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		initLayout();
		initObjects();
	}

	private void initObjects() {
		
		DataLabel dataLabel1 = new DataLabel(20, 20, 30, 20);
		DataLabel dataLabel2 = new DataLabel(60, 20, 30, 20);
		DataLabel dataLabel3 = new DataLabel(100, 20, 30, 20);
		
		add(dataLabel1);
		add(dataLabel2);
		add(dataLabel3);
	}

	private void initLayout() {

		setLayout(null);
		setBounds(x, y, width, height);
		setBackground(new Color(255, 150, 150));
	}
}
