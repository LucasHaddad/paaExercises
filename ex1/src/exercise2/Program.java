package exercise2;

import exercise1.Vector;

class Program {

    public static void main(String[] args) {
        Vector V = new DynamicVector();
        
        V.append(10); 
        V.append(8);
        V.append(16); 
        V.append(7);
        V.append(5); 
        V.append(13);
        V.append(22);
        V.append(11);
        V.append(9);
        V.append(44);

        System.out.println("Tamanho:" + Vector.MAX);

        V.append(42);

        System.out.println("Tamanho:" + Vector.MAX);

        V.append(84);

        System.out.println("Tamanho:" + Vector.MAX);

        V.print();

        V.set(3,19); 
        V.set(15,1);
        V.revert();   
        V.print();
    }

}