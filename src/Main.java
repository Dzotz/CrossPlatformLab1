import solver.LinearEquationSolver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example system of equations: q+w+2e=5, 2q+3w+2e=6, q+2w+4e=7");
        double[][] A = {
                {1, 1, 2},
                {2, 2, 2},
                {1, 2, 4}
        };
        double[] b = {5, 6, 7};

        // Вирішення Гаусом
        double[] solutionGaussian = LinearEquationSolver.gaussianElimination(A, b);
        System.out.println("Solution using Gaussian Elimination: " + Arrays.toString(solutionGaussian));

        // Вирішення Матрицею
        double[] solutionMatrix = LinearEquationSolver.matrixMethod(A, b);
        System.out.println("Solution using Matrix Method: " + Arrays.toString(solutionMatrix));
    }
}