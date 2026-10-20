package br.com.alura.domain;

import java.util.Arrays;

public class Abrigo {

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private Pet[] pets;

    public Abrigo(String nome,String telefone, String email ) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public Abrigo() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Pet[] getPets() {
        return pets;
    }

//    @Override
//    public String toString() {
//        return "Abrigo{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", telefone='" + telefone + '\'' +
//                ", email='" + email + '\'' +
//                ", pets=" + Arrays.toString(pets) +
//                '}';
//    }

    @Override
    public String toString() {
        return """
                     "id":%s,"nome":"%s","telefone":"%s","email":"%s"
                     """.formatted(this.id, this.nome, this.telefone, this.email);
    }
}
