package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valor) {

	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Peso mexicano a Dólar", "De Peso mexicano a Euro", "De Peso mexicano a Libras Esterlinas", "De Peso mexicano a Yen Japonés", "De Peso mexicano a Won sub-coreano", "De Dólar a Peso mexicano", "De Euro a Peso mexicano", "De Libras Esterlinas a Peso mexicano", "De Yen Japonés a Peso mexicano", "De Won sub-coreano a Peso mexicano"}, 
					"Seleccion")).toString();

	switch (opcion) {
	case "De Peso mexicano a Dólar": 
		monedas.ConvertirPesosMexicanoDolares(valor);
		break;

	case "De Peso mexicano a Euro": 
		monedas.ConvertirPesosMexicanoEuros(valor);
		break;

	case "De Peso mexicano a Libras Esterlinas":
		monedas.ConvertirPesosMexicanoLibra(valor);
		break;

	case "De Peso mexicano a Yen Japonés":
		monedas.ConvertirPesosMexicanoYen(valor);
		break;

	case "De Peso mexicano a Won sub-coreano":
		monedas.ConvertirPesosMexicanoWon(valor);
		break;

	case "De Dólar a Peso mexicano":
		monedas.ConvertirDolaresPesosMexicano(valor);
		break;

	case "De Euro a Peso mexicano":
		monedas.ConvertirEurosPesosMexicano(valor);
		break;

	case "De Libras Esterlinas a Peso mexicano":
		monedas.ConvertirLibraPesosMexicano(valor);
		break;

	case "De Yen Japonés a Peso mexicano":
		monedas.ConvertirYenPesosMexicano(valor);
		break;

	case "De Won sub-coreano a Peso mexicano":
		monedas.ConvertirWonPesosMexicano(valor);
		break;
	}
	}
}
