package avaliacao.exercicio1;

public class TestaPais {

	public static void main(String[] args) {
		Pais brasil = new Pais("ARG", "Brasil", 8515767 , 194579000);
		Pais argentina = new Pais("BRA", "Argentina", 2791810, 40471000);
		Pais bolivia = new Pais("BOL", "Bolivia", 1098581, 9947000);
		Pais chile = new Pais("CHL", "Chile", 756950, 17053000);
		Pais colombia = new Pais("COL", "Colombia", 1141748, 45980000);
		Pais equador = new Pais("ECU", "Equador", 256370, 13700000);
		Pais paraguai = new Pais("PRY", "Paraguai", 406750, 6405000);
		Pais peru = new Pais("PER", "Peru", 1285220, 2933100);
		Pais uruguai = new Pais("URY", "Uruguai", 176220, 336700);
		Pais venezuela = new Pais("VEN", "Venezuela", 916445, 28814000);
		
		System.out.println(argentina.getCodigoISO()  + " \ndimensao: " + argentina.getDimensao());
		System.out.println(brasil.verificaIgualdade(argentina));
	
		System.out.println(brasil.calculaDensidadePopulacional());
		
		brasil.setFronteiras(argentina);
		brasil.setFronteiras(bolivia);
		brasil.setFronteiras(colombia);
		brasil.setFronteiras(paraguai);
		brasil.setFronteiras(peru);
		brasil.setFronteiras(uruguai);
		brasil.setFronteiras(venezuela);
		
		argentina.setFronteiras(chile);
		argentina.setFronteiras(brasil);
		argentina.setFronteiras(paraguai);
		argentina.setFronteiras(bolivia);
		argentina.setFronteiras(uruguai);
		
		bolivia.setFronteiras(brasil);
		bolivia.setFronteiras(argentina);
		bolivia.setFronteiras(paraguai);
		bolivia.setFronteiras(chile);
		bolivia.setFronteiras(peru);
		
		chile.setFronteiras(peru);
		chile.setFronteiras(bolivia);
		chile.setFronteiras(argentina);


		

		
		brasil.getFronteiras();
		
		System.out.println(chile.verificaLimitrofe(uruguai));
		
		argentina.verificaFronteirasComuns(brasil);
	}
}
