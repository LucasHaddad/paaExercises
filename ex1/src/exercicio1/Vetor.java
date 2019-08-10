package exercicio1;

public class Vetor {
	 public static final int TAMANHO = 10;
	 private int v [] = new int[TAMANHO]; // Armazena os elementos
	 private int numElementos; // Informação sobre o número de elementos inseridos

	 public Vetor() {
		 numElementos = 0;
		 for (int i = 0; i < (TAMANHO - 1) ; i++) {
			 v[i] = 0;
		 }
	 }
	 
	 public int obtemTamanho() { 
		 return numElementos;
	 }
	 
	 public void insereNoFinal(int novoElemento) { 
		 v[numElementos] = novoElemento;
		 numElementos++;	 
	 }
	 
	 public int posicaoDe (int elemento) {
		 for (int i = 0; i <= numElementos ; i++) {
			 if (v[i] == elemento) return i;
		 }
		 
		 return -1;
	 }
	 
	 public int alteraEm (int pos, int novoValor) {
		 if(pos > numElementos) return -1;
			 
		 v[pos] = novoValor;
		 return novoValor;
	 }
	 
	 public int elementoEm (int pos) { 
	 	if(pos > numElementos) return -1;
		 
		 return v[pos];
	 }
	 
	 public void reverte() { 
		 int aux[] = new int[numElementos];
		 for (int i = numElementos; i >= 0; i--) {
			 aux[numElementos - i] = v[i];
		 }
		 v = aux;
	 }
	 
	 public void imprime() { 
		 for (int i = 0 ; i <= numElementos; i++) {
			 System.out.print(v[i] + " ");
		 }
	 }
}