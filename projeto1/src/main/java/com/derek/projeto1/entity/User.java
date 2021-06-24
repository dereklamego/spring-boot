package com.derek.projeto1.entity;
import java.util.Set;
import javax.persistence.*; //asteriscos para importar tudo da jpa

//anotação para informar que uma classe representa uma entidade e seus objetos devem ser persistidos no banco de dados.. OBS: Não ficou claro a diferença entre @table e @entity
@Entity 
public class User {
    @Id  //anotação para informar que o atributo é um id
    @GeneratedValue(strategy = GenerationType.AUTO) //anotação de auto increment desse id
    private Long id;
    private String name;
    private String email;

    @ManyToMany
    private Set<Role> roles;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

}
