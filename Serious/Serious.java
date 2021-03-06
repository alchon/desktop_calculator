import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;


/**
 * Serious.java
 * Main
 * @author alchon
 * @author hellogaon
 */

// v1.0.1

public class Serious extends JFrame implements ActionListener, KeyListener{

    JPanel panel;
    JFrame frame;
    JButton [] num_btn = new JButton[10];
    JButton Primebtn, MODbtn, AVGbtn, factorialbtn, deletebtn, clearbtn,
            dividebtn, multiplebtn, percentbtn, leftbracketbtn, rightbracketbtn,
            minusbtn, plusbtn, equalbtn, dotbtn; // 버튼 생성
    JTextField textField;
    public String inlabel=""; // = 계산 식 String
    boolean idt_num = true; // 0~9 숫자 입력 가능 여부

    /**
     * class Serious Constructor
     * realize GUI
     */

    // 생성자
    public Serious() {
        setTitle("Serious");
        setSize(320, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 레이아웃 설정
        setLayout(null);
        AddPanel();
        AddTextField();
        AddButton();
        add(panel);
        setVisible(true);
    }

    /**
     * Set Panel Method
     */

    // 패널 설정
    public void AddPanel() {
        panel = new JPanel();
        panel.setLayout(null); //패널의 Layout을 NULL
        panel.setBounds(0, 0, 320, 500); //패널의 크기 및 위치 지정 (x,y로 부터 넓이(width, 높이(height))
    }

    /**
     * Set TextField Method
     */

    // 텍스트 필드 설정
    public void AddTextField(){
        textField = new JTextField("");
        textField.setHorizontalAlignment(JTextField.RIGHT); // 우측 정렬
        textField.setEditable(false); // 텍스트필드 창에 텍스트 쓰지 못하게 잠금
        textField.setBounds(0,0,320,60);
        panel.add(textField);
    }

    /**
     * Set Button Method
     * Set Listener
     */

    // 버튼 설정
    public void AddButton() {
        for (int i=0; i<10; i++)
            num_btn[i] = new JButton(String.valueOf(i));
        Primebtn = new JButton("P");
        MODbtn = new JButton("MOD");
        AVGbtn = new JButton("AVG");
        factorialbtn = new JButton("!");
        deletebtn = new JButton("<-");
        clearbtn = new JButton("C");
        dividebtn = new JButton("/");
        multiplebtn = new JButton("x");
        percentbtn = new JButton("%");
        leftbracketbtn = new JButton("(");
        rightbracketbtn = new JButton(")");
        minusbtn = new JButton("-");
        plusbtn = new JButton("+");
        equalbtn = new JButton("=");
        dotbtn = new JButton(".");
        //버튼 글씨색
        for (int i=0; i<10; i++)
            num_btn[i].setForeground(Color.BLACK);
        dotbtn.setForeground(Color.BLACK);
        leftbracketbtn.setForeground(Color.BLACK);
        rightbracketbtn.setForeground(Color.BLACK);
        percentbtn.setForeground(Color.BLACK);
        deletebtn.setForeground(Color.BLACK);
        clearbtn.setForeground(Color.RED);
        equalbtn.setForeground(Color.BLUE);
        plusbtn.setForeground(Color.BLUE);
        minusbtn.setForeground(Color.BLUE);
        multiplebtn.setForeground(Color.BLUE);
        dividebtn.setForeground(Color.BLUE);

        Color orange = new Color(255, 153, 000);

        Primebtn.setForeground(orange);
        MODbtn.setForeground(orange);
        AVGbtn.setForeground(orange);
        factorialbtn.setForeground(orange);

        // 버튼 배열
        num_btn[0].setBounds(0,420,160,60);
        num_btn[7].setBounds(0,240,80,60);
        num_btn[8].setBounds(80,240,80,60);
        num_btn[9].setBounds(160,240,80,60);
        num_btn[4].setBounds(0,300,80,60);
        num_btn[5].setBounds(80,300,80,60);
        num_btn[6].setBounds(160,300,80,60);
        num_btn[1].setBounds(0,360,80,60);
        num_btn[2].setBounds(80,360,80,60);
        num_btn[3].setBounds(160,360,80,60);

        for (int i=0; i<10; i++)
            panel.add(num_btn[i]);

        dotbtn.setBounds(160,420,80,60);
        equalbtn.setBounds(240,360,80,120);
        plusbtn.setBounds(240,300,80,60);
        minusbtn.setBounds(240,240,80,60);
        percentbtn.setBounds(0,180,80,60);
        leftbracketbtn.setBounds(80,180,80,60);
        rightbracketbtn.setBounds(160,180,80,60);
        multiplebtn.setBounds(240,180,80,60);
        deletebtn.setBounds(0,120,160,60);
        clearbtn.setBounds(160,120,80,60);
        dividebtn.setBounds(240,120,80,60);
        Primebtn.setBounds(0,60,80,60);
        MODbtn.setBounds(80,60,80,60);
        AVGbtn.setBounds(160,60,80,60);
        factorialbtn.setBounds(240,60,80,60);

        //addActionListener 추가
        for (int i=0; i<10; i++)
            num_btn[i].addActionListener(this);
        dotbtn.addActionListener(this);
        equalbtn.addActionListener(this);
        plusbtn.addActionListener(this);
        minusbtn.addActionListener(this);
        percentbtn.addActionListener(this);
        leftbracketbtn.addActionListener(this);
        rightbracketbtn.addActionListener(this);
        multiplebtn.addActionListener(this);
        deletebtn.addActionListener(this);
        clearbtn.addActionListener(this);
        dividebtn.addActionListener(this);
        Primebtn.addActionListener(this);
        MODbtn.addActionListener(this);
        AVGbtn.addActionListener(this);
        factorialbtn.addActionListener(this);

        // addKeyListener 추가
        for (int i=0; i<10; i++)
            num_btn[i].addKeyListener(this);
        dotbtn.addKeyListener(this);
        equalbtn.addKeyListener(this);
        plusbtn.addKeyListener(this);
        minusbtn.addKeyListener(this);
        percentbtn.addKeyListener(this);
        leftbracketbtn.addKeyListener(this);
        rightbracketbtn.addKeyListener(this);
        multiplebtn.addKeyListener(this);
        deletebtn.addKeyListener(this);
        clearbtn.addKeyListener(this);
        dividebtn.addKeyListener(this);
        Primebtn.addKeyListener(this);
        MODbtn.addKeyListener(this);
        AVGbtn.addKeyListener(this);
        factorialbtn.addKeyListener(this);


        panel.add(dotbtn);
        panel.add(equalbtn);
        panel.add(plusbtn);
        panel.add(minusbtn);
        panel.add(percentbtn);
        panel.add(leftbracketbtn);
        panel.add(rightbracketbtn);
        panel.add(multiplebtn);
        panel.add(deletebtn);
        panel.add(clearbtn);
        panel.add(dividebtn);
        panel.add(Primebtn);
        panel.add(MODbtn);
        panel.add(AVGbtn);
        panel.add(factorialbtn);
    }


    /**
     * Click Button Event Method
     * @param e ActionEvent
     */

    //버튼이 눌렸을 때의 함수
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
        if(str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") ||
           str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") ||
           str.equals("8") || str.equals("9")){
            AddNumberEvent(str);
        }
        else if(str=="+" || str=="-" || str=="x" || str=="/"){
            AddOperator(str);
        }
        else if(idt_num && (str=="(" || str==")")){
            BracketEvent(str);
        }
        else if(str=="C"){
            ClearEvent();
        }
        else if (str == "<-") {
            BackEvent();
        }
        else if(str=="="){
            EqualEvent();
        }
        else if (idt_num && str == ".") {
            DotEvent(str);
        }
        else if (str == "%") {
            PercentEvent();
        }
        else if (str == "!") {
            FacEvent();
        }
        else if (str == "MOD") {
            MODEvent();
        }
        else if (str == "P") {
            PEvent();
        }
        else if (str == "AVG") {
            AVGEvent();
        }
    }

