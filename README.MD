# JavaColections



O projeto tem como objetivo registrar e divulgar aprendizados sobre Java Collection , a partir do curso de mesmo nome da Dio . 

Cada código traz comentários para um maior entendimento do tema e sua implantação . 

O projeto esta estruturado em pacotes organizados segundo a collection em estudo : Lista, Conjuntos , Mapa e Fluxo  

Abaixo ume resumo conceitual de cada tema e sua impantação em Java . 

Collections : Uma **coleção** é <u>um objeto que pode agrupar outros objetos.</u> ... Algoritmos que são os métodos usados para realizar as tarefas propostas pelas interfaces, como ordenação, inserção e recuperação dos objetos armazenados.

- **List** coleção de objetos ordenados seqüêncialmente sob controle do usuário da lista;
  Esta interface é uma `Collection` ordenada que pode conter elementos duplicados. Quase como os arranjos( array) , as listas têm o elemento inicial no índice zero e, além dos métodos herdados da interface `Collection` esta interface fornece métodos específicos para manipular elementos usando os índices.
- **Set** Um conjunto que não pode ter elementos duplicados;
- **Queue** para a fila existem disciplinas específicas de inserção, acesso e remoção, e outras;
- **Map** é uma facilidade de acesso a objetos através de chaves, cada chave corresponde a um objeto; 

Conceitos uteis em Collections 

**Iterador** : é um padrão de projeto comportamental que permite a passagem sequencial através de uma estrutura de dados complexa sem expor seus detalhes internos. O Padrão Iterator encapsula as implementações das iterações, a partir de agora não precisamos mais ver que tipo de coleção está sendo utilizada pelos objetos como um ArrayList ou um HashTable. Com a utilização do Padrão Iterator precisamos apenas de um loop para lidarmos polimorficamente com qualquer coleção de itens desde que ela apenas implemente o Iterator..

**Padrão de projeto** : Também conhecidos como Design Patterns (em inglês) são soluções já encontradas, testadas e comprovadas e que podemos aplicar aos projetos sem ter que reinventar a roda. 





1. **Listas** 

   Conceito : Uma lista é uma <u>coleção de elementos do mesmo tipo</u> dispostos linearmente que

   podem ou não seguir determinada organização.  

**List** 

interface  ( elemento que proporciona uma ligação lógica entre dois sistemas ou partes de um sistema que não poderiam ser conectados diretamente).Sera possível criar varios objetos ( instanciar ) que herdem as caracteristaca de List . 

Principais Caracterisiticas :

- Elementos duplicados e garante ordem de inserção
- Ele contém os métodos baseados em índice para inserir, atualizar, excluir e pesquisar os elementos  Pode ter os elementos duplicados. 
- Pode armazenar elementos nulos

- Acesso posicional - manipula elementos com base em sua posição numérica na lista. Isso inclui métodos como get, set, add, addAll e remove.
- Pesquisar - pesquisa um objeto especificado na lista e retorna sua posição numérica. Os métodos de pesquisa incluem indexOf e lastIndexOf.
- Iteração - estende a semântica do Iterator para aproveitar a natureza sequencial da lista. Os métodos listIterator fornecem esse comportamento.
- Visualização por intervalo - O método sublist executa operações de intervalo arbitrárias na lista.



**ArrayList ou LinkedList**  

é a classe/método  que a implementa a List . Mecanisno disponibilizado para criarmos uma List.  



- ArrayList deve ser usado onde mais operações de pesquisa são necessáriasÉ a implementação de melhor desempenho .É basicamente uma matriz redimensionável e  fornece  muitos métodos úteis
- LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias

Qual usar ? 

Não há uma receita pronta aplicavel sempre, escolher estruturas de dados é uma tarefa complexa . A seguir um guia que pode lhe ajudar . 

- Se você planeja fazer mais operações get e add, além de remove, use ArrayList, pois a operação get consome muito recursos  em LinkedList. 
- Se você vai remover elementos e / ou inserir no meio (não no final) com frequência, você pode considerar  LinkedList porque essas operações consomem mais recursos  em ArrayList.
- Acessar os elementos sequencialmente (com um iterador), não terá perda de desempenho com LinkedList para obter os elementos



2. Conjuntos

   

   **Set**

representa grupos de elementos sem duplicatas, ou seja, são usados quando o programador não precisar ter nenhum dado duplicado na coleção.

Características - Set

- Velocidade na pesquisa de dados, sendo mais rápida que um objeto do tipo List;
- A inserção de dados é mais lenta;
- Permite trabalhar com conjuntos e pode ser implementado como instâncias das classes HashSet ou TreeSet;
- Não precisa especificar a posição para adicionar um elemento;
- Não aceita valores duplicados. Se caso inserir um registro que já tenha no Set não será adicionado




Um **HashSet** é implementado como uma tabela hash, uma matriz na qual os elementos são armazenados em uma posição derivada de seu conteúdo. Uma vez que as tabelas hash armazenam e recuperam elementos baseado em seu conteúdo, elas são bastante apropriadas para implementar as operações de Set . Por exemplo, para implementar contains(Object o), procuraríamos pelo elemento o e retornaríamos true se ele fosse encontrado. Esta classe permite o elemento null.

Esta classe oferece performance de tempo constante para as operações básicas (add, remove, contains e size), desde que a função hash disperse os elementos apropriadamente entre os buckets. A iteração pelos elementos requer um tempo proporcional à soma do tamanho do HashSet (quantidade de elementos) mais a capacidade da instância HashMap de apoio (número de buckets). Assim, é importante não definir a capacidade inicial muito alta se a performance de iteração for importante.







###### **Referencias** 

https://cibersistemas.pt/tecnologia/tutorial-de-metodos-de-lista-java-exemplo-de-api-de-lista-de-utilitarios/

[https://www.javatpoint.com/java-lis](https://www.javatpoint.com/java-list)

https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

http://www.javapractices.com/topic/TopicAction.do?Id=65

https://www.arquivodecodigos.com.br/dicas/1621-java-entendendo-a-classe-hashset.html

 http://www.linhadecodigo.com.br/artigo/3669/trabalhando-com-a-interface-set-no-java.aspx#ixzz7GAb3X8Mm

https://dcm.ffclrp.usp.br/~evandro/ibm1030/colecao/colec.html

https://www.devmedia.com.br/padrao-de-projeto-iterator-em-java/26733

