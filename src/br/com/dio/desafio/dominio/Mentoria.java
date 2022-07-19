package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria:\n" +
                "Titulo = " + getTitulo() + "\n" +
                "Descricao = " + getDescricao() + "\n" +
                "Data = " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + "\n";
    }
    
}
