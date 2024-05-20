Informática
Professor: Alex
Aluno: Ernani S. sousa

Pesquisa sobre react.js

1 - Resuma seu entendimento sobre React js, o que é?
Resposta:
O React é uma biblioteca JavaScript declarativa, eficiente e flexível para criar interfaces com o usuário.
Ele permite compor UIs complexas a partir de pequenos e isolados códigos chamados “componentes”.

2 - Eleja 3 facilidades relacionadas ao seu trabalho de conclusão, caso não tenha definido, pesquise em
foruns fazendo relação com suas criações futuras.
Resposta:

- Componentização: React.js permite que os desenvolvedores dividam a interface do usuário em componentes reutilizáveis.
  Isso simplifica o desenvolvimento, manutenção e escalabilidade do código, pois cada componente pode ser desenvolvido,
  testado e mantido de forma independente. Além disso, o conceito de componentização promove uma arquitetura mais organizada e modular.

- Virtual DOM: O React.js utiliza um conceito chamado Virtual DOM, que é uma representação virtual da árvore de elementos
  do DOM (Document Object Model). Isso permite que o React atualize eficientemente apenas as partes necessárias da interface
  do usuário em resposta a mudanças de estado, em vez de recriar todo o DOM a cada atualização. Isso resulta em melhor desempenho
  e uma experiência de usuário mais responsiva.

- JSX (JavaScript XML): React introduz o JSX, uma extensão de sintaxe JavaScript que permite escrever marcação XML dentro do
  código JavaScript. Isso facilita a criação e manutenção de interfaces de usuário, pois permite que os desenvolvedores combinem
  lógica JavaScript com marcação HTML de uma maneira mais intuitiva e legível. Além disso, o JSX é compilado para JavaScript puro
  durante o processo de construção, o que ajuda a evitar erros de sintaxe e fornece verificação de tipo estática.

3 - Com base no seu entendimento descreva a estrutura dos arquivos e componentes em um ambiente que utiliza React JS.
Resposta:
Em um ambiente típico que utiliza React.js, a estrutura de arquivos e componentes pode variar dependendo das preferências
da equipe de desenvolvimento e das necessidades do projeto. No entanto, uma estrutura comum pode incluir os seguintes elementos:

- Pasta src (source): Esta pasta contém todos os arquivos fonte do projeto React.js.

- Arquivo index.js: Este é o ponto de entrada do aplicativo React. Ele geralmente renderiza o componente principal do aplicativo na DOM.

- Pasta components: Esta pasta geralmente contém todos os componentes React reutilizáveis. Cada componente React é geralmente definido em seu próprio arquivo, embora componentes menores possam ser agrupados em arquivos relacionados.

- Pasta assets (ativos): Esta pasta pode conter arquivos estáticos, como imagens, fontes, estilos CSS ou arquivos de internacionalização.

- Arquivos de configuração: O projeto pode conter vários arquivos de configuração, como package.json, webpack.config.js, .babelrc, etc., dependendo das ferramentas e bibliotecas utilizadas no desenvolvimento.

- Pasta pages (páginas): Se o projeto for uma aplicação com várias páginas, pode haver uma pasta separada para as páginas individuais. Cada página pode ter seu próprio conjunto de componentes, estilos e lógica específica da página.

- Pasta utils (utilitários): Esta pasta pode conter funções auxiliares, constantes ou utilitários que são compartilhados em todo o projeto.

- Pasta context (contexto): Se o projeto utiliza o Context API do React para gerenciar o estado global, pode haver uma pasta separada para os provedores de contexto e seus consumidores.

- Pasta hooks: Se o projeto utiliza hooks personalizados, eles podem ser definidos em uma pasta separada.

A estrutura acima é uma abordagem comum, mas pode variar dependendo das preferências da equipe e das necessidades do projeto. O importante é manter uma estrutura organizada que facilite a manutenção, escalabilidade e colaboração no projeto.
