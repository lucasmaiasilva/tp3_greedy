package tp3_greedy;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(args[0]));
		sc.nextInt();
		int count = 1;
		int flag = 0;
		String mensagem;
		String msg_0 = new String();
		String msg_1 = new String();

		while (sc.hasNext()) { 
			mensagem = sc.next();
			for(int i=0;i<mensagem.length();i++){
				if(mensagem.charAt(i)=='1'){
					msg_0 = new String();
					msg_1 = msg_1+'1';
					if(msg_1.contains("11111")){
						//System.out.println("true1");
						flag=1;
						break;
					}
				}
				if(mensagem.charAt(i)=='-'){
					msg_1 = msg_1+'1';
					msg_0 = msg_0+'0';
					if(msg_1.contains("11111")){
						//System.out.println("true1-");
						flag=1;
						break;
					}
					if(msg_0.contains("000")){
						//System.out.println("true0-");
						flag=1;
						break;
					}
				}
				if(mensagem.charAt(i)=='0'){
					msg_1 = new String();
					msg_0 = msg_0+'0';
					if(msg_0.contains("000")){
						//System.out.println("true0");
						flag=1;
						break;
					}
				}
			}
			msg_1 = new String();
			msg_0 = new String();
			if(flag==0){
				System.out.println("false");
			}
			else{
				System.out.println("true");
				flag=0;
			}
		}
	}
}
