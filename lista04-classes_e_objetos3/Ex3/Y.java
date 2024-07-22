/*
3) (obrigatório)De acordo com a classe X descrita a seguir, responda à questão a.
public class X {
    private int cont;
    public void setCont(int cont) {
        this.cont = cont;
    } 
}
a. A classe descrita a seguir está correta? Se incorreta justifique sua resposta.
public class Y {
    public static void main (String[ ] args) {
        X ob = new X();
        ob.cont = 10;
    }
}
 */


// FORMA CORRETA:

// package Ex3;

// public class X {
//     private int cont;
//     public void setCont(int cont) {
//         this.cont = cont;
//     }
// }
public class Y {
    public static void main(String[] args) {
        X ob = new X();
        ob.setCont(10);
    }
}
