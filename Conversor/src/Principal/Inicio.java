package Principal;

import javax.swing.JOptionPane;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;

public class Inicio {

	public static void main(String[] args) {

		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();


			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);


				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					JOptionPane.showMessageDialog(null, "Vuelva a ejecutar el programa ♥");
					JOptionPane.showMessageDialog(null, "Problemas técnicos, se solucionaran pronto");
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					JOptionPane.showMessageDialog(null, "Gracias por su visita");
				}
				break;

			case "Conversor de Temperatura":
				String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
				double valorRecibidoT = Double.parseDouble(input1);
				conversionT.ConvertirTemperaturas(valorRecibidoT);


				int respuestaT = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
				if(JOptionPane.OK_OPTION == respuestaT) {
					JOptionPane.showMessageDialog(null, "Vuelva a ejecutar el programa ♥");
					JOptionPane.showMessageDialog(null, "Problemas técnicos, se solucionaran pronto");
					System.out.println("Entra");
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					JOptionPane.showMessageDialog(null, "Gracias por su visita");
				}

		}
		break;
	}

}
}
