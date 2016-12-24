import java.io.*;
import java.net.*;

public class Vlinc_Server {
	public static void main(String argsp[]){
		try{
			ServerSocket server = null;
			try{
				server = new ServerSocket(6060);                        //����ServerSocket����6060�˿�
			}catch (Exception e){
				System.out.println("Error:" + e);
				System.exit(-1);
			}
			Socket client = null;
			try{
				client = server.accept();
			}
			catch(Exception e){
				System.out.println("����ʧ�ܣ���������������ӣ�");
				System.exit(-1);
			}
			String inputString;
			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter os = new PrintWriter(client.getOutputStream());
			//��Socket����õ������������������Ӧ�ĵ�BufferedReader��PrintWriter����
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("�Է�˵��" + is.readLine());
			inputString = sin.readLine();                                //�ӱ�׼���������Ϣ
			while(inputString != null && !inputString.trim().equals("quit chat")){
				os.println(inputString);								 //����Ϣ�����ͻ���
				os.flush();												 //ˢ���������ʹ�ͻ��˼�ʱ�õ���Ϣ
				System.out.println("��˵��" + inputString);
				System.out.println("�Է�˵��" + is.readLine());			 //����Ļ����ʾ���ͺͽ��յ���Ϣ
				inputString = sin.readLine();							 //�����µ���Ϣ
			}
			os.close();	
			is.close();
			client.close();
			server.close();												 //�ر�Socket�����������Socket��ServerSocket
			System.out.println("���������");
		}catch(Exception e){
			System.out.println("Error:" + e);
		}	
	}
}
