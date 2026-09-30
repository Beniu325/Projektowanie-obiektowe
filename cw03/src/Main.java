void main() {
            Scanner scanner = new Scanner(System.in);
//
//  zad 1  System.out.println("Podaj liczbe i wyswietli tylko nie parzyste po kolei:  ");
//
//            int n = scanner.nextInt();
//
//
//
//            for (int i = 1; i <= n; i += 2) {
//                System.out.print(i + " ");
//            }

// zad 2   System.out.println("no to teraz tak, ten program ci wypisze potegi liczby 2 do ktorej dochodzi czy coś:  ");
//    int n = scanner.nextInt();
//
//    int potega = 1;
//
//    while (potega <= n) {
//        System.out.println(potega);
//        potega *= 2;
//    }

    int suma = 0;
    int liczba;

    System.out.println("Podej liczbe ziomuś no ale jak podasz 0 to kończy program):  ");

    while (true) {
        liczba = scanner.nextInt();

        if (liczba == 0) {
            break;
        }

        suma += liczba;
    }

    System.out.println("Suma podanych liczb: " + suma);

}


