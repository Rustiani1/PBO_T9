public class SubString {
    public static void main(String[] args) {
        String hello = "Welcome to Rustiani";
        System.out.println("Hasilnya adalah : " + hello.substring(1, 7));
        System.out.println("Hasilnya adalah : " + hello.substring(5, hello.length()));

    }
    
}
//output 
// Hasilnya adalah : welcome
// // Hasilnya adalah : me to Rustiani
