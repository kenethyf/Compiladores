package doxa.version2.compiler.tree;

import doxa.version2.compiler.tree.command.Bloco;
import symbolTable.SymbolTable;

public class DeclFuncao implements DeclGlobal {
	private NomeComArgumentos nomesParams;
	private Bloco bloco;
	private Tipo tipo;
	
	public DeclFuncao(NomeComArgumentos assinatura, Tipo tipo, Bloco bloco) {
		this.nomesParams = assinatura;
		this.bloco = bloco;
		this.tipo = tipo;
	}
	
	public DeclFuncao(NomeComArgumentos assinatura, Bloco bloco) {
		this.nomesParams = assinatura;
		this.bloco = bloco;
	}

	@Override
	public Boolean verificarSemantica() {
		// verificar se ja foi  declarada
		if (SymbolTable.getInstance().nameExists(nomesParams.getId())){
			System.out.println("Fun��o com mesmo nome j� declarada.");
			return false;
		}else {
			SymbolTable.getInstance().putGlobal(nomesParams.getId(), this);
			System.out.println(nomesParams.getId());
		}
		return true;
	}

	@Override
	public String gerarCodigoIntermediario(String filename) {
		return null;
	}

}
