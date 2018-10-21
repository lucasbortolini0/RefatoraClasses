public class PrecoNormal extends Preco {

	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return Filme.NORMAL;
	}
	
	@Override
    public double getValor(int diasAluguel) {
          double valor = 1.5;
          if (diasAluguel > 3)
                 valor += (diasAluguel - 3) * 1.5;
          return valor;
    } 
}
