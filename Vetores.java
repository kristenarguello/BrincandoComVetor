import java.util.*;
public class Vetores {
    public static int[] clone(int[]vetor)
    {
        return vetor;
    }
    public static void imprimeCompleto(int[] vetor)//sora
    {
        for(int i=0;i< vetor.length;i++) {
            System.out.println("\n Na posicao "+ (i+1)+ " esta o conteudo "+ vetor[i]);
        }
    }
    public static void imprimeValores(int[] vetor)//sora
    {
        for(int i=0;i< vetor.length;i++) {
            System.out.print( vetor[i]+ " ");
        }
    }
    public static int[] soma(int[] vetora, int[] vetorb)//sora
    {//recebe dois vetores e devolve um vetor ambos de mesmo tamanho
        int[] vetorS=new int[vetora.length];//cria um objeto do tipo Array unidimensional cujo conteudo e inteiro
        for(int i=0;i< vetora.length;i++)
        {vetorS[i]=vetora[i]+vetorb[i];// observe que a variavel indexada representa o conteudo do vetor
        }
        return vetorS;//retorna um endereco de vetor
    }
    public static int produtoEscalar(int[] vetora, int[] vetorb)//sora
    {//recebe dois vetores e devolve um valor Somatório
        int soma=0;
        for(int i=0;i< vetora.length;i++)
        {soma=soma +vetora[i]*vetorb[i];// observe que a variavel indexada representa o conteudo do vetor
        }
        return soma;//retorna um valor
    }
    public static int menorVetor(int[] vetora)//sora
    {//recebe vetor e devolve menor valor armazenado
        int menor=vetora[0];
        for(int i=1;i< vetora.length;i++)
        {if (vetora[i]<menor) menor=vetora[i];};// observe que a variavel indexada representa o conteudo do vetor

        return menor;//retorna um valor
    }
    public static int maiorVetor(int[] vetora)//sora
    {//recebe vetor e devolve menor valor armazenado
        int maior=vetora[0];
        for(int i=1;i< vetora.length;i++)
        {if (vetora[i]>maior) maior=vetora[i];};// observe que a variavel indexada representa o conteudo do vetor

        return maior;//retorna um valor
    }
    public static int frequenciaMenor(int[] vetora)//sora
    {//recebe vetor e devolve frequencia do menor valor armazenado
        int menor=menorVetor(vetora);
        int soma=0;
        for(int i=1;i< vetora.length;i++)
        {if (vetora[i]==menor) soma++;};// observe que a variavel indexada representa o conteudo do vetor

        return soma;//retorna um valor
    }
    public static int frequencia(int[] vetora, int valor)//sora
    {
        int soma=0;
        for(int i=0;i< vetora.length;i++)
        {if (vetora[i]==valor) soma++;};

        return soma;
    }
    public static void trocaVetor(int a, int b)
    {
        int [] vetor = new int[2];
        int aux = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = aux;
    }
    public static int[] trocaPar(int[] vetor)
    {
        int[] a = clone(vetor);
        if (a.length%4==0)
        {
            for (int i=1; i<=a.length; i++)
            {
                if (i%2==0) {trocaVetor(a[i], a[i+2]);i=i+2;}
            }
            return a;
        }
        for (int i=1; i<=a.length-2; i++)
        {
            if (i%2==0) {trocaVetor(a[i], a[i+2]);i=i+2;}
        }
        return a;
    }
    public static int[] subtra (int[] vetora, int[] vetorb)
    {
        int[] vetorc = new int[vetora.length];
        for(int i=0; i<vetorc.length; i++)
        {
            vetorc[i] = vetora[i]-vetorb[i];
        }
        return vetorc;
    }
    public static int[] trocaImparPar(int[] vetor)
    {
        int[] a = clone(vetor);
        if (a.length%2==0)
        {
            for (int i=1; i<=a.length; i=i+2)
            {
                trocaVetor(a[i],a[i+1]);
            }
            return a;
        }
        for (int i=1; i<=a.length-1; i=i+2)
        {
            trocaVetor(a[i],a[i+1]);
        }
        return a;
    }
    public static int[] par2impar1(int[] vetor)
    {
        int[] a = clone(vetor);
        for (int i=1; i<=a.length; i++)
        {
            if (i%2==0) a[i]=-2;
            if (i%2==1) a[i]=-1;
        }
        return a;
    }
    public static void gruda(int[] vetora, int[] vetorb)
    {
        for (int i=0;i<vetora.length;i++)
        {
            System.out.print(vetora[i]);
        }
        for(int i=0;i<vetorb.length;i++)
        {
            System.out.print(vetorb[i]);
        }
    }
    public static int[] interseccao(int[]vetora, int[]vetorb)
    {
        int tam, k=0;

        if (vetora.length>=vetorb.length) tam=vetora.length;
        else tam=vetorb.length;
        int[] comum = new int[tam];

        int a = 0;//contador de iguais

        for (int i=0;i<vetora.length;i++) {
            for (int n = 0; n < vetorb.length; n++) {
                if (vetora[i] == vetorb[n]) {
                    comum[k] = vetora[i];
                    k++; a++; break;
                }
            }
        }
        int[] comum2 = new int[a];//esse pedaco tira os 0 sobrando
        for(int j=0;j<a;j++)
        {
            comum2[j]=comum[j];
        }

        return repetidos(comum2,comum2.length);
    }
    public static int quantos_iguais(int[]vetora, int[]vetorb)
    {
        int a = 0;//contador de iguais

        for (int i=0;i<vetora.length;i++) {
            for (int n = 0; n < vetorb.length; n++) {
                if (vetora[i] == vetorb[n]) {
                    a++; break;
                }
            }
        }
        return a;
    }
    public static int[] ordenar_inteiros(int[] vetor)
    {
        int n=vetor.length;//tam para os novos vetores auxiliares, vai diminuindo a cada adicao no vetor da ordem
        int[] ordem = new int[vetor.length];//vetor final, em ordem
        int x = menorVetor(vetor);//x = valor a ser adicionado no ordenado

        int i=0;//posicao no vetor ordenado
        while (i<ordem.length)//loop ocorre para cada posicao do vetor da ordem, pode pular caso tenha repetido
        {
            while (n>0) {//enquanto o vetor auxiliar nao for zerado
                n--;//diminui um, automaticamente pois vai tirar o menor valor sempre
                //ADICAO NO VETOR ORDENADO DO MENOR VALOR
                int a = frequencia(vetor, x);
                if (a > 1) {//se tem mais de uma vez o numero em questao
                    for (int j=0;j < a; j++) {//quantas vezes tem que colocar (de acordo com a frequencia - a)
                        ordem[i] = x;
                        i++;//a cada vez a posicao sobe um
                    }
                    n = n - a+1;//retira a quantidade extra de numeros repetidos
                } else {ordem[i] = x;i++;}//caso nao repita, so adiciona um

                //CRIACAO DO VETOR AUXILIAR
                boolean ja_foi=false;//se o numero a ser colocado já foi, boolean faz a verificacao, comeca com false
                if (n>0) {//vetor aux nao zerado
                    int[] aux = new int[n];//cria vetor auxiliar
                    int p = 0;//posicao no vetor auxiliar
                    for (int j : vetor) {//cada posicao no vetor original, vai de um em um pra criar o vetor auxiliar
                        for (int f=0;f<i;f++) {
                            ja_foi = false;
                            if (j == ordem[f]) {//pega cada valor do vetor original e compara com os ja inseridos, se for igual nao considera pro vetor novo (true)
                                ja_foi = true;
                                break;
                            }
                        }
                        if (!ja_foi) {//tem que ser um valor nao usado ja pra ser inserido no vetor auxiliar
                            if (p<aux.length) {
                                aux[p] = j;
                                p++;//vai de posicao em posicao criando o vetor auxiliar
                            }
                        }
                    }
                    x = menorVetor(aux);}//DEFINICAO DO MENOR VALOR A SER ADICIONADO
            } i++;//PASSA PARA A PROXIMA POSICAO A SER PREENCHIDA
        }
        return ordem;
    }
    public static  int[] ordem_contador (int[] vetor)
    {
        int[] ordem = new int[vetor.length];
        int p=0,n=menorVetor(vetor);
        while (p<ordem.length)
        {
            for (int i=0;i<vetor.length;i++) {
                if (vetor[i]==n) {
                    if (frequencia(vetor,n)>1) {
                        for (int v=0;v<frequencia(vetor,n);v++) {
                            ordem[p]=n; p++; break;
                        }
                    } else {ordem[p]=n;p++;break;}
                }
            }
            n++;
        }
        return ordem;
    }
    public static  int[] descrescente (int[] vetor)
    {
        int[] ordem = new int[vetor.length];
        int p=0,n=maiorVetor(vetor);
        while (p<ordem.length)
        {
            for (int i=0;i<vetor.length;i++) {
                if (vetor[i]==n) {
                    if (frequencia(vetor,n)>1) {
                        for (int v=0;v<frequencia(vetor,n);v++) {
                            ordem[p]=n; p++; break;
                        }
                    } else {ordem[p]=n;p++;break;}
                }
            }
            n--;
        }
        return ordem;
    }
    public static int[] repetidos (int[] vetor,int quantosiguais_comrepet)
    {
        vetor = ordem_contador(vetor);
        int[] fim = new int[quantosiguais_comrepet];
        int freq, cont=0;
        for (int i=0; i<vetor.length;i++) {
            fim[cont]=vetor[i];
            cont++;
            freq=frequencia(vetor,vetor[i]);
            if (freq>1) {
                i=i+freq-1;
            }
        }
        int[] aux = new int[cont];
        for(int j=0;j<cont;j++) {
            aux[j]=fim[j];
        }
        return aux;
    }
    public static int[] uniao (int[] vetora, int[] vetorb) {
        int tam = vetora.length + vetorb.length;
        int[] uni = new int[tam];
        int posicao=0;
        for (int a=0;a<vetora.length;a++) {
            uni[posicao]=vetora[a];
            posicao++;
        }
        for (int b=0;b<vetorb.length;b++) {
            uni[posicao]=vetorb[b];
            posicao++;
        }
        return repetidos(uni,tam);
    }


    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        boolean possivI=true, possivU=true;
        int tamA, tamB;
        do {
        System.out.println ("insira o tamanho do vetor A e do vetor B, respectivamente");
        tamA = input.nextInt();
        tamB = input.nextInt();} while (tamA>=0 && tamB>=0);

