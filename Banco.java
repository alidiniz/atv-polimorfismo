public class Banco {
	private InstrumentoFinanceiro[] instrumentos;
	private int numInstrumentos;
	
	public Banco(int numInstrumentos) {
		this.numInstrumentos = numInstrumentos;
		this.instrumentos = new InstrumentoFinanceiro[numInstrumentos];
	}
	
	public void adicionar(InstrumentoFinanceiro instrumento) {
		if(numInstrumentos > 0) {
			instrumentos[numInstrumentos - 1] = instrumento;
			numInstrumentos--;
		} else {
			System.out.println("Não é possível adicionar mais instrumentos.");
		}
	}

    public float calcularSaldos() {
        float saldoTotal = 0.0f;
        for(InstrumentoFinanceiro instrumento : instrumentos) {
        	saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }

    public static void main(String[] args) {
    	Banco banco = new Banco(3);

        Acao acao = new Acao();
        acao.setSaldo(10.0f);
        acao.setCotas(5);
        banco.adicionar(acao);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(100.0f);
        contaCorrente.setLimite(200.0f);
        banco.adicionar(contaCorrente);

        FundoDeAplicacao fundoDeAplicacao = new FundoDeAplicacao();
        fundoDeAplicacao.setSaldo(1000.0f);
        fundoDeAplicacao.setRentabilidade(50.0f);
        banco.adicionar(fundoDeAplicacao);

        float saldoTotal = banco.calcularSaldos();
        System.out.println("Saldo total: " + saldoTotal);

    }
}
