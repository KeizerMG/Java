public class Exo5 {
    public static void main(String[] args) {
        Integer existingVar = null;
        Integer myVar = java.util.Optional.ofNullable(existingVar).orElse(42);
        System.out.println("La valeur de myVar est : " + myVar);
    }
}
