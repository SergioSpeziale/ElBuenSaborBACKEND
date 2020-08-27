package com.example.demo.entity;
	
	import java.io.Serializable;
	import java.util.Date;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
	import javax.persistence.JoinColumn;
    import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
	public class DetallePedido extends EntidadGenerica implements Serializable{
		private static final long serialVersionUID = 1L;

		@Column(name = "Cantidad")
		private int cantidad;
		
		@Column(name = "Subtotal")
		private double subtotal;
		
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name = "id_pedido")
		private Pedido pedido;
		
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinColumn(name = "id_articuloConsumo")
		private ArticuloConsumo articuloConsumo;
		

		public DetallePedido() {
			super();
		}		
		
		public DetallePedido(int cantidad, double subtotal, Pedido pedido, ArticuloConsumo articuloConsumo) {
			super();
			this.cantidad = cantidad;
			this.subtotal = subtotal;
			this.pedido = pedido;
			this.articuloConsumo = articuloConsumo;
		}

		public DetallePedido(int cantidad, double subtotal) {
			super();
			this.cantidad = cantidad;
			this.subtotal = subtotal;
		}

		public DetallePedido(int cantidad, double subtotal, Pedido pedido) {
			super();
			this.cantidad = cantidad;
			this.subtotal = subtotal;
			this.pedido = pedido;	
		}

		
		
		//GETTERS Y SETTERS ------------------------------------------------------------------------
		
		public ArticuloConsumo getArticuloConsumo() {
			return articuloConsumo;
		}



		public void setArticuloConsumo(ArticuloConsumo articuloConsumo) {
			this.articuloConsumo = articuloConsumo;
		}



		public int getCantidad() {
			return cantidad;
		}



		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}



		public double getSubtotal() {
			return subtotal;
		}



		public void setSubtotal(double subtotal) {
			this.subtotal = subtotal;
		}



		public Pedido getPedido() {
			return pedido;
		}



		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}

		
		
}
