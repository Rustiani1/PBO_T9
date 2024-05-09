public interface ContohToLower {
    public static void main(String[] args) {
        String stringOri = "Welcome to Informatics Engineering";
        String stringLower = stringOri.toLowerCase();
        System.out.println("Sebelum digunakan method toLowerCase : "+ stringOri);
        System.out.println("Setelah digunakan method toLowerCase : "+ stringLower);
    }
}
