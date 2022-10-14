public class Lutador {
	
	// Atributos do Lutador //
	
	private String nome, nacionalidade;
	private int idade;
	private double altura, peso;
	private String categoria;
	private int vitorias,derrotas,empates, totalLutas =0;
	 
	// Construtor do Lutador //
	
	public Lutador(String no, String na, int ida, double alt, double pe, int vi, int em, int de) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(ida);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
		this.setTotalLutas(vi+de+em);
	}
	
	// Metodos Gets e Sets //
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Peso 'Invalido'.";
		}else if(this.getPeso() <= 70.3) {
			this.categoria ="Peso 'LEVE'.";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Peso 'MEDIO'";
		}else if(this.getPeso() <=120.2) {
			this.categoria = "Peso 'PESADO'";
		}else {
			this.categoria = "Peso 'Invalido'";
		}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int v) {
		this.vitorias = v;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int v) {
		this.derrotas = v;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int v) {
		this.empates = v;
	}
	public int getTotalLutas() {
		return totalLutas;
	}
	public void setTotalLutas(int v) {
		this.totalLutas = v;
	}
	
	// Metodos do Lutador //
	
	public void apresentar() {
		System.out.println("|-----------------------------------------");
		System.out.println("|O Lutador: "+this.getNome()+"\n|De Origem: "+this.getNacionalidade()+
				"\n|Com Idade de: "+this.getIdade()+" anos.\n|Tem "+this.getAltura()+" de Altura.\n|E "+this.getPeso()+" Kg de peso."
				+"\n|Se encontra na Categoria de "+this.getCategoria()+".");
		System.out.println("|-----------------------------------------");
	}
	
	public void status() {
		System.out.println("|----------------------|");
		System.out.println("|Ao todo são: "+this.getTotalLutas()+" Lutas.|\n|Com "+this.getVitorias()+" Vitorias.      |"
				+ "\n|"+this.getEmpates()+" Empates.            |\n|E "+this.getDerrotas()+" Derrotas.         |");
		System.out.println("|----------------------|");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
		totalLutas++;
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
		totalLutas++;
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
		totalLutas++;
	}
}
