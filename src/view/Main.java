package view;

import br.edu.fateczl.lista.listaObj.Lista;
import br.edu.fateczl.pilhaint.*;

public class Main {

	public static void main(String[] args) {
		Lista listaA = new Lista();
		Lista listaB = new Lista();
		try {
			listaA.addFirst(3);
			listaA.addLast(5);
			listaA.addLast(8);
			listaA.addLast(12);
			listaA.addLast(9);
			listaA.addLast(7);

			listaB.addFirst(9);
			listaB.addLast(6);
			listaB.addLast(2);
			listaB.addLast(12);
			listaB.addLast(9);
			listaB.addLast(7);

			Lista listaI = new Lista();
			Lista listaU = new Lista();

			int tamanhoA = listaA.size();
			int tamanhoB = listaB.size();

			System.out.println("Lista A: ");
			for (int i = 0; i < tamanhoA; i++) {
				System.out.print(listaA.get(i) + " -> ");
			}
			System.out.print("null\n");

			System.out.println("Lista B: ");
			for (int i = 0; i < tamanhoB; i++) {
				System.out.print(listaB.get(i) + " -> ");
			}
			System.out.print("null\n");

			// Intersecção
			for (int i = 0; i < tamanhoA; i++) {
				int v1 = (int) listaA.get(i);
				for (int j = 0; j < tamanhoB; j++) {
					int v2 = (int) listaB.get(j);
					if (v1 == v2) {
						listaI.addFirst(v1);
					}
				}
			}

			// União
			for (int i = 0; i < tamanhoA; i++) {
				if (listaU.isEmpty()) {
					listaU.addFirst(listaA.get(i));
				} else {
					listaU.addLast(listaA.get(i));
				}
			}
			for (int i = 0; i < tamanhoB; i++) {
				listaU.addLast(listaB.get(i));
			}

			int tamanhoI = listaI.size();
			int tamanhoU = listaU.size();

			System.out.println("Lista Intersecção: ");
			for (int i = 0; i < tamanhoI; i++) {
				System.out.print(listaI.get(i) + " -> ");
			}
			System.out.print("null\n");

			System.out.println("Lista União: ");
			for (int i = 0; i < tamanhoU; i++) {
				System.out.print(listaU.get(i) + " -> ");
			}
			System.out.print("null\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