    /**
     * Calculate Average Method
     */

    // AVG 이벤트
    public void AVGEvent() {
        if (inlabel.contains("-") || inlabel.contains("x") || inlabel.contains("/") ||
                inlabel.contains("MOD")) {
            inlabel = "";
            textField.setText("Invalid");
        }
        else {
            String[] tmp = inlabel.split(" \\+ ");
            double i, sum=0;
            try {
                for (i = 0; i < tmp.length; i++) {
                    sum += Integer.parseInt(tmp[(int) i]);
                }
                double avg = sum / i;
                inlabel = String.valueOf(avg);
                EqualEvent(); // 답이 정수일경우 .0 이 생기는걸 방지하기위해 이거씀
            }catch (NumberFormatException e) {
                textField.setText("Invalid");
                inlabel = "";
            }
        }
    }

    /**
     * Calculate Prime number or not
     * Yes or No
     */

    // P 이벤트
    public void PEvent() {
        EqualEvent();
        try{
            int num = Integer.parseInt(inlabel);
            int[] prime = new int[10000000];
            prime[0]=1; prime[1]=1;
            double limit = Math.sqrt(num);
            for(int i=2;i<=limit;i++){
                if(prime[i]==0){
                    for(int j=i*i;j<=num;j+=i){
                        prime[j]=1;
                    }
                }
            }
            if(prime[num]==0)
                textField.setText("Yes");
            else
                textField.setText("No");
            inlabel = "";
        }catch (NumberFormatException e){
            inlabel = "";
            textField.setText("Invalid");
        }

    }

