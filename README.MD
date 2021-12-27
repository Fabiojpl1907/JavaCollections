# JavaColections



O projeto tem como objetivo registrar e divulgar aprendizados sobre Java Collection , a partir do curso de mesmo nome da Dio . 

Cada código traz comentários para um maior entendimento do tema e sua implantação . 

O projeto esta estruturado em pacotes organizados segundo a collection em estudo : Lista, Conjuntos , Mapa e Fluxo  

Abaixo um resumo conceitual de cada tema e sua implantação em Java . 

**A. Collections**

Collections é : Uma **coleção** é <u>um objeto que pode agrupar outros objetos.</u> ... 

São usadas para armazenar, recuperar, manipular e comunicar dados/objetos armazenados

Normalmente, representam itens de dados que formam um grupo natural, como :
			uma mão de truco (uma coleção de cartas), 
			uma pasta em um notebook  (uma coleção de arquivos) 
			uma lista de produtos (um mapeamento de produtos e seus preços, descrição , etc )

​	A1. Estrutura de Collections

Estrutura de coleções:  é uma arquitetura unificada para representar e manipular coleções. 
Todas as estruturas de coleções contêm o seguinte:

- **Interfaces:** são tipos de dados abstratos que representam coleções. As interfaces permitem que as coleções sejam manipuladas independentemente dos detalhes de sua representação.
- **Implementações:** São as implementações concretas das interfaces de coleção ( realizam a criação ) . Em essência, eles são estruturas de dados reutilizáveis.
- **Algoritmos:** Em essência, os algoritmos são funcionalidades reutilizáveis [ add(), remove(), isempty(), sort() , etc ] são os métodos que realizam ações úteis, como pesquisa e classificação, em objetos que implementam interfaces de coleção. Os algoritmos são considerados *polimórficos* : ou seja, o mesmo método pode ser usado em muitas implementações diferentes da interface de coleção apropriada, por exemplo add() pode ser usado para inseriir um novo dado/objeto em objeto List ou Set ( lista.add() -  conjunto.add() )

```
Dados abstratos - um modelo matemático que esconde (encapsula) um modelo de dados também um conjunto de procedimentos que atuam diretamente e com exclusividade sobre os dados encapsulados.
```



- **List** : coleção de objetos ordenados seqüêncialmente,sob controle do usuário da lista. As principais carcterísticas são 

  - Elementos duplicados e garante ordem de inserção
  - Ele contém os métodos baseados em índice para inserir, atualizar, excluir e pesquisar os elementos  
  - Pode armazenar elementos nulos
  - As listas têm o elemento inicial no índice zero 
  -  O usuário de a `List`geralmente tem controle preciso sobre onde na lista cada elemento é inserido e pode acessar os elementos por seu índice inteiro (posição).
  - Acesso posicional - manipula elementos com base em sua posição numérica na lista. Isso inclui métodos como get, set, add, addAll e remove.
  - Pesquisar - pesquisa um objeto especificado na lista e retorna sua posição numérica. Os métodos de pesquisa incluem indexOf e lastIndexOf.
  - Iteração - estende a semântica do Iterator para aproveitar a natureza sequencial da lista. Os métodos listIterator fornecem esse comportamento.
  - Visualização por intervalo - O método sublist executa operações de intervalo arbitrárias na lista.

- **Set** : uma coleção que não pode conter elementos duplicados. Essa interface modela a abstração matemática do conjunto e é usada para representar conjuntos, como as cartas que compõem uma mão de pôquer ( em um baralho não há 2 cartas iguais) , os cursos que compõem a programação de um aluno( um aluno não pertence a determinad curso 2x ) ou os processos em execução em uma máquina ( uma maquina não executa o mesmo processo ao mesmo tempo 2x ) 

  

- **Queue**uma coleção usada para conter vários elementos antes do processamento. Além das `Collection`operações básicas , a `Queue`fornece operações adicionais de inserção, extração e inspeção. O Objetivo da Queue é gerenciar ( enfileirar ) uma sequência da dados /objetos de forma que estejam na posição correta a serem consumidos por uma ação, por exemplo,  em uma fila de pessoas comprando em um site de e-commerce, o primeiro a ser atendido pela api de pagamento, seja a primeira posição da fila . 

  ```
  As filas normalmente, mas não necessariamente, ordenam os elementos de maneira FIFO (primeiro a entrar, primeiro a sair). Entre as exceções estão as filas de prioridade, que ordenam os elementos de acordo com um comparador fornecido ou a ordem natural dos elementos. Qualquer que seja a ordem usada, o chefe da fila é o elemento que seria removido por uma chamada para `remove`ou `poll`. Em uma fila FIFO, todos os novos elementos são inseridos no final da fila. Outros tipos de filas podem usar regras de posicionamento diferentes. Cada `Queue`implementação deve especificar suas propriedades de ordenação.
  ```

  

