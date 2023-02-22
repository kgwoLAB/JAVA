
	
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
	

public class App extends JFrame{	
    
    JFrame frame;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(new AngelLinster());
        button.addActionListener(new DevilListener());
        // 프레임을 설정하는 코드

		frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
    }   

    class AngelLinster implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }
    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println("그냥 저질러 버렷!!");
        }
    }
}
