import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ExemploArrayList {
    
    public static void main(String[] args) {
        
        // ============ 1. CRIANDO UM ARRAYLIST ============
        
        // ArrayList de String (tipo genérico)
        ArrayList<String> nomes = new ArrayList<>();
        
        // ArrayList com capacidade inicial (otimização)
        ArrayList<Integer> numeros = new ArrayList<>(20);
        
        // ArrayList com elementos iniciais
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        
        System.out.println("=== 1. CRIANDO ARRAYLIST ===");
        System.out.println("Frutas: " + frutas);
        System.out.println("Tamanho: " + frutas.size());
        System.out.println("Capacidade inicial (não é possível ver diretamente)\n");
        
        // ============ 2. ADICIONANDO ELEMENTOS ============
        
        System.out.println("=== 2. ADICIONANDO ELEMENTOS ===");
        
        // add(e) - adiciona no final
        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Maria");
        System.out.println("Após add: " + nomes);
        
        // add(pos, e) - adiciona em posição específica
        nomes.add(1, "Pedro");  // Insere na posição 1
        System.out.println("Após add(1, 'Pedro'): " + nomes);
        
        // addAll - adiciona toda uma coleção
        ArrayList<String> maisNomes = new ArrayList<>();
        maisNomes.add("Carlos");
        maisNomes.add("Julia");
        nomes.addAll(maisNomes);
        System.out.println("Após addAll: " + nomes);
        
        // ============ 3. ACESSANDO ELEMENTOS ============
        
        System.out.println("\n=== 3. ACESSANDO ELEMENTOS ===");
        
        // get(pos) - acessa por posição
        String primeiro = nomes.get(0);
        System.out.println("Primeiro elemento: " + primeiro);
        
        // Percorrendo com for
        System.out.print("Percorrendo com for: ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.print(nomes.get(i) + " ");
        }
        System.out.println();
        
        // Percorrendo com for-each (recomendado)
        System.out.print("Percorrendo com for-each: ");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();
        
        // Percorrendo com Iterator
        System.out.print("Percorrendo com Iterator: ");
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // ============ 4. MODIFICANDO ELEMENTOS ============
        
        System.out.println("\n=== 4. MODIFICANDO ELEMENTOS ===");
        
        // set(pos, e) - substitui elemento
        nomes.set(2, "Roberto");
        System.out.println("Após set(2, 'Roberto'): " + nomes);
        
        // ============ 5. REMOVENDO ELEMENTOS ============
        
        System.out.println("\n=== 5. REMOVENDO ELEMENTOS ===");
        
        // remove(pos) - remove por posição
        nomes.remove(1);  // Remove o elemento na posição 1
        System.out.println("Após remove(1): " + nomes);
        
        // remove(e) - remove por elemento
        nomes.remove("Maria");
        System.out.println("Após remove('Maria'): " + nomes);
        
        // removeAll - remove todos de uma coleção
        ArrayList<String> remover = new ArrayList<>();
        remover.add("Carlos");
        remover.add("Julia");
        nomes.removeAll(remover);
        System.out.println("Após removeAll: " + nomes);
        
        // retainAll - mantém apenas os da coleção
        ArrayList<String> manter = new ArrayList<>();
        manter.add("Ana");
        manter.add("Roberto");
        nomes.retainAll(manter);
        System.out.println("Após retainAll (mantendo Ana, Roberto): " + nomes);
        
        // ============ 6. BUSCANDO ELEMENTOS ============
        
        System.out.println("\n=== 6. BUSCANDO ELEMENTOS ===");
        
        // contains - verifica se existe
        boolean temAna = nomes.contains("Ana");
        System.out.println("Contém 'Ana'? " + temAna);
        
        // indexOf - posição do elemento
        int posicao = nomes.indexOf("Roberto");
        System.out.println("Posição de 'Roberto': " + posicao);
        
        // lastIndexOf - última ocorrência
        nomes.add("Ana");
        System.out.println("Lista: " + nomes);
        int ultimaPosicao = nomes.lastIndexOf("Ana");
        System.out.println("Última posição de 'Ana': " + ultimaPosicao);
        
        // ============ 7. ORDENAÇÃO ============
        
        System.out.println("\n=== 7. ORDENAÇÃO ===");
        
        // Ordenando com Collections
        ArrayList<Integer> numerosList = new ArrayList<>();
        numerosList.add(5);
        numerosList.add(2);
        numerosList.add(8);
        numerosList.add(1);
        numerosList.add(9);
        
        System.out.println("Lista original: " + numerosList);
        
        Collections.sort(numerosList);  // Ordena em ordem crescente
        System.out.println("Ordenada crescente: " + numerosList);
        
        Collections.sort(numerosList, Collections.reverseOrder());  // Decrescente
        System.out.println("Ordenada decrescente: " + numerosList);
        
        // ============ 8. OUTROS MÉTODOS ÚTEIS ============
        
        System.out.println("\n=== 8. OUTROS MÉTODOS ÚTEIS ===");
        
        // size - tamanho
        System.out.println("Tamanho: " + nomes.size());
        
        // isEmpty - está vazia?
        System.out.println("Está vazia? " + nomes.isEmpty());
        
        // subList - cria sublista
        ArrayList<String> subLista = new ArrayList<>(nomes.subList(0, 1));
        System.out.println("Sublista: " + subLista);
        
        // toArray - converte para array
        String[] arrayNomes = nomes.toArray(new String[0]);
        System.out.print("Array convertido: ");
        for (String nome : arrayNomes) {
            System.out.print(nome + " ");
        }
        System.out.println();
        
        // clear - limpa a lista
        nomes.clear();
        System.out.println("Após clear: " + nomes);
        System.out.println("Está vazia? " + nomes.isEmpty());
        
        // ============ 9. EXEMPLO PRÁTICO ============
        
        System.out.println("\n=== 9. EXEMPLO PRÁTICO ===");
        
        // Lista de estudantes com notas
        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Ana", 8.5));
        estudantes.add(new Estudante("João", 7.0));
        estudantes.add(new Estudante("Maria", 9.5));
        estudantes.add(new Estudante("Pedro", 6.5));
        
        System.out.println("Lista de estudantes:");
        for (Estudante e : estudantes) {
            System.out.println("  " + e);
        }
        
        // Encontrar aluno com maior nota
        Estudante melhor = estudantes.get(0);
        for (Estudante e : estudantes) {
            if (e.getNota() > melhor.getNota()) {
                melhor = e;
            }
        }
        System.out.println("\nMelhor aluno: " + melhor);
        
        // Filtrar alunos aprovados (nota >= 7)
        ArrayList<Estudante> aprovados = new ArrayList<>();
        for (Estudante e : estudantes) {
            if (e.getNota() >= 7.0) {
                aprovados.add(e);
            }
        }
        System.out.println("Alunos aprovados: " + aprovados);
    }
}

// Classe auxiliar para o exemplo prático
class Estudante {
    private String nome;
    private double nota;
    
    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getNota() {
        return nota;
    }
    
    @Override
    public String toString() {
        return nome + " (Nota: " + nota + ")";
    }
}
