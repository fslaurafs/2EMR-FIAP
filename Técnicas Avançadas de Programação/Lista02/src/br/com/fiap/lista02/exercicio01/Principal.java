package br.com.fiap.lista02.exercicio01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do aluno: "));
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		
		Aluno aluno = new Aluno(matricula, nome);
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da prova 1: "));
		aluno.setProva1(nota);
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da prova 2: ")); //reutilizou a variavel
		aluno.setProva2(nota);
		
		nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota do trabalho: ")); // reutilizou a variavel
		aluno.setTrabalho(nota);
		
		double media = aluno.calculaMedia();
		double avaliacaoFinal = aluno.notaParaAvaliacaoFinal();
		
		DecimalFormat formataNota = new DecimalFormat("#0.0");
		
		String resultado = "O aluno " + aluno.getNome() + " ficou com a media de " + formataNota.format(media) +
				" pontos. \n";
		resultado += avaliacaoFinal == 0 ? "E ele nao precisa efetuar a avaliacao final." : "Ele precisa de " +
				formataNota.format(avaliacaoFinal) + " pontos para conseguir ser aprovado.";
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
