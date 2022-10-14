
public class TesteLuta {

	public static void main(String[] args) {
		// Foi Criado um array de Lutadores //
		
		Lutador l[] = new Lutador[6];
		
		// Lutador 1 //
		l[0] = new Lutador("Turré","Cubano", 32, 1.75, 48.0, 17, 4, 2);
		// Lutador 2 //

		l[1] = new Lutador("Hazard","Polones", 28, 1.55, 62.0, 15, 3, 1);
		// Lutador 3 //
		
		l[2] = new Lutador("Coentrão","Espanhou", 35, 1.76, 74.0, 22, 5, 3);
		
		// Lutador 4 //
		l[3] = new Lutador("Drogba","Nigeriano", 36, 1.81, 78.0, 20, 7, 2);
		
		// Lutador 5 //
		l[4] = new Lutador("Snaidjer","Holandes", 45, 1.73, 86.0, 25, 4, 4);
		
		// Lutador 6 //
		l[5] = new Lutador("Ronaldinho","Brasileiro",48, 1.83, 85.0, 30, 6, 5);
		
		// UFC Combate | **Lutas que ocorrerão** //
		
		Luta UFC = new Luta();
		UFC.marcarLuta(l[0], l[1]); // Lutador Turré vs Lutador Hazard //
		UFC.lutar();
		l[0].status();
		l[1].status();
		
		System.out.println("\n");
		UFC.marcarLuta(l[2], l[3]); // Lutador Coentrão vs Lutador Drogba //
		UFC.lutar();
		l[2].status();
		l[3].status();
		
		System.out.println("\n");
		UFC.marcarLuta(l[4], l[5]); // Lutador Snaidjer vs Lutador Ronaldinho //
		UFC.lutar();
		l[4].status();
		l[5].status();
		
		// Lutas que não poderá acontecer, por não pertencerem a mesma Categoria //
		
		System.out.println("\n");
		UFC.marcarLuta(l[0], l[2]); // Luatdor Turré vs Lutador Coentrão //
		UFC.lutar();
		l[0].apresentar();
		l[0].status();
		l[2].apresentar();
		l[2].status();
		
		System.out.println("\n");
		UFC.marcarLuta(l[1], l[3]); // Lutador Hazard vs Lutador Drogba //
		UFC.lutar();
		l[1].apresentar();
		l[1].status();
		l[3].apresentar();
		l[3].status();
		
		System.out.println("\n");
		UFC.marcarLuta(l[2], l[4]); // Lutador Coentrão vs Lutador Snaidjer //
		UFC.lutar();
		l[2].apresentar();
		l[2].status();
		l[4].apresentar();
		l[4].status();
		
		System.out.println("\n");
		UFC.marcarLuta(l[3], l[5]); // Lutador Drogba vs Lutador Ronaldinho //
		UFC.lutar();
		l[3].apresentar();
		l[3].status();
		l[5].apresentar();
		l[5].status();
	}

}
