
fun obliczGodziny(godzinyWTygodniu: Int, liczbaTygodni: Int): Int {
    return godzinyWTygodniu * liczbaTygodni
}

fun main() {
    val imie = "Maciej"
    var klasa = "4TD"
    val kierunek = "Technik informatyk"

    println("WIZYTOWKA UCZNIA")
    println("Imie: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    println()
    println("LICZBA GODZIN ZAJEC")

    val wynik1 = obliczGodziny(30, 4)
    val wynik2 = obliczGodziny(35, 5)

    println("30 godzin przez 4 tygodnie: $wynik1")
    println("35 godzin przez 5 tygodni: $wynik2")

    klasa = "5D"
    println()
    println("Klasa po zmianie: $klasa")
}
