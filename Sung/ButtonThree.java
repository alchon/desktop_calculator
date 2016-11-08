import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonThree extends JFrame
{
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");


	public ButtonThree()
	{
		//제목 설정
		super("위 상단 제목");

		//레이아웃 설정
		this.setLayout(new FlowLayout());

		//버튼 추가
		this.add(b1);
		this.add(b2);
		this.add(b3);

		//프레임 크기 지정
		this.setSize(300, 400);

		//프레임 보이도록 설정
		this.setVisible(true);

		//X버튼 눌렀을 때 닫히도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//실행
		new ButtonThree();
	}
}
