package com.empresa;

public class Conta {
	String nome;
	double saldo;
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void depositar(int valor) throws Exception{	//quem chamar o método sacar tem que tratar da exceção, ou seja, colocar dentro de um bloco try catch finally. Com exceção da throw RuntimeException()
		if(valor<=0){
			throw new Exception("Ocorreu um erro");
			//throw new RuntimeException("Ocorreu um erro");
		}
		saldo += valor;
		//saldo = saldo+valor;
	}
	public void sacar(int valor) throws Exception{
		if(valor>saldo) {
			throw new Exception("Saldo insuficiente!");
			//throw new RuntimeException("Saldo insuficiente");
		}
		else if(valor<0) {
			throw new RuntimeException("Valor invalido");
		}
		saldo -= valor;
		//saldo = saldo-valor;
	}
	public void info() {
		System.out.println("----------");
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
	}
}
