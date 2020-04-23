import javax.swing.JOptionPane;

public class Test53 {
	public static void main(String[]args) {
		while(true) {
			String v=JOptionPane.showInputDialog("성적을 입력하세요");
			int score=Integer.parseInt(v);
			if(score>=90&&score<=100)v="A";
			if(score>=80&&score<90)v="B";
			if(score>=70&&score<80)v="C";
			if(score>=60&&score<70)v="D";
			if(score>=0&&score<60 v="F";
			JOptionPane.showMessageDialog(null, v);
			
		}
	}
}