    /**
     * Calculate Modular Method
     */

    // MOD 이벤트
    public void MODEvent() {
        String str = "m";
        inlabel += " "+str+" ";
        textField.setText(inlabel);
        idt_num = true;
    }

    /**
     * Add Bracket Method
     * @param str String
     */

    // ( ) 이벤트
    public void BracketEvent(String str) {
        inlabel += " "+str+" ";
        textField.setText(inlabel);
    }

    /**
     * Calculate Factorial Method
     */

    // ! 이벤트
    public void FacEvent() {
      if (!inlabel.equals("")) {
          EqualEvent();
          try {
              int num = Integer.parseInt(inlabel);
              if(num > 100){
                  textField.setText("Invalid");
                  inlabel = "";
              }
              else{
                  while (--num > 0) {
                      inlabel = inlabel + " x " + String.valueOf(num);
                  }
                  EqualEvent();
              }
          } catch (NumberFormatException e) {
              textField.setText("Invalid");
              inlabel = "";
          }
      }
    }

    /**
     * Calculate Percent Method
     */

    // % 이벤트
    public void PercentEvent() {
        if (!inlabel.equals("")) {
            EqualEvent();
            inlabel += " / 100";
            EqualEvent();
        }
    }

    /**
     * Add Dot Method
     * @param str String
     */

    // .이벤트
    public void DotEvent(String str) {
        if (inlabel.equals("")) {
            inlabel += "0.";
        }
        else if (inlabel.charAt(inlabel.length()-1) == ' ') {
            inlabel += "0.";
        }
        else if (inlabel.charAt(inlabel.length()-1) != '.') {
            inlabel += str;
        }
        textField.setText(inlabel);
    }

    /**
     * To remove 'E' Method
     * @param str String
     * @return String str
     */

    // 문자열 숫자에서 e를 삭제하기 위한 함수
    public String stos(String str){
        String afterE = "";
        String str2 = "";
        int e;
        int len = str.length();
        int start = str.indexOf("E");
        if(start==-1)
            return str;
        if(start!=-1){
          System.out.println(str);
            for(int i=start+1;i<len;i++){
                afterE+=str.charAt(i);
            }
            e = Integer.parseInt(afterE);
            str = str.substring(0, start);
            str = str.replace(".", "");
            len = str.length();
            if(len>e){
              str2 = str.substring(e+1,len);
              str = str.substring(0,e+1);
              str += '.';
              str += str2;
            }
            for(int i=0;i<e+1-len;i++){
                str+='0';
            }
        }
        return str;
    }

    /**
     * Calculate Method
     */

    // = 이벤트
    public void EqualEvent() {
        if (!inlabel.equals("")) {
            Calc c = new Calc();
            if(inlabel.length() > 2) {
                char tp = inlabel.charAt(inlabel.length()-2);
                if (tp == '+' || tp == '-' || tp == '/' || tp == 'x') {
                    inlabel = inlabel.substring(0, inlabel.length()-3);
                }
            }
            if (!c.bracketsBalance(inlabel)) {
                textField.setText("Parenthesis Error");
                inlabel = "";
            } else {
                String postfixExp = c.postfix(inlabel);
                try{
                    try {
                        Double result = c.result(postfixExp);
                        String tmp = Double.toString(result);
                        tmp = stos(tmp);
                        if (tmp.substring(tmp.length() - 2, tmp.length()).equals(".0")) {
                            tmp = tmp.substring(0, tmp.length() - 2);
                        }
                        textField.setText(tmp);
                        inlabel = tmp;
                    }catch (NullPointerException e) {
                        textField.setText("Invalid");
                        inlabel="";
                    }
                }catch (NumberFormatException e) {
                    textField.setText("Invalid");
                    inlabel = "";
                }

            }
            idt_num = false;
        }
    }

