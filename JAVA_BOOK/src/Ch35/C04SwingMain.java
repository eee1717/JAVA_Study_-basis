package Ch35;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class C04GUI extends JFrame
{
	C04GUI(){
		super(); //상위클래스 생성자 호출
		setTitle("세번째 프레임입니다");
		
		//패널 추가
		JPanel pan1 = new JPanel();
		
		//배경 색 지정
		Color col = new Color(180,244,237);	//Red,Green,Blue(0-255,0-255,0255)											//
		pan1.setBackground(col);
		
		
		//버튼객체 생성
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		//버튼 위치 지정
		btn1.setBounds(50,400,80,30);
		btn2.setBounds(160,400,80,30);
		
		//버튼 패널에 추가
		pan1.add(btn1);
		pan1.add(btn2);
		
		//레이아웃 null
		pan1.setLayout(null);
		
		//패널을 프레임에 추가
		add(pan1);
		
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
}
public class C04SwingMain {

	public static void main(String[] args) {
		
		new C04GUI();
	}

}
