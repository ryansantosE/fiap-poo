//package br.com.fiapride.model;
//
//// A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
//public class Passageiro {
//    // Atributos (Características)
//    public String nome;
//    public double saldo; 
//    // Nota: Por enquanto usamos 'public' para facilitar o aprendizado.
//    // Nas próximas aulas, aprenderemos a proteger esses dados.
//}
//
//public class Passageiro {
//	private String nome;
//	private String cpf; // Novo Atributo
//	private double saldo;
//
//	  // CONSTRUTOR (Obrigatório no Nascimento)
//    // Para criar um passageiro, agora é OBRIGATÓRIO informar nome e cpf.
//    public Passageiro(String nome, String cpf) {
//        this.setNome(nome);
//        this.setCpf(cpf);
//        this.setSaldo(0); // Todo mundo começa com zero!
//    }
//
//    // Método para PEGAR o saldo (Leitura)
//    public double getSaldo() {
//        return this.saldo; // Apenas devolve o valor, não altera nada.
//    }
//
//    // Método para DEFINIR o saldo (Escrita com Regra de Negócio!)
//    private void setSaldo(double valor) {
//        if (valor >= 0) {
//            this.saldo = valor;
//        } else {
//            System.out.println("Erro de Segurança: Tentativa de definir saldo negativo bloqueada!");
//        }
//    }
//
//    // Faça o mesmo para o nome (sem regras complexas por enquanto)
//    public String getNome() {
//        return this.nome;
//    }
//
//    private void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    // Faça o mesmo para o cpf (sem regras complexas por enquanto)
//    public String getCpf() {
//        return this.cpf;
//    }
//
//    private void setCpf(String cpf) {
//        this.cpf = cpf;
//    }