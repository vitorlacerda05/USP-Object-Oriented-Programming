class A {
    private int m;
    private int n;

    // Construtor da classe A que inicializa as variáveis m e n
    public A(int mIn, int nIn) {
        m = mIn;
        n = nIn;
    }

    // Getter e setter para obter e definir os valores
    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void m1() {
        m = m + n;
    }

    // Sobrescrita do método toString para retornar uma representação em string dos valores de m e n
    @Override
    public String toString() {
        return "A = (" + m + ", " + n + ")";
    }
}

public class B extends A {

    // Construtor da classe B que chama o construtor da classe A
    public B(int mIn, int nIn) {
        super(mIn, nIn);
    }

    
    // Sobrescrita do método m1 para realizar uma operação específica
    @Override
    public void m1() {
        int m = getM() + getN();
        setM(m - 2 * getN());
    }

    // Sobrescrita do método toString para retornar uma representação em string dos valores de m e n
    @Override
    public String toString() {
        return "B = (" + getM() + ", " + getN() + ")";
    }

    public static void main(String[] args) {
        A a = new A(1, 2);
        A b = new B(1, 2);
        System.out.println(a + " " + b);
        a.m1();
        b.m1();
        System.out.println(a + " " + b);
    
    }
}