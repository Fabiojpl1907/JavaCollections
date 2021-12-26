# JavaColections





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



refrencias 
https://cibersistemas.pt/tecnologia/tutorial-de-metodos-de-lista-java-exemplo-de-api-de-lista-de-utilitarios/

[https://www.javatpoint.com/java-lis](https://www.javatpoint.com/java-list)

https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

http://www.javapractices.com/topic/TopicAction.do?Id=65
