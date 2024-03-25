# Projeto Biblioteca - Livro - Autor - melhorado

### Exercício 
- Biblioteca, Livro e Autor: crie uma classe Biblioteca que tem uma lista de atributos livro e os métodos para adicionar e remover livros da biblioteca. A classe livro, por sua vez, possui dentro de si os atributos titulo e Autor; 

- Este projeto é mais coerente com o que o exercício pede
- Sem contar que ele é mais modularizado

## Getting started
- Clone o projeto e estude em seu computador
- Faça algumas alterações e teste, assim que a gente aprende
- Finalmente, tente melhorá-lo e criar algumas funcionalidades na função main.

### Menu de funcionamento do Projeto Biblioteca-Livro-Autor

```bash
----------- Biblioteca IFET ------------
	1 - Inserir livro
	2 - Remover livro
	3 - Pesquisar livro (titulo)
	4 - Pesquisar livro (autor)
	5 - Pesquisar Autor (cidadeNatal)
	6 - Listar todos os livros 
	0 - Sair
	-----------------------------------------
	Escolha uma opção:
```

### 1 - Inserir Livro

```bash
Escolha uma opção:1

--------- Preenchendo os dados de livro -------- 
Informe o titulo: **livro01**
Informe o numero de paginas: **40**
Informe o preco: **100,00**
--------- Preenchendo os dados do Autor -------- 
Informe o nome: **Deitel**
Informe a cidade: **BeloHorizonte**
Existe mais autores neste livro (s/n) ? **s**
--------- Preenchendo os dados do Autor -------- 
Informe o nome: **Jose**
Informe a cidade: **Vicosa**
Existe mais autores neste livro (s/n) ? **n**
```

### 2 - Remover Livro

```bash
---------- Biblioteca IFET ------------
	1 - Inserir livro
	2 - Remover livro
	3 - Pesquisar livro (titulo)
	4 - Pesquisar livro (autor)
	5 - Pesquisar Autor (cidadeNatal)
	6 - Listar todos os livros 
	0 - Sair
	-----------------------------------------
	Escolha uma opção:2

Informe o titulo:livro01
Removido com sucesso!
```

### 3 - Pesquisar Livro (titulo)

```bash
Escolha uma opção:3

Informe o titulo:livro01
Livro encontrado
------------------------
Titulo:livro01
Paginas:40
Preço:100.0
Autor(es):
------------------------
Nome:Deitel
Cidade Natal:BeloHorizonte
------------------------
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
```

### 4 - Pesquisar Livro (autor)

```bash
Escolha uma opção:4
Informe o autor: Jose
Autor encontrado
------------------------
Titulo:livro01
Paginas:40
Preço:100.0
Autor(es):
------------------------
Nome:Deitel
Cidade Natal:BeloHorizonte
------------------------
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
------------------------
Autor encontrado
------------------------
Titulo:livro02
Paginas:55
Preço:123.5
Autor(es):
------------------------
Nome:Carlos
Cidade Natal:SaoPaulo
------------------------
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
```

### 5 - Pesquisar Livro (cidade natal)

```bash
Escolha uma opção:5

Informe a cidade natal:
Vicosa
Autor encontrado
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
Autor encontrado
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
```

### 6 - Listar todos os livros

```bash
Escolha uma opção:6
------------------------
Titulo:livro01
Paginas:40
Preço:100.0
Autor(es):
------------------------
Nome:Deitel
Cidade Natal:BeloHorizonte
------------------------
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
------------------------
------------------------
Titulo:livro02
Paginas:55
Preço:123.5
Autor(es):
------------------------
Nome:Carlos
Cidade Natal:SaoPaulo
------------------------
------------------------
Nome:Jose
Cidade Natal:Vicosa
------------------------
```
	
