import java.util.HashSet;

public class MainValidateSolution {
    public static void main(String[] args) {
        int[] solution = { 1, 2, 3, 4, 5 };
        System.out.println("¿La solucion es valida? " + isValidSolution(solution));
    }

    public static boolean isValidSolution(int[] solution) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : solution) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}