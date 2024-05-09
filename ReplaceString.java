public class ReplaceString {
    public static void main(String[] args) {
        String string = "Hello How Are You";
        String GantiKarakter = string.replace('H', 'T');
        String GantiKalimat = string.replace("Hello", "Good Morning");
        System.out.println("Untuk replace Karakter : "+ GantiKarakter);
        System.out.println("Untuk replace Kalimat : "+ GantiKalimat);
              
    }
}
// Output:
// Untuk replace karakter : Tello Tow Are You
// Untuk replace karakter : Good Morning How Are You
