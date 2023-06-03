public class Acao extends InstrumentoFinanceiro{
	private int cotas;
	
	public void setCotas(int cotas) {
		this.cotas = cotas;
	}

	//@Override
    public float calcularSaldoTotal() {
		return cotas * getSaldo();
    }
}