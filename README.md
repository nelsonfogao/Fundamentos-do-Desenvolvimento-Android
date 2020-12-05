# tp 03 - Fundamentos do Desenvolvimento Android

Neste TP, você deverá fazer um aplicativo para Análise de perfil de investidor. Quando uma pessoa deseja realizar investimentos por intermédio de um banco ou uma corretora, é comum que ela tenha que preencher um questionário para avaliar o seu perfil de investidor, de modo que ela possa ser orientada para investimentos mais adequados ao seu momento de vida, patrimônio e propensão/tolerância ao risco. O Banco Paulista disponibilizou o seu questionário e metodologia online, por isso, nós o utilizaremos como base para este trabalho:

Questionário para Perfil de Investidor (Banco Paulista)

O seu app deve ter no mínimo 3 Activities:

Activity que controla a tela inicial, onde há uma explicação da função do app, um campo de texto para o usuário inserir o seu nome e um botão para iniciar o teste.
Activity que apresenta as perguntas do formulário de análise de perfil de investidor, seguindo a metodologia do Banco Paulista, conforme o arquivo presente no link acima.
Activity de resultado, que exibe o nome do usuário e o seu perfil de investidor.
Observações importantes:

A Activity de perguntas deve exibir cada pergunta em um fragmento que é substituído em tempo de execução, após a resposta do usuário.

É obrigatório o uso do Grafo de Navegação (Navigation Graph) para transições entre fragmentos.

Perceba que a pontuação de cada resposta encontra-se ao final do documento que descreve as perguntas. Você deve armazenar as respostas do usuário e somar o total de pontos.

As perguntas 8 e 9 devem ser ignoradas. Para manter o cálculo adequado, atualize os limites de pontuação de cada perfil para: Conservador <= 12; 13 <= Moderado <= 29; Arrojado >= 30.
Perfil

Pontos

Conservador

até 12 pontos

Moderado

de 13 a 29 pontos, inclusive

Arrojado

a partir de 30 pontos

Como não somos os criadores da metodologia, é importante que em algum lugar do app esteja discriminada a referência ao Banco Paulista. Não há nenhuma propaganda em relação a este banco, apenas foi escolhido um formulário que estivesse disponível online juntamente com o processo de cálculo do perfil. Você pode colocar essa referência como um pequeno texto na tela inicial (ex: "Metodologia adaptada do questionário do Banco Paulista") ou escrever uma tela de "Sobre" com essa informação. É importante deixar isso claro para não incorrer em algo como plágio!

Não deixe de lado características de acabamento e usabilidade que são comuns aos aplicativos que as pessoas estão acostumadas a usar. Um exemplo de App que atende aos requisitos listados pode ser visto neste vídeo do Youtube:
