# PharmaEaseTotem-API
API do projeto PharmaEaseTotem - Facilitando o Acesso a Medicamentos

# Equipe de Desenvolvimento:
Arthur Mitsuo Yamamoto -> rm551283 -> Responsabilidades Materias -> (.NET, DEVOPS, QA, MOBILE)

Ramon Cezarino Lopez -> rm551279 -> Responsabilidades Materias -> (JAVA)

Luigi Ye -> rm552213 -> Responsabilidades Materias -> (IA)

Enzo Lafer Gallucci -> rm551111 -> Responsabilidades Materias -> (BANCO DE DADOS)

Daniel dos Santos Araujo Faria -> rm99067 -> Responsabilidades Materias -> (MOBILE, QA)

**Cronograma de Desenvolvimento - PharmaEaseTotem**
---

**1. Definição das Atividades e Responsabilidades:**

- **Luigi Ye**:
  - Desenvolvimento do backend para operações relacionadas ao 'Carrinhos'.
- **Daniel dos Santos Araujo Faria**:
  - Desenvolvimento do backend para operações relacionadas ao 'Cliente' e 'Pedido'.
- **Enzo Lafer Gallucci**:
  - Desenvolvimento do backend para operações relacionadas 'Remedio'.
- **Ramon Cezarino Lopez**:
  - Revisão de código.
- **Arthur Mitsuo Yamamoto**:
  - Documentação e gerenciamento de projetos.

---

**2. Cronograma de Desenvolvimento:**

**Semana 1:**
- **Luigi Ye**:
  - Implementação de 'Carrinhos'.
- **Daniel**:
  - Implementação de 'Cliente' e 'Pedido'.
- **Enzo**:
  - Implementação de 'Remedio'.

**Semana 2:**
- **Luigi Ye**:
  - Testes e correções no carrinho.
- **Daniel**:
  - Testes e correções no cliente e no pedido.
- **Enzo**:
  - Testes e correções no remédio.

**Semana 3:**
- **Ramon e Arthur Mitsuo Yamamoto**:
  - Revisão de código.
- **Arthur Mitsuo Yamamoto**:
  - Preparação da documentação técnica e do cronograma.

---

## Instrução de como rodar a aplicação
1- Primeira coisa que precisamos fazer é clonar o repositório em sua máquina local.

2- Abra o repositório: https://github.com/ArthurMitsuoYamamoto/PharmaEaseTotem.git.

3- Agora que você tem o link do GitHub, precisa abrir o IntelliJ IDEA.

4- Se você não tiver nenhuma opção de projetos, verá a tela de boas-vindas. 

5- Você verá aqui uma opção para Obter do Controle de Versão (ou similar dependendo da versão do IntelliJ IDEA). 

6- Se você já tiver um projeto aberto, poderá executar a mesma ação em Arquivo | Novo | Projeto no menu Controle de versão. 

7- Em versões mais antigas do IntelliJ IDEA, você também pode usar ir para VCS | Obtenha no Controle de Versão . 

8- Esta opção de menu foi renomeada para Git | Clone em versões mais recentes (quando você tiver um projeto Git existente aberto).

9- Ao pressionar este botão, você terá a opção de selecionar o local do controle de versão, GitHub neste caso, e inserir o URL que está na área de transferência no campo URL.

10- Pressione Enter ou Clone para clonar o repositório GitHub no diretório selecionado. 
     O IntelliJ IDEA também pegará ferramentas de construção comuns, como Gradle ou Maven, e baixará automaticamente as dependências necessárias e construirá o projeto.

11- Ao abrir a janela do projeto, você também verá que o IntelliJ IDEA detectou os módulos do projeto e configurou corretamente as pastas test , main e resources em um projeto Maven como este.

## Link do vídeo:
https://www.youtube.com/watch?v=Wf4Wggnx59g


## Público-Alvo:
O público-alvo são clientes de farmácias que buscam conveniência, recomendações de medicamentos e uma experiência tecnologicamente avançada usando IA através de um totem farmacêutico de autoatendimento.

## Problemas que a aplicação se propõe a solucionar:

A proposta de um totem farmacêutico de autoatendimento visa abordar várias questões comuns encontradas em farmácias tradicionais, melhorando a experiência do cliente e otimizando o processo de compra de medicamentos. 

A seguir, são detalhados os principais problemas que esta solução pretende solucionar:

**Fila e Tempo de Espera Longos:**

Problema: Clientes frequentemente enfrentam filas longas e tempos de espera elevados para obter atendimento nas farmácias.

Solução: O totem automatiza parte do processo de compra, permitindo que os clientes selecionem medicamentos e recebam sugestões personalizadas antes de chegarem ao balcão, reduzindo significativamente o tempo de espera.
Falta de Personalização nas Recomendações:

Problema: As recomendações de medicamentos são geralmente baseadas em interações rápidas e sem um histórico detalhado do cliente, o que pode resultar em sugestões genéricas.

Solução: Utilizando inteligência artificial, o totem oferece sugestões de medicamentos baseadas nas compras anteriores do cliente e nos sintomas informados, proporcionando uma experiência mais personalizada e assertiva.
Dificuldade em Encontrar Medicamentos Específicos:

Problema: Clientes muitas vezes têm dificuldade em localizar medicamentos específicos nas prateleiras, necessitando da ajuda de um atendente.

Solução: O totem informa diretamente ao cliente onde encontrar os medicamentos desejados nas prateleiras, facilitando o processo de compra sem a necessidade de intervenção de um atendente.
Ineficiência no Atendimento no Balcão:

Problema: O processo de atendimento no balcão pode ser lento, especialmente quando os atendentes precisam iniciar o processo de assistência do zero.

Solução: O totem gera uma senha para o recepcionista do balcão e envia as informações selecionadas pelo usuário para uma dashboard, permitindo que o atendente já saiba os medicamentos escolhidos pelo cliente antes mesmo de atendê-lo, otimizando a eficiência do atendimento.
Falta de Feedback dos Clientes:

Problema: Farmácias muitas vezes não coletam feedback suficiente sobre a eficácia dos medicamentos e a satisfação dos clientes.

Solução: Após a compra, o totem solicita ao cliente que informe o sintoma tratado e avalie a satisfação com o produto de 0 a 5 estrelas. Este feedback é coletado antes da geração da senha para retirada do medicamento no balcão, proporcionando dados valiosos para a farmácia melhorar seus serviços e produtos

### Evolução em comparação a entrega da Sprint anterior:
1- Evoluímos mais a fundo a ideia, corrijimos, alteramos e criamos algumas classes que após uma longa discussão, chegamos ao consenso de serem inúteis.

2- Agora possui uma documentação online (Swagger-UI), para  --> http://localhost:8080/swagger-ui/index.html

3- Conexão com banco de dados (SQL)

4- Aprimoramento do código num geral


### Diagrama:

link para baixar imagem do diagrama:
https://www.mediafire.com/file/34jpnvi9gz038g3/Diagrama_sem_nome.drawio.png/file

