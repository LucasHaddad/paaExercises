package exercise1;

public class Vector {
	public static int MAX = 10;
	protected int v [] = new int[MAX];
	protected int numElements;

	public Vector() {
		numElements = 0;
		for (int i = 0; i < (MAX - 1) ; i++)
			v[i] = 0;
	}
	
	public int size() { 
		return numElements;
	}
	
	public void append(int newElement) { 
		v[numElements] = newElement;
		numElements++;	 
	}
	
	public int getPosition(int elemento) {
		for (int i = 0; i <= numElements ; i++)
			if (v[i] == elemento) return i;
		return -1;
	}
	
	public int set(int pos, int newValue) {
		if(pos > numElements + 1) return -1;
		v[pos] = newValue;
		return newValue;
	}
	
	public int get(int pos) { 
		if(pos > numElements) return -1;
		return v[pos];
	}
	
	public void revert() { 
		int aux[] = new int[numElements + 1];
		for (int i = numElements; i >= 0; i--)
			aux[numElements - i] = v[i];
		v = aux;
	}
	
	public void print() {
		for (int i = 0 ; i <= numElements; i++)
			System.out.print(v[i] + " ");
		System.out.println();
	}
}