# Entrega de Projeto Oscar Calçados

Projeto para participação em seleção de Desenvolvedor Java Júnior na referida empresa.

* O projeto tem __três__ partes e foi usado basicamente duas linguagens aqui: __Python__ e __Java__
1. Diretório _junior_
2. Diretório _crud_
3. Arquivo Python _api.py_

### Diretório _junior_
Neste está as resoluções da primeira parte do teste em projeto Java Maven simples com o arquivo _App.java_ tendo as resoluções e mais alguns outros arquivos acessório para complementação de entrega da atividade.
No arquivo _App.java_ cada questão está indicada por um comentário e para ver funcionando basta descomentar as partes de código e rodar o código na IDE de preferência.

### Diretório _crud_
Neste diretório estão presentes o projeto CRUD de calçados requisitado na segunda atividade. Aqui usei SpringBoot para criar tal microserviço em formato de WebApp em API REST. Como o(s) ou a(s) verá(ão) o projeto está arquitetado em quatro pacotes, **Model** (modelo do dado no banco); **Repository** (ligação com o banco e funções de filtro e atualização de dados); **Service** (regras de negócio); e **Controller** (apresentação e entrega de dados ao usuário). As classes estão comentadas brevemente para compreensão das suas funcionalidades, tanto quanto os seus métodos especificando-os para melhor entendimento. O arquivo de testes está no diretório _src/test_. Como é sabido esse framework não necessita de arquivo sql para criação do banco, ele faz todo o procedimento e aqui foi o usado o banco em memória H2 Database.

### Arquivo _api.py_
Por último, neste arquivo eu usei para fazer testes da API REST fazendo todas as quatros necessidades de CRUD adscritas no seu monograma (**C**reate, **R**ead, **U**ptate e **D**elete). Da mesma forma que o arquivo _App.java_ que necessita para ver funcionar comentar e descomentar os códigos, será necessário para este arquivo Python.

# Considerações Finais
Como tive outras atividades do período eu não pude concluí-la em tempo hábil por questões de força maior, pois a solução que inicialmente pensei para interface gráfica eu tive problemas de implementação e não pude concluída de forma satisfatória para entregá-la. Era uma aplicação web com express.js simples, mas estava apenas realizando o Read e Delete, ainda faltava o Create e Update para completar. Por isso decidir enviar somente o arquivo Python que é possível também realizar e ver em operação. Não significa dizer que a API não é possível ver através de um navegador, é possível sim através do link _localhost:3000_ como página inicial. Em conclusão, segue abaixo a listagem de links de acesso da API REST.

* http://localhost:3000/oscar - Lista de calçados (Método GET) Salvar calçado (Método POST)
* http://localhost:3000/oscar/delete?id={id} - Apagar um calçado pelo ID (código do calçado)
* http://localhost:3000/oscar/update?id={id}&componente=tamanho&value={value} - Atualizar um atributo de um calçado sendo delimitado qual é pelo ID.
* http://localhost:3000/oscar?tamanho={value} - Pesquisa de calçados por algum filtro. Essa API REST pesquisa apenas por dados exatos para deixar a pesquisa mais acertiva. Também foram criados filtros para cada um dos atributos do calçado e apenas um combinando dois atributos a título de demonstração de que a API pode fazer esse tipo de operação.
* http://localhost:3000/oscar/search?id={id} - Pesquisa por um calçado pelo ID (código do calçado).
* http://localhost:3000/h2-console - Link para acessar a interface do H2 Database se necessitarem olhar o SGBD da aplicação. Como os dados são em memória não é exagero deixa de sobreaviso que os dados serão apagados a cada vez que reiniciar a aplicação.

**Atenciosamente, Candidato Paulo Alessander.**
