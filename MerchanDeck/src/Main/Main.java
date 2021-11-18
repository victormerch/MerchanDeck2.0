package Main;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws MalformedURLException 
	 * @throws URISyntaxException 
	 */
	public Main() throws MalformedURLException, URISyntaxException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 809);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("MERCHANDECK2.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2));
		
		panel.add(new Botones(new URL("https://yt3.ggpht.com/ytc/AKedOLSXM6BC0-e4MIhpEKO2lQ127WJZl_7qooKjG7VbhA=s900-c-k-c0x00ffffff-no-rj"),new URI("https://www.youtube.com/")));
		panel.add(new Botones(new URL("https://images-na.ssl-images-amazon.com/images/I/21kRx-CJsUL.png"),new URI("https://www.twitch.tv/")));
		panel.add(new Botones(new URL("https://moodle.com/wp-content/uploads/2018/07/Moodle_july27-1.png"),new URI("https://moodle.org/?lang=ca")));
		panel.add(new Botones(new URL("https://play-lh.googleusercontent.com/PCpXdqvUWfCW1mXhH1Y_98yBpgsWxuTSTofy3NGMo9yBTATDyzVkqU580bfSln50bFU"),new URI("https://github.com/")));
		panel.add(new Botones(new URL("https://pbs.twimg.com/profile_images/1415324297304977411/p9kTpGac_400x400.png"),new URI("https://www.udemy.com/")));
	}

}

class Botones extends JButton{
	
	

	public Botones(URL foto,java.net.URI pagina){
		
       
		ImageIcon dukesIcon = new ImageIcon(foto); 
		setIcon(dukesIcon);
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(pagina);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	
}