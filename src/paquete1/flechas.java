package paquete1;

import javax.swing.JOptionPane;

public class flechas {
	int longitud;
    String color;
   
    public flechas() {
        longitud = Integer.parseInt(JOptionPane.showInputDialog("ingrese la logitud de la fecha:" ));
    	color="negro";
    }
    
    public flechas(int longitud,String color) {
    	this.longitud=longitud;
    	this.color=color;
    	
    }
    
    public void imprimirEspacio() {
    	System.out.println();
    }
    
    public void construirFlecha() {
    	for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
    	imprime(">");
    }
    private void imprime(String simbolo) {
    	if (color.equals("negro")) {
			System.out.print(simbolo);
		}else {
			System.out.print(simbolo);
		}
    }
}
