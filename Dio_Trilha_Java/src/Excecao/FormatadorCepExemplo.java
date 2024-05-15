package Excecao;

public class FormatadorCepExemplo {
	
	public static void main(String[] args) {
		
		try {
			String cepFormatado = formatarCep("7814226");
			System.out.println(cepFormatado);
		} catch (CepInvalidoException e) {
			System.out.println("O CEP não corresponde com as regras de negocios ");
			//e.printStackTrace();
		}
	}
	
	static String formatarCep(String cep)throws CepInvalidoException{
		if(cep.length()!=8) {
			throw new CepInvalidoException();
			
		}
		return "78.142.268";
		
	}

}
