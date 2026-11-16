fun lacznaLiczbaGodzin(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
    return godzinyTygodniowo * liczbaTygodni
}

fun main() {
    println("Zestaw 1: ${lacznaLiczbaGodzin(4, 15)} godz.")
    println("Zestaw 2: ${lacznaLiczbaGodzin(6, 20)} godz.")
}
