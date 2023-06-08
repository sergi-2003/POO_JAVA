package paquete1;

import javax.swing.JOptionPane;

import paquete1.flechas;
import paquete1.principal;

public class principal {
	
	 flechas flecha1,flecha2,flecha3;
	 
	 
	public static void main(String[] args) {
	     principal miPrincipal = new principal();
		}
		
		public principal() {
			flecha1=new flechas();
			flecha1.construirFlecha();
			flecha1.imprimirEspacio();
			
			flecha2=new flechas();
			flecha2.longitud=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la logitud "));
			flecha2.color="rojo";
			flecha2.construirFlecha();
			flecha2.imprimirEspacio();


			flecha3=new flechas();
			flecha3.construirFlecha();
			flecha3.imprimirEspacio();
			
		}
}
