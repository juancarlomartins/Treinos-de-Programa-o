Aqui vão ficar meus treino de HTML + CSS, quero construir páginas simples e com bom visual. Em seguida, quero trabalhar melhor na lógica de cada uma, deixando mais interativa e responsiva.

#Estudos e anotações importantes:
===========================================================

<!-- Tags principais que você SEMPRE usará -->
<div>     <!-- Container genérico (como uma classe base) -->
<section> <!-- Seção do conteúdo -->
<header>  <!-- Cabeçalho -->
<footer>  <!-- Rodapé -->
<nav>     <!-- Navegação -->
<main>    <!-- Conteúdo principal -->

<!-- Atributos importantes -->
class     /* Como uma classe para CSS (use sempre) */
id        /* Identificador único (use com moderação) */
data-*    /* Atributos personalizados (para JS) */

===========================================================

/* Box Model (todo elemento é uma caixa) */
elemento {
    margin: 10px;     /* Espaço EXTERNO */
    padding: 10px;    /* Espaço INTERNO */
    border: 1px solid black;
    width: 100px;
    height: 100px;
}

/* Display (como os elementos se comportam) */
display: block;        /* Ocupa linha inteira */
display: inline;       /* Fica na mesma linha */
display: inline-block; /* Melhor dos dois mundos */
display: flex;         /* PARA VOCÊ DECORAR - sistema flexível */
display: grid;         /* PARA VOCÊ DECORAR - sistema em grade */

#ALGUNS CONCEITOS AVANÇADOS

=========================================================
/* Pense no Flexbox como um sistema de distribuição */
.container-flex {
    display: flex;
    justify-content: center; /* horizontal */
    align-items: center;     /* vertical */
    flex-direction: row;     /* ou column */
    gap: 10px;               /* espaço entre itens */
}

CSS GRID

/* Como uma matriz bidimensional */
.container-grid {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
}

RESPONSIVIDADE (COMO IF/ELSE NO CSS)

/* Media Queries = if statements do CSS */
@media (max-width: 768px) {
    body {
        background: red; /* muda em telas pequenas */
    }
}
