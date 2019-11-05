package entity;

public class Produto {

	private Integer idProduto;
	private String nomeProduto;
	private String tipoProduto;
	private String descricaoProduto;
	private Double valor;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idProduto, String nomeProduto, String tipoProduto, String descricaoProduto, Double valor) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.descricaoProduto = descricaoProduto;
		this.valor = valor;
	}

	public Integer getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", tipoProduto=" + tipoProduto
				+ ", descricaoProduto=" + descricaoProduto + ", valor=" + valor + "]";
	}

}
