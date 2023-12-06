  /*Renato Sa Leitao de Carvalho Filho - 01509642 e Williene Rodrigues- 01513577*/

package atividades;

	import javax.swing.JOptionPane;

	public class atividade extends figuras  {
		public static void main (String[]args) {
			figuras dados = new figuras();
			dados.figura = Integer.parseInt(JOptionPane.showInputDialog("Escolha a figura que deseja calcular a área:"));
			switch(dados.figura) {
			case 1: 
				dados.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retângulo:"));
				dados.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do retângulo:"));
				JOptionPane.showMessageDialog(null, "a área do retângulo é: " + dados.base * dados.altura);
				break;
			case 2:
				dados.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do quadrado :"));
				dados.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do quadrado :"));
				JOptionPane.showMessageDialog(null, "A área do quadrado é: " + dados.base * dados.altura);
				break;
			case 3:
				dados.base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
				dados.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite altura do triângulo :"));
				JOptionPane.showMessageDialog(null, "a área do triângulo é: " + dados.base * dados.altura/2);
				break;
				
			}
			
			
			
		}

	}

