package avaliacao.exercicio2;


public class TestaContinente {

	public static void main(String[] args) {
		Continente continente = new Continente("America do Sul");
		Pais brasil = new Pais("ARG", "Brasil", 8515767 , 194579000);
		Pais argentina = new Pais("BRA", "Argentina", 2791810, 40471000);
		Pais bolivia = new Pais("BOL", "Bolivia", 1098581, 9947000);
		Pais chile = new Pais("CHL", "Chile", 756950, 17053000);
		Pais colombia = new Pais("COL", "Colombia", 1141748, 4598000);
		Pais equador = new Pais("ECU", "Equador", 256370, 13700000);
		Pais paraguai = new Pais("PRY", "Paraguai", 406750, 6405000);
		Pais peru = new Pais("PER", "Peru", 1285220, 29331000);
		Pais uruguai = new Pais("URY", "Uruguai", 176220, 3367000);
		Pais venezuela = new Pais("VEN", "Venezuela", 916445, 28814000);
		

		continente.setPaises(argentina);
		continente.setPaises(bolivia);
		continente.setPaises(venezuela);
		continente.setPaises(brasil);
		continente.setPaises(uruguai);
		continente.setPaises(equador);
		continente.setPaises(paraguai);
		continente.setPaises(peru);
		continente.setPaises(colombia);
		continente.setPaises(chile);
		
		System.out.println(continente.getNome());
		System.out.println(argentina.getDimensao());
		System.out.println(continente.dimensaoContinente());
		
		System.out.println(continente.populacaoTotal());
		
		System.out.println(continente.densidadeDemografica());
		continente.maiorPopulacao();
		
		continente.menorPopulacao();
		continente.maiorDimensao();
		continente.menorDimensao();
		continente.getPaises();
		continente.razaoTerritorialMaiorPeloMenor();
		
	}
}
