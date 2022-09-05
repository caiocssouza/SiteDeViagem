Algoritmo "Agencia de viagens"
// Disciplina   : [Linguagem e Lógica de Programação]
// Autor(a)    : CAIO CESAR SILVA E SOUZA
// Data atual  : 110/07/2022.
Var
   nome, destino, destino1: vetor [1..2] de CARACTERE

   resp: caractere
   i, opcao, rod: inteiro

Inicio
   escreval("===================")
   Escreval ("=AGENCIA DE VIAGENS SÃO-PAULO")
   escreval("===================")
   repita
      escreval ("[1] - CADASTRAR CLIENTE")
      escreval ("[2] - CADASTRAR DESTINO")
      leia (opcao)
      limpatela
      escreval ("=ESCOLHA UMA OPÇÃO VÁLIDA=")
   ate (opcao=1) ou (opcao=2)

   LIMPATELA
   escolha opcao
   caso 1

      para i de 1 ate 2 faca
         ESCREVAL ("=CADASTRO DE CLIENTE=")
         escreval ("Nome do cliente",i,":" )
         leia (nome[i])
         escreval ("Destino cliente",i,":" )
         leia (destino1[i])
            LIMPATELA
            escreval ("=ESCOLHA UMA OPÇÃO VÁLIDA=")
      fimpara
      LIMPATELA

      escreval ("=CLIENTES CADASTRADOS=")
      escreval ("======================")
      para i <- 1 ate 2 faca
         escreval(nome[i]," com destino " , destino1[i])
      fimpara

   caso 2
      escreval ("=CADASTRO DE DESTINO=")
      para i de 1 ate 2 faca
         escreval ("Destino", i, ":")
         leia (destino[i])
      fimpara
      LIMPATELA

      escreval ("=DESTINOS CADASTRADOS=")
      escreval ("======================")
      para i <- 1 ate 2 faca
         escreval (destino[i])
      fimpara

   fimescolha

Fimalgoritmo