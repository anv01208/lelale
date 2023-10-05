public class main {
    public static void main(String[] args) {
        Papa papa =Papa.getInstance();
        papa.cheers();

        Papa newpapa =Papa.getInstance();
        Papa newpapa1 =Papa.getInstance();
        Papa newpapa2 =Papa.getInstance();
        Papa newpapa3 =Papa.getInstance();
        Papa newpapa4 =Papa.getInstance();

        System.out.println(newpapa1.toString());
        System.out.println(newpapa2.toString());
        System.out.println(newpapa3.toString());
        System.out.println(newpapa4.toString());


        System.out.println(papa.toString());
        System.out.println(papa.cheers());
    }
}