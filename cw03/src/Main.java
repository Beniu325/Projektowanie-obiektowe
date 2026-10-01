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

//   zad 3 int suma = 0;
//    int liczba;
//
//    System.out.println("Podej liczbe ziomuś no ale jak podasz 0 to kończy program):  ");
//
//    while (true) {
//        liczba = scanner.nextInt();
//
//        if (liczba == 0) {
//            break;
//        }
//
//        suma += liczba;
//    }
//
//    System.out.println("Suma podanych liczb: " + suma);
//
//}

        int liczba;
        int suma = 0;
        int min = 0;
        int max = 0;
        int ile = 0;
    System.out.println("Podaj liczbę. 0 kończy program:  ");

    while (true) {
        liczba = scanner.nextInt();

        if (liczba == 0) {
            break;
        }

        if (ile == 0) {
            min = liczba;
            max = liczba;
        } else {
            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max = liczba;
            }
            }

        suma += liczba;
        ile++;
        }

    if (ile == 0) {
        System.out.println("nie podano liczb");
    } else {
        System.out.println("suma wiekszej i mniejszej liczby:  ");

        double srednia = (double) suma / ile;

        System.out.println("Średnia arytmetyczna:  " + srednia);
    }

    }




















