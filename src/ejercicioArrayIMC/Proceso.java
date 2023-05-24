package ejercicioArrayIMC;

import javax.swing.JOptionPane;

public class Proceso {
	
	String listaPersonas[];
	Double listaPeso[],listaAltura[];
	Double listaImc[];

	int numeroDePersonas;

	public void iniciar() {
		
		String menu="GESTION ESTUDIANTES\n";
		menu+="1. Llenar Datos\n";
		menu+="2. calcular Imc\n";
		menu+="3.Imprimir\n";
		menu+="4.Consultar estado de acuerdo al IMC\n";
		menu+="5. Salir\n";
		menu+="Ingrese una opcion:\n";
		
		
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			validarMenu(opc);
		
		}while (opc!=5);	

}


	private void validarMenu(int opc) {
		switch (opc) {
		case 1:llenarDatos();
			break;
		case 2:calcularIMC();
			break;
		case 3:imprimirDatos();
			break;
		case 4:imcMensaje();
			break;
		case 5:System.out.println("Salio del programa,vuelva pronto!");
			break;
		default:System.out.println("ingrese una opcion valida");
			break;
		}
		
	}


	private void imprimirDatos() {
		for (int i = 0; i < numeroDePersonas; i++) {		
		System.out.print("Señor@: "+listaPersonas[i]);
		System.out.print(" su peso es de: "+listaPeso[i]);
		System.out.print(" y su Altura de: "+listaAltura[i]);
		System.out.print(" por lo tanto su IMC registrados: "+listaImc[i]+"\n");
		}
	}


	private void  calcularIMC() {
		listaImc=new Double [numeroDePersonas];
		for (int i = 0; i < numeroDePersonas; i++) {
			listaImc[i]=listaPeso[i]/(listaAltura[i]*listaAltura[i]);	
		}
		
		
	}

	private void imcMensaje() {
		for (int i = 0; i < listaAltura.length; i++) {
			if (listaImc[i] < 18) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene anorexia!");
			}else if(listaImc[i] >= 18 && listaImc[i] < 20) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene delgadez!");
			}else if(listaImc[i] >= 20 && listaImc[i] < 27) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y esta en normalidad!");
			}else if(listaImc[i] >= 27 && listaImc[i] < 30) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene Obseidad grado 1!");
			}else if(listaImc[i] >= 30 && listaImc[i] < 35) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene Obseidad grado 2!");
			}else if(listaImc[i] >= 35 && listaImc[i] < 40) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene Obseidad grado 3!");
			}else if(listaImc[i] >= 40) {
				System.out.println("El IMC de "+listaPersonas[i]+ " es de: "+listaImc[i]+" y tiene Obseidad morbida!");
			}
		}
		
	}
	private void llenarDatos() {
		numeroDePersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de personas"));
		listaPersonas=new String [numeroDePersonas];
		listaPeso=new Double [numeroDePersonas];
		listaAltura=new Double [numeroDePersonas];
		
		
		for (int i = 0; i < numeroDePersonas; i++) {
			listaPersonas[i]=JOptionPane.showInputDialog("Ingrese el nombre");
			listaPeso[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso en Kg de la personas"));
			listaAltura[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura en metros de la persona"));
		}
		
		
	}
}