package ancestral;

public abstract class BaseGenericService<R> {

	protected R repositorio;
	
	protected String nomeUnidade;

	public BaseGenericService(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}
	
}
