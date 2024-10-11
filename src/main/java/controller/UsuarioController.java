package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/api/usuarios")
    public String listarUsuarios() {
        return "Lista de usuários";
    }

    @PostMapping("/api/usuarios")
    public String criarUsuario(@RequestBody String usuario) {
        return "Usuário criado: " + usuario;
    }
}