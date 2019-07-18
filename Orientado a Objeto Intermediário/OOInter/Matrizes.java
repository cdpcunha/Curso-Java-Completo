package OOInter;

import java.util.Random;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nRow = 0, nCol = 0, iRow = 0, iCol = 0;
		System.out.println("Tamanho da Linha : ");
		nRow = sc.nextInt();
		sc.nextLine();
		System.out.println("Quantidade de Linhas : ");
		nCol = sc.nextInt();
		sc.hasNextLine();
		Random rand = new Random();

		int[][] matriz = new int[nRow][nCol];

		for (iRow = 0; iRow < nRow; iRow++) {
			for (iCol = 0; iCol < nCol; iCol++) {
				matriz[iRow][iCol] = rand.nextInt(100);
				}
		}

		for (iRow = 0; iRow < nRow; iRow++) {
			for (iCol = 0; iCol < nCol; iCol++) {
				System.out.print(matriz[iRow][iCol] + "  ");
			}
			System.out.println("");
		}

		System.out.println("Entre o valor a ser buscado : ");
		int aux = sc.nextInt();
		sc.nextLine();

		for (iRow = 0; iRow < nRow; iRow++) {
			for (iCol = 0; iCol < nCol; iCol++) {
				if (matriz[iRow][iCol] == aux) {
					if (aux == matriz[iRow][iCol]) {
						System.out.println("----------------------------");
						System.out.printf("Posição : %d,%d\n",iRow+1,iCol+1);
						if (iCol > 0) {
							System.out.println("Esquerda : " + matriz[iRow][iCol - 1]);
						}
						if (iCol < nCol - 1) {
							System.out.println("Direita : " + matriz[iRow][iCol + 1]);
						}
						if (iRow > 0) {
							System.out.println("Acima : " + matriz[iRow - 1][iCol]);
						}
						if (iRow < nRow - 1) {
							System.out.println("Abaixo : " + matriz[iRow + 1][iCol]);
						}
					}
				}
			}
		}

		sc.close();
	}

}
