package listaDupEncadeadaTeste;

public class MainDup {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		lista.inserirInicio("alo");
		lista.inserirInicio("teste");
		lista.inserirInicio("123");
		System.out.println(lista);
		lista.retirarInicio();
		System.out.println(lista);
		lista.inserirFinal("al");
		lista.inserirMeio(2, "738");
		System.out.println(lista);
		lista.retirarFim();
		System.out.println(lista);
		lista.retirarMeio(1);
		System.out.println(lista);
	}

}