        int[] vetora = new int[tamA];
        int [] vetorb = new int [tamB];
        if (tamA!=0) {
            System.out.println ("Insira os valores do vetor A: ");
            for (int i=0; i<vetora.length; i++) {
                System.out.println ("posicao " + i);
                vetora[i]=input.nextInt();
            }
        } else System.out.println ("o vetor A é nulo, não possui valores como conteúdo");
        System.out.println ("insira qualquer tecla para proceder");
        input.next();

        if (tamB!=0) {
            System.out.println ("Agora, insira os valores do vetor B: ");
            for (int j=0; j<vetorb.length; j++) {
                System.out.println ("posicao " + j);
                vetorb[j]=input.nextInt();
            }
        } else System.out.println ("o vetor B é nulo, não possui valores como conteúdo");
        System.out.println ("\n\nInsira qualquer tecla para proceder");
        input.next();

        int opc=0;
        while(opc!=18) {
        do {
        System.out.println ("\f****MENU DE OPCOES****");
        System.out.println ("[1] imprimir os valores de um dos vetores");
        System.out.println ("[2] imprimir os valores e suas posições de um dos vetores");
        System.out.println ("[3] somar os dois vetores criados");
        System.out.println ("[4] fazer o produto escalar dos dois vetores criados");
        System.out.println ("[5] exibir o menor valor de um dos vetores criados");
        System.out.println ("[6] exibir a frequência do menor valor de um dos vetores criados");
        System.out.println ("[7] exibir a frequência de um valor específico de um dos vetores criados");
        System.out.println ("[8] trocar os valores das posições pares entre si");
        System.out.println ("[9] subtrair os dois vetores criados");//A-B e B-A
        System.out.println ("[10] inverte os valores das posições pares pelas posições ímpares");
        System.out.println ("[11] troca os valores das posicoes pares por -2 e das ímpares por -1");
        System.out.println ("[12] concatena os dois vetores criados");
        System.out.println ("[13] exibe a intersecção dos dois vetores criados, caso seja possível (e a quantidade de conteúdo comum)");
        System.out.println ("[14] exibir um vetor a sua escolha em ordem crescente ou decrescente");
        System.out.println ("[15] exibir a união entre dois vetores, se possível");
        System.out.println ("[16] encerrar o programa");

        System.out.println ("\nInsira o número correspondente à opção desejada: ");
        opc = input.nextInt();
        } while (opc<1 || opc>16);

        switch (opc) {
            case 1:
                String vetorEscolhido;
                do {
                    System.out.println("\fInsira a letra correspondente ao vetor que deseja printar na tela: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));

                int repet;
                do {
                    System.out.println("\nDeseja exibir com os conteúdos repetidos? Digite 1 se sim, e digite 0 se não");
                    repet = input.nextInt();
                } while (repet != 0 || repet != 1);

                int ord;
                do {
                    System.out.println("\nDeseja exibir os valores em ordem crescente? Digite 1 se sim, e digite 0 se não");
                    ord = input.nextInt();
                } while (ord != 0 || repet != 1);

                if (vetorEscolhido.equals("A")) {
                    if (repet == 0) {
                        if (ord == 0) {
                            System.out.println("\nO vetor A possui os seguintes valores:");
                            imprimeValores(vetora);
                        }
                    } else if (repet == 1) {
                        if (ord == 0) {
                            System.out.println("\nO vetor A possui os seguintes valores, sem repetições:");
                            imprimeValores(repetidos(vetora, vetora.length));
                        }
                    } else if (repet == 1) {
                        if (ord == 1) {
                            System.out.println("\nO vetor A possui os seguintes valores, sem repetições e em ordem:");
                            imprimeValores(repetidos(vetora, vetora.length));
                        }
                    } else if (repet == 0) {
                        if (ord == 1) {
                            System.out.println("\nO vetor A possui os seguintes valores, em ordem:");
                            imprimeValores(ordenar_inteiros(vetora));
                        }
                    }
                    System.out.println("\n\n\nInsira qualquer tecla para proceder");
                    input.next();
                } else {
                    if (repet == 0) {
                        if (ord == 0) {
                            System.out.println("\nO vetor B possui os seguintes valores:");
                            imprimeValores(vetorb);
                        }
                    } else if (repet == 1) {
                        if (ord == 0) {
                            System.out.println("\nO vetor B possui os seguintes valores, sem repetições:");
                            imprimeValores(repetidos(vetorb, vetorb.length));
                        }
                    } else if (repet == 1) {
                        if (ord == 1) {
                            System.out.println("\nO vetor B possui os seguintes valores, sem repetições e em ordem:");
                            imprimeValores(repetidos(vetorb, vetorb.length));
                        }
                    } else if (repet == 0) {
                        if (ord == 1) {
                            System.out.println("\nO vetor B possui os seguintes valores, em ordem:");
                            imprimeValores(ordenar_inteiros(vetorb));
                        }
                    }
                    System.out.println("\n\n\nInsira qualquer tecla para proceder");
                    input.next();
                }
                break;

            case 2:
                do {
                    System.out.println("\fInsira a letra correspondente ao vetor que deseja printar na tela: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));

                if (vetorEscolhido.equals("A")) {
                    System.out.println("\nO vetor A possui os seguintes valores:");
                    imprimeCompleto(vetora);
                    System.out.println("\n\n\nInsira qualquer tecla para proceder");
                    input.next();
                } else {
                    System.out.println("\nO vetor B possui os seguintes valores:");
                    imprimeCompleto(vetorb);
                    System.out.println("\n\n\nInsira qualquer tecla para proceder");
                    input.next();
                }
                break;

            case 3:
                System.out.println("\fVetor A= ");
                imprimeValores(vetora);
                System.out.println("\nVetor B= ");
                imprimeValores(vetorb);
                System.out.println("\n\nO resultado da soma entre os dois vetores é ");
                imprimeCompleto(soma(vetora, vetorb));
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 4:
                System.out.println("\fProduto escalar = soma de todas as multiplicações das mesmas posições de dois vetores distintos;");
                System.out.println("\n\nVetor A= ");
                imprimeValores(vetora);
                System.out.println("\nVetor B= ");
                imprimeValores(vetorb);
                System.out.println("\n\n\nO produto escalar dos dois vetores inseridos é " + produtoEscalar(vetora, vetorb));
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 5:
                do {
                    System.out.println("\fSelecione de qual vetor deseja saber o menor valor: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                if (vetorEscolhido.equals("A")) {
                    System.out.println("\nVetor A: ");
                    imprimeValores(vetora);
                    System.out.println("\n\nO menor valor do vetor A é " + menorVetor(vetora));
                }
                if (vetorEscolhido.equals("B")) {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    System.out.println("\n\nO menor valor do vetor B é " + menorVetor(vetorb));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 6:
                do {
                    System.out.println("\fSelecione de qual vetor deseja saber a frequência do menor valor: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                if (vetorEscolhido.equals("A")) {
                    System.out.println("\nVetor A: ");
                    imprimeValores(vetora);
                    System.out.println("\n\nA frequência do menor valor do vetor A é " + frequenciaMenor(vetora));
                }
                if (vetorEscolhido.equals("B")) {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    System.out.println("\n\nA frequência do menor valor do vetor B é " + frequenciaMenor(vetorb));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 7:
                System.out.println("\fInsira o valor desejado para descobrir sua frequência em um determinado vetor");
                int valor = input.nextInt();
                do {
                    System.out.println("\fAgora, selecione de qual vetor deseja saber: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));

                if (vetorEscolhido.equals("A")) {
                    System.out.println("\nVetor A: ");
                    imprimeValores(vetora);
                    System.out.println("\n\nA frequência do valor " + valor + " no vetor A é " + frequencia(vetora, valor));
                } else {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    System.out.println("\n\nA frequência do valor " + valor + " no vetor B é " + frequencia(vetorb, valor));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 8:
                do {
                    System.out.println("\fAgora, selecione de qual vetor deseja saber: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                if (vetorEscolhido.equals("A")) {
                    System.out.println("\n\nNovo vetor modificado com posicoes pares trocadas: ");
                    imprimeCompleto(trocaPar(vetora));
                } else {
                    System.out.println("\n\nNovo vetor modificado com posicoes pares trocadas: ");
                    imprimeCompleto(trocaPar(vetorb));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 9:
                int oper = 0;
                do {
                    System.out.println("\fEscolha qual operação deseja realizar");
                    System.out.println("[1] vetorA - vetorB");
                    System.out.println("[2] vetorB - vetorA");
                    oper = input.nextInt();
                } while (oper != 1 || oper != 2);
                System.out.println("\fVetor A: ");
                imprimeValores(vetora);
                System.out.println("\nVetor B: ");
                imprimeValores(vetorb);
                System.out.println("\nNovo vetor modificado, com a subtração");
                if (oper == 1) {
                    imprimeValores(subtra(vetora, vetorb));
                } else {
                    imprimeValores(subtra(vetorb, vetora));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 10:
                do {
                    System.out.println("\fAgora, selecione de qual vetor deseja saber: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                if (vetorEscolhido.equals("A")) {
                    System.out.println("\fVetor A: ");
                    imprimeValores(vetora);
                    System.out.println("\nVetor A com as posicoes impares e pares invertidas:");
                    imprimeValores(trocaImparPar(vetora));
                } else {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    System.out.println("\nVetor B com as posicoes impares e pares invertidas:");
                    imprimeValores(trocaImparPar(vetorb));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 11:
                do {
                    System.out.println("\fAgora, selecione de qual vetor deseja saber: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                if (vetorEscolhido.equals("A")) {
                    System.out.println("\fVetor A: ");
                    imprimeValores(vetora);
                    System.out.println("\nVetor A com as posicoes impares e pares invertidas:");
                    imprimeValores(par2impar1(vetora));
                } else {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    System.out.println("\nVetor B com as posicoes impares e pares invertidas:");
                    imprimeValores(par2impar1(vetorb));
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 12:
                System.out.println("\fVetor A= ");
                imprimeValores(vetora);
                System.out.println("\nVetor B= ");
                imprimeValores(vetorb);
                System.out.println("\n\nA concatenação dos dois vetores, na ordem de A e B, fica da seguinte forma: ");
                gruda(vetora, vetorb);
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 13:
                if (vetora.length != 0 && vetorb.length != 0) {
                    System.out.println("\fA interseccao entre os vetores A e B contém os seguintes elementos, sem repetição: ");
                    imprimeValores(interseccao(vetora, vetorb));
                    System.out.println ("\nE existem " + quantos_iguais(vetora,vetorb) + " elementos em comum");
                } else
                    System.out.println("\fNão há elementos na intersecção entre A e B pois um dos vetores não possui nenhum valor");
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 14:
                int ordem;
                do {
                    System.out.println("\fSelecione de qual vetor deseja exibir: ");
                    System.out.println("[A] primeiro vetor que foi criado, vetor A");
                    System.out.println("[B] segundo vetor que foi criado, vetor B");
                    vetorEscolhido = input.next();
                } while (!vetorEscolhido.equals("A") || !vetorEscolhido.equals("B"));
                do {
                    System.out.println("\fDeseja exibir os valores em ordem crescente ou descrescente? Digite 1 para crecente e 0 para descrescente");
                    ordem = input.nextInt();
                } while (ordem != 0 || ordem != 1);

                if (vetorEscolhido.equals("A")) {
                    System.out.println("\fVetor A original: ");
                    imprimeValores(vetora);
                    if (ordem == 1) {
                        System.out.println("\nO vetor A em ordem crescente é assim: ");
                        ordenar_inteiros(vetora);
                    } else {
                        System.out.println("\nO vetor A em ordem descrescente é assim: ");
                        descrescente(vetora);
                    }
                } else {
                    System.out.println("\nVetor B: ");
                    imprimeValores(vetorb);
                    if (ordem == 1) {
                        System.out.println("\nO vetor B em ordem crescente é assim: ");
                        ordenar_inteiros(vetorb);
                    } else {
                        System.out.println("\nO vetor B em ordem descrescente é assim: ");
                        descrescente(vetorb);
                    }
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

            case 15:
                if (vetora.length != 0 && vetorb.length != 0) {
                    System.out.println("\fA união entre os dois vetores é, sem repetições");
                    imprimeValores(uniao(vetora, vetorb));
                } else {
                    System.out.println("\fNão há elementos em nenhum dos dois vetores, portanto, não há elementos em um vetor de união");
                }
                System.out.println("\n\n\nInsira qualquer tecla para proceder");
                input.next();
                break;

                case 16:
                System.out.println("\fObrigada por utilizar o programa! Espero que tenha gostado de brincar um pouquinho com vetores!");
                break;
        }}
    }
}