- **Map** é uma facilidade de acesso a objetos através de chaves, cada chave corresponde a um objeto; não pode conter chaves duplicadas; cada chave pode ser mapeada para no máximo um valor. 

  Exemplo : 
  Modelar objetos do mundo real é uma tarefa comum na programação orientada a objetos, então é razoável pensar que alguns programas podem, por exemplo, agrupar ( mapear) funcionários por departamento, e eventualmente verificar qual o total de salário daquele departamento 
  Departamento Logistica tem os funcionarios Maria , Joana , Pedro e João

  e onde cada funcionario tenha um salário. O Mapeamento de salarios dos funcionarios que pertence ao departamento dará o toal de salário do departamento. 



Conceitos uteis em Collections 

**Iterador** : é um padrão de projeto comportamental que permite a passagem sequencial através de uma estrutura de dados complexa sem expor seus detalhes internos. O Padrão Iterator encapsula as implementações das iterações, a partir de agora não precisamos mais ver que tipo de coleção está sendo utilizada pelos objetos como um ArrayList ou um HashTable. Com a utilização do Padrão Iterator precisamos apenas de um loop para lidarmos polimorficamente com qualquer coleção de itens desde que ela apenas implemente o Iterator..

**Padrão de projeto** : Também conhecidos como Design Patterns (em inglês) são soluções já encontradas, testadas e comprovadas e que podemos aplicar aos projetos sem ter que reinventar a roda. 



**Implementações de  Collections** 

**List ->** **ArrayList ou LinkedList**  

é a classe/método  que a implementa a List . Mecanisno disponibilizado para criarmos uma List.  



- ArrayList deve ser usado onde mais operações de pesquisa são necessáriasÉ a implementação de melhor desempenho .É basicamente uma matriz redimensionável e  fornece  muitos métodos úteis
- LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias

Qual usar ? 

Não há uma receita pronta aplicavel sempre, escolher estruturas de dados é uma tarefa complexa . A seguir um guia que pode lhe ajudar . 

- Se você planeja fazer mais operações get e add, além de remove, use ArrayList, pois a operação get consome muito recursos  em LinkedList. 
- Se você vai remover elementos e / ou inserir no meio (não no final) com frequência, você pode considerar  LinkedList porque essas operações consomem mais recursos  em ArrayList.
- Acessar os elementos sequencialmente (com um iterador), não terá perda de desempenho com LinkedList para obter os elementos



Set -> **HashSet** / **LinkedHashSet / TreeSet**

- **HashSet** :  é implementado como uma tabela hash, uma matriz na qual os elementos são armazenados em uma posição derivada de seu conteúdo. Uma vez que as tabelas hash armazenam e recuperam elementos baseado em seu conteúdo, elas são bastante apropriadas para implementar as operações de Set . O HashSet é o mais rápido de todos, não importa o quanto é  adicionado, removido, retirado, o tempo de execução sempre será o mesmo. E isso é extremamente crítico em processos onde temos uma situação crítica com milhões de dados a serem inseridos em um Set. Porem a  ordem dos elementos inseridos não é mantida, ou seja, esse tipo de estrutura é indicada se você precisa garantir a alta performance sem se importar com a ordem com que os elementos estão ordenados.
- **LinkedHashSet** :  O LinkedHashSet faz uso também do HashTable com linked list, assim :  Os elementos continuam na ordem que são inseridos. 
- **TreeSet** : implementa um algoritmo conhecido por red-black tree ou árvore rubro-negra. Sua principal característica é que ele é o único Set que permite retorna os elementos ordenados automaticamente , na ordem natural ( do menor para o maior , de A para Z ) , independente da ordem que você inserir os elementos, eles serão ordenados. Devida isto operaçãoe de inclusão e remoção por exemplos serão uito mais demoradas do que na implementação HashSet . 



###### **Referencias** 

https://cibersistemas.pt/tecnologia/tutorial-de-metodos-de-lista-java-exemplo-de-api-de-lista-de-utilitarios/

[https://www.javatpoint.com/java-lis](https://www.javatpoint.com/java-list)

https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

http://www.javapractices.com/topic/TopicAction.do?Id=65

https://www.arquivodecodigos.com.br/dicas/1621-java-entendendo-a-classe-hashset.html

 http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz7GAb3X8Mm

https://dcm.ffclrp.usp.br/~evandro/ibm1030/colecao/colec.html

https://www.devmedia.com.br/padrao-de-projeto-iterator-em-java/26733

https://docs.oracle.com/javase/tutorial/collections/index.html

https://www.computersciencemaster.com.br/entenda-o-que-e-um-tipo-abstrato-de-dados/

https://www.devmedia.com.br/diferencas-entre-treeset-hashset-e-linkedhashset-em-java/29077



https://dzone.com/articles/equals-and-hashcode-dummies



Entry ??