    /**
     * Delete Method
     */

    // Back 이벤트
    public void BackEvent() {
        if (!inlabel.equals("")){
            try{
                char tmp = inlabel.charAt(inlabel.length()-2);
                if(inlabel.charAt(inlabel.length()-1)!=' '){
                  inlabel = inlabel.substring(0, inlabel.length()-1);
                }
                else if (tmp == '+' || tmp == '-' || tmp == '/' || tmp == 'x' || tmp == '(' || tmp == ')') {
                    inlabel = inlabel.substring(0, inlabel.length()-3);
                }
            } catch (StringIndexOutOfBoundsException e){
                inlabel = inlabel.substring(0, inlabel.length()-1);
            } finally {
                textField.setText(inlabel);
            }
        }
    }

    /**
     * Clear Method
     */

    // Clear 이벤트
    public void ClearEvent() {
        inlabel = "";
        textField.setText(inlabel);
        idt_num = true;
    }

    /**
     * Add Operator Method
     * @param str String
     */

    // 연산자 이벤트
    public void AddOperator(String str) {
        if (!inlabel.equals("")) {
            try {
                char tmp = inlabel.charAt(inlabel.length() - 1);
                if (tmp == ' ') {
                    try {
                        tmp = inlabel.charAt(inlabel.length() - 2);
                        if (tmp == '+' || tmp == '-' || tmp == 'x' || tmp == '/') {
                            inlabel = inlabel.substring(0, inlabel.length() - 3);
                        }
                    } catch (StringIndexOutOfBoundsException e) {
                        inlabel = "";
                        textField.setText("Invalid");
                    }
                }
                inlabel += " " + str + " ";
            } catch (StringIndexOutOfBoundsException e) {
                inlabel += " " + str + " ";
            }finally {
                textField.setText(inlabel);
            }
            idt_num = true;
        }
    }

    /**
     * Add Number Method
     * @param str String
     */

    // 숫자 이벤트
    public void AddNumberEvent(String str) {
        if(idt_num) {
            inlabel += str;
            textField.setText(inlabel);
        }
    }

    /**
     * Add Number Method
     * @param num int
     */
    public void AddNumberEvent(int num) {
        if(idt_num) {
            int tmp = num - '0';
            String str = String.valueOf(tmp);
            inlabel += str;
            textField.setText(inlabel);
        }
    }

    /**
     * Keyboard Event Method
     * @param e KeyEvent
     */

    // 키보드 이벤트 처리
    @Override
    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyChar();
        String str;
        switch (keycode) {
            case KeyEvent.VK_0:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_1:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_2:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_3:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_4:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_5:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_6:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_7:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_8:
                AddNumberEvent(keycode);
                break;
            case KeyEvent.VK_9:
                AddNumberEvent(keycode);
                break;
            case 46: // .
                str = ".";
                DotEvent(str);
                break;
            case 10: // (enter)
                EqualEvent();
                break;
            case 47: // /
                str = "/";
                AddOperator(str);
                break;
            case 42: // *
                str = "x";
                AddOperator(str);
                break;
            case 43: // +
                str = "+";
                AddOperator(str);
                break;
            case 45: // -
                str = "-";
                AddOperator(str);
                break;
            case 8: //backspace
                BackEvent();
                break;
            case 27: //ESC
                ClearEvent();
                break;
            case 37: //%
                PercentEvent();
                break;
            case 40: //(
                str = "(";
                BracketEvent(str);
                break;
            case 41: //)
                str = ")";
                BracketEvent(str);
                break;
            case 33: //!
                FacEvent();
                break;
            case 109: case 77: // m, M
                MODEvent();
                break;
            case 112:case 80: // p, P
                PEvent();
                break;
            case 97:case 65: // a, A
                AVGEvent();
                break;
        }
    }

    /**
     * Main Method
     * @param args String[]
     */

    public static void main(String[] args) {
        new Serious();
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
