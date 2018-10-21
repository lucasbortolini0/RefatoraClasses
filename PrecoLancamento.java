public class PrecoLancamento extends Preco {

	@Override
	public int getPreco() {
		// TODO Auto-generated method stub
		return Filme.LANCAMENTO;
	}
	
	@Override
    public double getValor(int diasAluguel) {
          return diasAluguel * 3;
    }
	
	@Override
    public int getPontos(int diasAluguel) {
          if (diasAluguel > 1)
                 return 2;
          else
                 return super.getPontos(diasAluguel);
    }
}
