package challenge;

import java.math.BigDecimal;
import java.util.List;

public class State {

	private String name;
	private String uf;
	private BigDecimal extensao;
	
	public State(String name, String uf, BigDecimal extensao) {
		this.name = name;
		this.uf = uf;
		this.extensao = extensao;
	}

	public String getUf() {
		return null;
	}

	public String getName() {
		return null;
	}
	
	public BigDecimal getExtensao() {
		return extensao;
	}
}
