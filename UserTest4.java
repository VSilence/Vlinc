import java.awt.*; 
import javax.swing.*;  
//import javax.swing.border.Border; 
//import javax.swing.border.EtchedBorder; 
//import javax.swing.border.TitledBorder; 
import java.awt.event.*;  
public class UserTest4 extends JFrame implements ActionListener,ItemListener { 
	private static final long serialVersionUID = -844691391786953859L;  
	public JLabel jl1,jl2,jl3,jl4,jl5,jl6; 
	public JTextField jt=null;  
	public JRadioButton jr1,jr2; 
	public ButtonGroup bg;  
	public 
	String str1[]={"2000��","1999��","1998��","1997��","1996��",
			"1995��","1994��","1993��","1992��","1991��",
			"1990��","1989��","1988��","1987��","1986��",
			"1985��","1984��","1983��","1982��","1981��",
			"1980��","1979��","1978��","1977��","1976��",
			"1975��","1974��","1973��","1972��","1971��","1970��"};  
	public String str2[]={"12��","11��","10��"," 9 ��"," 8 ��",
			" 7 ��"," 6 ��"," 5 ��"," 4 ��"," 3 ��"," 2 ��"," 1 ��"};  
	public String str3[]={" 31��"," 30��"," 29��"," 28��"," 27��"," 26��"," 25��"," 24��"," 23��",
			" 22��"," 21��"," 20��"," 19��"," 18��"," 17��"," 16��"," 15��"," 14��"," 13��"," 12��",
			" 11��"," 10��"," 09��"," 08��"," 07��"," 06��"," 05��"," 04��"," 03��"," 02��"," 01��",};   
    public String str4[]={"��Ӱ","�Ķ�","����","���","����","��Ϸ","����","����"}; 
    public String str5[]={"����","�Ϻ�","","","","","","",""} ;
	public JTextArea ja; 
	public JButton jb1,jb2; 
	public JComboBox jc1,jc2,jc3; 
	public String st1,st2,st3,st4,st5;  
	public JCheckBox jh[]=new JCheckBox[8]; 
	public static void main(String[] args) { 
	new UserTest4();
	} 
	public UserTest4() { 
	this.getContentPane().setLayout(new FlowLayout()); 
	jl1=new JLabel("��������ĸ������ϣ���ɺ󵥻�ȷ��"); 
			jl2=new JLabel("�ǳ�:"); 
			jt=new JTextField(7); 
			jl3=new JLabel("�Ա�:");  
			jr1=new JRadioButton("��",true); 
			jr2=new JRadioButton("Ů"); 
			bg=new ButtonGroup(); 
			jl4=new JLabel("����:"); 
			jc1=new JComboBox(str1);
			jc1.addItemListener(this);
			jc2=new JComboBox(str2); 
			jc2.addItemListener(this); 
			jc3=new JComboBox(str3); 
			jc3.addItemListener(this); 
			bg.add(jr1);  
			bg.add(jr2);  
			jl5=new JLabel("����:"); 
			jl6=new JLabel("����ǩ����"); 
			ja=new JTextArea(5,22); 
			jb1=new JButton("ȷ��"); 
			jb1.setBounds(10, 60, 20, 10); 
			jb1.addActionListener(this); 
			jb2=new JButton("�˳�"); 
			jb2.addActionListener(this); 
			this.getContentPane().add(jl1); 
			this.getContentPane().add(jl2); 
			this.getContentPane().add(jt); 
			this.getContentPane().add(jl3); 
			this.getContentPane().add(jr1); 
			this.getContentPane().add(jr2); 
			this.getContentPane().add(jl4); 
			this.getContentPane().add(jc1); 
			this.getContentPane().add(jc2); 
			this.getContentPane().add(jc3); 
			this.getContentPane().add(jl5); 
			for(int i=0;i<str4.length;i++) {  
			jh[i]=new JCheckBox(str4[i]);  
			jh[i].addActionListener(this); 
			this.getContentPane().add(jh[i]); 
			}  
			this.getContentPane().add(jl6); 
			this.getContentPane().add(ja); 
			this.getContentPane().add(jb1); 
			this.getContentPane().add(jb2); 
			jt.setBackground(Color.YELLOW); 
			ja.setBackground(Color.YELLOW); 
			this.setBounds(290, 30, 280,360); 
			this.setResizable(false); 
			this.setVisible(true); 
			}  
			public void actionPerformed(ActionEvent e) {  
			String ss=e.getActionCommand();  
			if(ss.equals("ȷ��")) { 
			if(jr1.isSelected()) { 
			st1="��"; 
			}  
		if(jr2.isSelected()) {
			st1="Ů"; 
			}  
			ja.setText(" �ǳ�:"+jt.getText()+"\n"+" �Ա�"+st1+"\n"+" ���� ��"+st2+st3+st4+"\n"+" ���ã�"); 
			for(int i=0;i<str4.length;i++)
		{  
		   if(jh[i].isSelected()) 
			{ 
			st5=str4[i]; 
			ja.append(st5);  	 
			}	 
			} 
			}  	 
		if(ss.equals("�˳�")) 
			{ 
			System.exit(0); 
			}	 
	}  
	
	@Override  
	 
	public void itemStateChanged(ItemEvent ex) { 
	// TODO Auto-generated method stub 
	if(ex.getItemSelectable()==jc1) 
	
	{ 
 
	st2=(String)(jc1.getSelectedItem());  
	
	}  

	if(ex.getItemSelectable()==jc2) 	 
	{	 
	st3=(String)(jc2.getSelectedItem());  
	} 	 
	if(ex.getItemSelectable()==jc3) 	 
	{ 	  
	st4=(String)(jc3.getSelectedItem());  
	 
	} 

	}  
	
	}
