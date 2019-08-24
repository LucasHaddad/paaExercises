package exercise2;

import exercise1.Vector;

public class DynamicVector extends Vector {
    
    private void realoc() {
        Vector.MAX = Vector.MAX*2;
        int aux[] = v;
        v = new int[MAX];
        for (int i = 0 ; i < MAX ; i++)
            if (i < numElements) v[i] = aux[i];
            else v[i] = 0;
    }

    @Override
    public void append(int newElement) {
        if (numElements + 1 > MAX) realoc();
        super.append(newElement);
    }

}