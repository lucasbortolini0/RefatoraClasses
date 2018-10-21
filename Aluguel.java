public  class  Aluguel {
    private  Filme Filme;
    privado  int diasAluguel;

    público  Aluguel ( Filme  filme , int  diasAluguel ) {
        isso . filme = filme;
        isso . diasAluguel = diasAluguel;
    }

    pública  Filme  getFilme () {
        devolver filme;
    }

    public  int  getDiasAluguel () {
        return diasAluguel;
    }

    public  double  getValor () {
        retornar filmes . getValor (diasAluguel);
    }

    public  int  getPontos () {
        retornar filmes . getPontos (diasAluguel);
    }
}
