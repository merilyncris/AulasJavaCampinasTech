package aula12.exercicio1;

public class TestaPais {

	public static void main(String[] args) {
		Pais getiu = new Pais("67845-8", "Getiú", 56.897, 98.000);
		Pais fernel = new Pais("34576-2", "Fernel", 300.976, 98.000);
		Pais angunes = new Pais("67821-3", "Angunes", 467.234, 98.000);
		Pais makai = new Pais("78562-9", "Makai", 78.456, 98.000);
		
		System.out.println(getiu.getCodigoISO()  + " \ndimensao: " + getiu.getDimensao());
		System.out.println(getiu.verificaIgualdade(makai));
	
		System.out.println(getiu.getNome() + " " + getiu.calculaDensidadePopulacional());
	}
}
