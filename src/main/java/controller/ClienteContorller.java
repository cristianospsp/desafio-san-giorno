package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // Outros endpoints...

    @GetMapping("/email/{email}")
    public ResponseEntity<Cliente> consultaClientePorEmail(@PathVariable String email) {
        Cliente cliente = clienteService.consultaClientePorEmail(email);
        return ResponseEntity.ok(cliente);
    }
}
