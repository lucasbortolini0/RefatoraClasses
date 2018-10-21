public class Cliente {

    private String nome;
    private List<Aluguel> alugueis;

    public Cliente(String nome) {
        this.nome = nome;
        this.alugueis = new ArrayList<Aluguel>();
    }

    public void addAluguel(Aluguel aluguel) {
        this.alugueis.add(aluguel);
    }

    public String getNome() {
        return nome;
    }

    public String exibirRegistroAlugueis() {
        double valorTotal = 0;
        int pontos = 0;
        StringBuilder dados = new StringBuilder();
        dados.append("Registro de Alugueis do cliente: " + getNome() + "\n");
        for (Aluguel aluguel : this.alugueis) {
            double valor = 0;

            valor += aluguel.getValor();

            // Adiciona um ponto
            pontos += aluguel.getPontos();

            // Bônus para mais de dois dias com um lançamento
            if (aluguel.getFilme().getPreco() == Filme.LANCAMENTO
                    && aluguel.getDiasAluguel() > 1)
                pontos++;

            // Adiciona os dados desse aluguel
            dados.append("\t" + aluguel.getFilme().getTitulo() + "\t");
            dados.append(" = R$ " + String.valueOf(valor) + "\n");

            valorTotal += valor;
        }

        // Rodapé
        dados.append("Total gasto com alugueis: R$ " + String.valueOf(valorTotal) + "\n");
        dados.append("Pontos ganhos: " + String.valueOf(pontos));

        return dados.toString();
    }

}
