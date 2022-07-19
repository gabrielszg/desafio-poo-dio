package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public String toString() {
        return "Curso:\n" +
                "Titulo = " + getTitulo() + "\n" +
                "Descricao = " + getDescricao() + "\n" +
                "Carga Horaria = " + cargaHoraria + "\n";
    }
    
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    
}
