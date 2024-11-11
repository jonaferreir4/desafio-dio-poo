package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosEscritos = new LinkedHashSet<>();
    private  Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp (BootCamp bootcamp) {
        this.conteudosEscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsEscritos().add(this);

    }
    public void progredir() {
        Optional<Conteudo> conteudo  = this.conteudosEscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosEscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosEscritos, dev.conteudosEscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosEscritos, conteudosConcluidos);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosEscritos() {
        return conteudosEscritos;
    }

    public void setConteudosEscritos(Set<Conteudo> conteudosEscritos) {
        this.conteudosEscritos = conteudosEscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosEscritos=" + conteudosEscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }
}
