package doxa.version2.compiler.tree.expression;

import doxa.version2.compiler.tree.Tipo;

public class ExpUnaria implements Expressao {
	private Expressao expr;
	private String operacao;

	public ExpUnaria(String operacao, Expressao expr) {
		this.operacao = operacao;
		this.expr = expr;
	}

	
	@Override
	public Boolean verificarSemantica() {
		return null;
	}

	@Override
	public Tipo getTipo() {
		return null;
	}
	
	
	
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}
}