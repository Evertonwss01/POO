import java.util.Random;
public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovado;
	
	
	// Metodo Marcar Luta //
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
			this.aprovado = true; 
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	// Metodo Lutar //
	public void lutar() {
		if(this.aprovado == true) {
			System.out.println("\n");
			System.out.println("===### DESAFIADO ###===");
			this.desafiado.apresentar();
			System.out.println("=======================");
			System.out.println("\n");
			System.out.println("===### DESAFIANTE ###===");
			this.desafiante.apresentar();
			System.out.println("=======================");
			
			Random ale = new Random();
			int vencedor = ale.nextInt(3);
			// |Opcoes 0-Empate | 1-Vitoria Desafiado | 2-Vitoria Desafiante| //
			switch (vencedor) {
			case 0: // Luta Empatada //
				System.out.println("\n");
				System.out.println("A Luta Empatou !");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
			break;
			case 1: // Desafiado //	
				System.out.println("\n");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				System.out.println("O Desafiado "+this.desafiado.getNome()+" Venceu a Luta !!");
				System.out.println("\n");
			break;
			case 2: // Desafiante //
				System.out.println("\n");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				System.out.println("O Desafiante "+this.desafiante.getNome()+" Venceu a Luta !!");
				System.out.println("\n");
			break;
			}
		}else {
			System.out.println("A luta não poderá acontecer, entre os Lutadores ");
			System.out.println("\n");
		}
	}
}
