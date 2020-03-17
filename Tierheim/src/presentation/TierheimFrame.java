package presentation;

import javax.swing.JFrame;

public class TierheimFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public TierheimFrame() {
		
		initLayout();
		initObjects();
	}

	private void initObjects() {
		
		TierPanel tierPanel = new TierPanel(50, 50, 150, 100);
		add(tierPanel);
	}

	private void initLayout() {
		
		setLayout(null);
		setTitle("Tierheim");
		setBounds(0, 0, 800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
