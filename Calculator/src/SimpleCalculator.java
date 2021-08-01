import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.mariuszgromada.math.mxparser.Expression;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleCalculator extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField text;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton four;
	private JButton one;
	private JButton zero;
	private JButton five;
	private JButton two;
	private JButton dot;
	private JButton six;
	private JButton three;
	private JButton equals;
	private JButton clear;
	private JButton multi;
	private JButton div;
	private JButton sub;
	private JButton add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator frame = new SimpleCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalculator() {
		setBackground(new Color(255, 153, 0));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 629);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getText());
		contentPane.add(getSeven());
		contentPane.add(getEight());
		contentPane.add(getNine());
		contentPane.add(getFour());
		contentPane.add(getOne());
		contentPane.add(getZero());
		contentPane.add(getFive());
		contentPane.add(getTwo());
		contentPane.add(getDot());
		contentPane.add(getSix());
		contentPane.add(getThree());
		contentPane.add(getEquals());
		contentPane.add(getClear());
		contentPane.add(getMulti());
		contentPane.add(getDiv());
		contentPane.add(getSub());
		contentPane.add(getAdd());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Simple Calculator");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(118, 49, 297, 28);
		}
		return lblNewLabel;
	}
	private JTextField getText() {
		if (text == null) {
			text = new JTextField();
			text.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
			text.setForeground(new Color(255, 255, 255));
			text.setBackground(new Color(0, 0, 0));
			text.setBounds(61, 131, 354, 41);
			text.setColumns(10);
		}
		return text;
	}
	private JButton getSeven() {
		if (seven == null) {
			seven = new JButton("7");
			seven.setForeground(Color.WHITE);
			seven.setBackground(new Color(255, 204, 153));
			seven.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"7" );
				}
			});
			seven.setFont(new Font("Times New Roman", Font.BOLD, 20));
			seven.setBounds(61, 237, 55, 41);
		}
		return seven;
	}
	private JButton getEight() {
		if (eight == null) {
			eight = new JButton("8");
			eight.setForeground(Color.WHITE);
			eight.setBackground(new Color(255, 204, 153));
			eight.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"8");
				}
			});
			eight.setFont(new Font("Times New Roman", Font.BOLD, 20));
			eight.setBounds(211, 237, 55, 41);
		}
		return eight;
	}
	private JButton getNine() {
		if (nine == null) {
			nine = new JButton("9");
			nine.setForeground(Color.WHITE);
			nine.setBackground(new Color(255, 204, 153));
			nine.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"9");
				}
			});
			nine.setFont(new Font("Times New Roman", Font.BOLD, 20));
			nine.setBounds(360, 237, 55, 41);
		}
		return nine;
	}
	private JButton getFour() {
		if (four == null) {
			four = new JButton("4");
			four.setForeground(Color.WHITE);
			four.setBackground(new Color(255, 204, 153));
			four.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"4");
				}
			});
			four.setFont(new Font("Times New Roman", Font.BOLD, 20));
			four.setBounds(61, 324, 55, 41);
		}
		return four;
	}
	private JButton getOne() {
		if (one == null) {
			one = new JButton("1");
			one.setForeground(Color.WHITE);
			one.setBackground(new Color(255, 204, 153));
			one.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"1");
				}
			});
			one.setFont(new Font("Times New Roman", Font.BOLD, 20));
			one.setBounds(61, 399, 55, 41);
		}
		return one;
	}
	private JButton getZero() {
		if (zero == null) {
			zero = new JButton("0");
			zero.setForeground(Color.WHITE);
			zero.setBackground(new Color(255, 204, 153));
			zero.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"0");
				}
			});
			zero.setFont(new Font("Times New Roman", Font.BOLD, 20));
			zero.setBounds(61, 470, 55, 41);
		}
		return zero;
	}
	private JButton getFive() {
		if (five == null) {
			five = new JButton("5");
			five.setForeground(Color.WHITE);
			five.setBackground(new Color(255, 204, 153));
			five.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"5");
				}
			});
			five.setFont(new Font("Times New Roman", Font.BOLD, 20));
			five.setBounds(211, 324, 55, 41);
		}
		return five;
	}
	private JButton getTwo() {
		if (two == null) {
			two = new JButton("2");
			two.setForeground(Color.WHITE);
			two.setBackground(new Color(255, 204, 153));
			two.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"2");
				}
			});
			two.setFont(new Font("Times New Roman", Font.BOLD, 20));
			two.setBounds(211, 399, 55, 41);
		}
		return two;
	}
	private JButton getDot() {
		if (dot == null) {
			dot = new JButton(".");
			dot.setForeground(Color.WHITE);
			dot.setBackground(new Color(255, 204, 153));
			dot.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+".");
				}
			});
			dot.setFont(new Font("Times New Roman", Font.BOLD, 20));
			dot.setBounds(211, 470, 55, 41);
		}
		return dot;
	}
	private JButton getSix() {
		if (six == null) {
			six = new JButton("6");
			six.setForeground(Color.WHITE);
			six.setBackground(new Color(255, 204, 153));
			six.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"6");
				}
			});
			six.setFont(new Font("Times New Roman", Font.BOLD, 20));
			six.setBounds(360, 324, 55, 41);
		}
		return six;
	}
	private JButton getThree() {
		if (three == null) {
			three = new JButton("3");
			three.setForeground(Color.WHITE);
			three.setBackground(new Color(255, 204, 153));
			three.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"3");
				}
			});
			three.setFont(new Font("Times New Roman", Font.BOLD, 20));
			three.setBounds(360, 399, 55, 41);
		}
		return three;
	}
	private JButton getEquals() {
		if (equals == null) {
			equals = new JButton("=");
			equals.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Expression ef= new Expression(text.getText());
					
					float temp;
					temp= (float) ef.calculate();
					text.setText(String.valueOf(temp));
				}
			});
			equals.setForeground(Color.WHITE);
			equals.setBackground(new Color(255, 153, 51));
			equals.setFont(new Font("Times New Roman", Font.BOLD, 20));
			equals.setBounds(360, 470, 55, 41);
		}
		return equals;
	}
	private JButton getClear() {
		if (clear == null) {
			clear = new JButton("C");
			clear.setBackground(new Color(255, 0, 0));
			clear.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText("");
				}
			});
			clear.setFont(new Font("Times New Roman", Font.BOLD, 20));
			clear.setBounds(461, 131, 55, 41);
		}
		return clear;
	}
	private JButton getMulti() {
		if (multi == null) {
			multi = new JButton("*");
			multi.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"*");
				}
			});
			multi.setForeground(new Color(0, 0, 0));
			multi.setBackground(Color.WHITE);
			multi.setFont(new Font("Times New Roman", Font.BOLD, 20));
			multi.setBounds(461, 237, 55, 41);
		}
		return multi;
	}
	private JButton getDiv() {
		if (div == null) {
			div = new JButton("/");
			div.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"/");
				}
			});
			div.setForeground(new Color(0, 0, 0));
			div.setBackground(Color.WHITE);
			div.setFont(new Font("Times New Roman", Font.BOLD, 20));
			div.setBounds(461, 324, 55, 41);
		}
		return div;
	}
	private JButton getSub() {
		if (sub == null) {
			sub = new JButton("-");
			sub.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"-");
				}
			});
			sub.setForeground(new Color(0, 0, 0));
			sub.setBackground(Color.WHITE);
			sub.setFont(new Font("Times New Roman", Font.BOLD, 20));
			sub.setBounds(461, 399, 55, 41);
		}
		return sub;
	}
	private JButton getAdd() {
		if (add == null) {
			add = new JButton("+");
			add.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					text.setText(text.getText()+"+");
				}
			});
			add.setForeground(new Color(0, 0, 0));
			add.setBackground(Color.WHITE);
			add.setFont(new Font("Times New Roman", Font.BOLD, 20));
			add.setBounds(461, 470, 55, 41);
		}
		return add;
	}
}
