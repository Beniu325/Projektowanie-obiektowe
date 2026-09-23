//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj liczbę całkowitą: ");
    int liczba = scanner.nextInt();
    if (liczba % 3 == 0) {
        System.out.println("Liczba " + liczba + " jest podzielna bez reszty przez 3.");
    } else {
        System.out.println("Liczba " + liczba + " NIE jest podzielna bez reszty przez 3.");
    }
}
