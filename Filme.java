public  class  Filmes {

    public  static  final  int  NORMAL  =  0 ;
    public  static  final  int  INFANTIL  =  1 ;
     final estático  público int LANCAMENTO = 2 ;    

     String titulo privado ;
    privadas  preco preco;

     Filmes públicos ( String  titulo , int  preco ) {
        isso . titulo = titulo;
        setPreco (preco);
    }

    public  int  getPreco () {
        retornar preco . getPreco ();
    }

    public  void  setPreco ( int  preco ) {
        interruptor (preco) {
        caso de  filmes . NORMAL :
               isso . preco =  novo  PrecoNormal ();
               pausa ;
        caso de  filmes . INFANTIL :
               isso . preco =  novo  PrecoInfantil ();
               pausa ;
        caso de  filmes . LANCAMENTO :
               isso . preco =  novo  PrecoLancamento ();
               pausa ;
        padrão :
               lançar o  novo  IllegalArgumentException ( " Código de Preço inválido " );
        }
    }

    public  String  getTitulo () {
        retorno titulo;
    }

     duplo  getValor público ( int  diasAluguel ) {
        retornar preco . getValor (diasAluguel);
    }

    public  int  getPontos ( int  diasAluguel ) {
        retornar preco . getPontos (diasAluguel);
    }
}
