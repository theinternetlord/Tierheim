package presentation;

import javax.swing.JLabel;

public class DataLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	int x, y, width, height;
	
	public DataLabel(int x, int y, int width, int height) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		initLayout();
	}

	private void initLayout() {
		
		setLayout(null);
		setBounds(x, y, width, height);
		setVisible(true);
		setOpaque(true);
	}
}
