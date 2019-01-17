package challenge;

public class State {

	private String name;
	private String uf;
	private Double extensao;
	
	public State(String name, String uf) {
		this.name = name;
		this.uf = uf;
	}

	public String getUf() {
		return null;
	}

	public String getName() {
		return null;
	}
	
	public Double getExtensao() {
		return extensao;
	}
	
	public void setExtensao(Double extensao) {
		this.extensao = extensao;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", uf=" + uf + ", extensao=" + extensao + "]";
	}
	
}
