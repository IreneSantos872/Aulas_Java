public class Main {

    public static void main(String[] args) {

        //Quadrilatero
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f);

        double quadrado = QuadrilateroRetorno.area(2);
        System.out.println("área do quadrado: " + quadrado);
    }
}
