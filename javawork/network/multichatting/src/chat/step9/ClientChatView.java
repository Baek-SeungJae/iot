package chat.step9;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ClientChatView extends JFrame {

	JPanel contentPane;
	JTextField txtinput;
	JTextArea taChat;
	JButton btnsend;
	JList lstconnect;
	String ip;
	int port;
	String nickname;
	Socket socket;

	InputStream is;
	InputStreamReader ir;
	BufferedReader br;

	OutputStream os;
	PrintWriter pw;

	/**
	 * Create the frame.
	 */
	Vector<String> nicknamelist = new Vector<>();

	StringTokenizer st;

	public ClientChatView(String ip, int port, String nickname) {
		this.ip = ip;
		this.port = port;
		this.nickname = nickname;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		taChat = new JTextArea();
		taChat.setBounds(12, 10, 501, 375);
		// contentPane.add(taChat);

		JScrollPane scroll = new JScrollPane(taChat);
		scroll.setBounds(12, 10, 501, 375);
		contentPane.add(scroll);

		txtinput = new JTextField();
		txtinput.setBounds(12, 395, 378, 35);
		contentPane.add(txtinput);
		txtinput.setColumns(10);

		btnsend = new JButton("\uC11C\uBC84\uB85C\uC804\uC1A1");
		btnsend.setFont(new Font("HY견고딕", Font.BOLD, 14));
		btnsend.setBounds(402, 395, 109, 35);
		contentPane.add(btnsend);

		JLabel lblNewLabel = new JLabel("\uC811\uC18D\uC790:");
		lblNewLabel.setFont(new Font("HY견고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(519, 10, 120, 35);
		contentPane.add(lblNewLabel);

		lstconnect = new JList();
		lstconnect.setBounds(525, 47, 205, 108);
		contentPane.add(lstconnect);
		lstconnect.setListData(nicknamelist);

		setVisible(true); // 화면에 j프레임을 추가
		ClientChatListener listener = new ClientChatListener(this);
		txtinput.addActionListener(listener);
		btnsend.addActionListener(listener);
		connectServer();
	}

	public void connectServer() {
		try {
			socket = new Socket(ip, port);
			if (socket != null) {
				ioWork();
			}
			sendMsg(nickname);
			nicknamelist.add(nickname);
			Thread resivethread = new Thread(new Runnable() {
				@Override
				public void run() {
					while (true) {
						String msg = "";
						try {
							msg = br.readLine();
							filteringMsg(msg);
						} catch (IOException e) {
							try {
								is.close();
								ir.close();
								br.close();
								os.close();
								pw.close();
								socket.close();
								break;
							} catch (IOException e1) {

							}
						}
					}
				}
			});
			resivethread.start();

		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
	}

	private void filteringMsg(String msg) {
		st = new StringTokenizer(msg, "/");
		String protocol = st.nextToken();
		String message = st.nextToken();
		System.out.println(protocol + "," + message);

		if (protocol.equals("new")) {
			nicknamelist.add(message);
			lstconnect.setListData(nicknamelist);
			taChat.append("***********" + message + "님이 입장하셨습니다.\n");

		} else if (protocol.equals("old")) {
			nicknamelist.add(message);
			lstconnect.setListData(nicknamelist);
		} else if (protocol.equals("chatting")) {
			if (message != null) {
				taChat.append(message + "\n");
			}
		} else if (protocol.equals("out")) {
			nicknamelist.remove(message);
			lstconnect.setListData(nicknamelist);
			taChat.append("***********" + message + "님이 퇴장하셨습니다.\n");
			try {
				socket.close();
			} catch (IOException e) {
			}
		}
	}

	public void ioWork() {
		try {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = socket.getOutputStream();
			pw = new PrintWriter(os, true);

		} catch (IOException e) {
		}
	}

	public void sendMsg(String message) {
		System.out.println("클라이언트가 서버에게 메시지 전송하기: " + message);
		pw.println(message);
	}
}
