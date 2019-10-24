package entity;

public class Pedido {
	
	private Integer idPedido;
	private String tipoDePedido;
	private Double valorTotal;
	private String horaPedido;
	private Produto listaDeProdutos;
	private Cliente cliente;
	private Usuario usuario;
	private String observacao;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer idPedido, String tipoDePedido, Double valorTotal, String horaPedido, Produto listaDeProdutos,
			Cliente cliente, Usuario usuario, String observacao) {
		super();
		this.idPedido = idPedido;
		this.tipoDePedido = tipoDePedido;
		this.valorTotal = valorTotal;
		this.horaPedido = horaPedido;
		this.listaDeProdutos = listaDeProdutos;
		this.cliente = cliente;
		this.usuario = usuario;
		this.observacao = observacao;
	}


	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public String getTipoDePedido() {
		return tipoDePedido;
	}

	public void setTipoDePedido(String tipoDePedido) {
		this.tipoDePedido = tipoDePedido;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getHoraPedido() {
		return horaPedido;
	}

	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}

	public Produto getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(Produto listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", tipoDePedido=" + tipoDePedido + ", valorTotal=" + valorTotal
				+ ", horaPedido=" + horaPedido + ", listaDeProdutos=" + listaDeProdutos + ", cliente=" + cliente
				+ ", usuario=" + usuario + ", observacao=" + observacao + "]";
	}
	
}
