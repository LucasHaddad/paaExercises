package exercise1;

class Program {
    public static void main(String[] args) {
        Vector V = new Vector();
        
        V.append(10); 
        V.append(8);
        V.append(16); 
        V.append(7);
        V.append(5); 
        V.append(13);

        V.print();

        V.set(3,19); 
        V.set(15,9);
        
        for (int i = 0; i < V.size(); i++)
            System.out.println("Elemento na posicao " + i + ": " + V.get(i));

        V.revert();   
        V.print();
    }
}