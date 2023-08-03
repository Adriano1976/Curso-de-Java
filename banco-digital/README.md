# Projeto Base: Criando um Banco Digital com Java e Orientação a Objetos

- Desenvolvendo um projeto em Java com a Digital Innovation One e Eliézer Zarpelão, contribuindo com o projeto do Banco Digital da Dio.

## Na Classe Banco foi feito uma implementação com uma variável private e final para receber o nome do Banco. 

- Já na Classe cliente foi implementado 3 variáveis, sendo 1 para receber o sobrenome e a outra para receber o cpf do cliente juntamente com o nome e sobrenome do mesmo. A outra variável pode ser usado para determinar se o cliente é de maior(18) ou não.

- Na Classe IFConta da interface Conta, foi adicionado os métodos imprimir saldo e imprimir extrato.

- Na Classe conta foi realizado a maior parte da contribuição e implementação, adicionando as variáveis limites, uma lista de valores e uma variável especial para armazenhar a data e hora atual do sistema onde será utilizada nos métodos imprimirSaldo e ImprimirExtrato. Nos métodos sacar, depositar e transferir foi utilizado a variável addValor para capturar cada valor de qualquer dessas transações e acumular em uma lista para ser mostradas posteriormente na hora de imprimir um extrato, que pode ser de uma conta corrente como também de uma conta poupança. Para corrigir alguns erros de valores negativos ou insufici, foi feito um tratamento para informar ao cliente sobre 'Saldo insuficiente'. Nos métodos imprimirInforGeral e imprimirExtratoGeral, está reunidos os dados e outros métodos para exitir os dados do cliente nos 2 métodos implementados.

- Nas classes ContaCorrente e ContaPoupanca foram usados a heraça da classe mãe Conta para subscrever os métodos imprimirSaldo e imprimirExtrato com as características de cada tipo de conta.

- Na Classe MainContas foram realizados testes por meio de instanciamentos onde foram criados 2 clientes onde cada um teria 1 conta corrente e 1 conta poupança com várias possibilidades de comportamanto das classes.
