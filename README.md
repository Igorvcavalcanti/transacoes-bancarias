# Sistema de Agência Bancária

## Descrição
Este projeto é um sistema de gerenciamento bancário simples desenvolvido em Java. Ele permite que os usuários realizem operações bancárias básicas, como criação de conta, depósitos, saques, transferências e listagem de contas cadastradas.

## Funcionalidades
- Criar conta bancária com nome, CPF e e-mail do cliente.
- Depositar valores em contas existentes.
- Realizar saques, respeitando o saldo disponível.
- Transferir valores entre contas.
- Listar todas as contas cadastradas.
- Encerrar a aplicação de forma segura.

## Tecnologias Utilizadas
- Linguagem: Java
- IDE recomendada: Visual Studio Code, IntelliJ IDEA ou Eclipse
- Estrutura de dados: ArrayList para armazenar contas

## Como Executar o Projeto
1. Certifique-se de ter o Java instalado em sua máquina. Caso não tenha, faça o download [aqui](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/agencia-bancaria.git
   ```
3. Navegue até o diretório do projeto:
   ```sh
   cd agencia-bancaria
   ```
4. Compile o código-fonte:
   ```sh
   javac Programa/AgenciaBancaria.java
   ```
5. Execute o programa:
   ```sh
   java Programa.AgenciaBancaria
   ```

## Melhorias Futuras
- Implementar persistência de dados com banco de dados.
- Criar uma interface gráfica para facilitar o uso.
- Adicionar autenticação de usuários.
- Melhorar o tratamento de erros e validação de dados.

## Contribuição
Se desejar contribuir com melhorias, siga estas etapas:
1. Faça um fork deste repositório.
2. Crie uma branch para sua funcionalidade:
   ```sh
   git checkout -b minha-feature
   ```
3. Faça o commit das suas alterações:
   ```sh
   git commit -m "Adicionando nova funcionalidade"
   ```
4. Envie para o repositório remoto:
   ```sh
   git push origin minha-feature
   ```
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a [MIT License](LICENSE).

