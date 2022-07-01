package main.java.com.spring.desafiotecnicogft.controller;

import main.java.com.spring.desafiotecnicogft.model.Telefone;
import main.java.com.spring.desafiotecnicogft.service.IFTelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("telefones")
public class TelefoneRestController {

    @Autowired
    private IFTelefoneService telefoneService;

    @GetMapping
    public ResponseEntity<Iterable<Telefone>> buscarTodos(){
        return ResponseEntity.ok(telefoneService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(telefoneService.buscarPorId(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefone> buscarPorNumero(@PathVariable Long id) {
        return ResponseEntity.ok(telefoneService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Telefone> inserir(@RequestBody Telefone telefone) {
        telefoneService.inserir(telefone);
        return ResponseEntity.ok(telefone);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Telefone> atualizar(@PathVariable Long id, @RequestBody Telefone telefone) {
        telefoneService.atualizar(id, telefone);
        return ResponseEntity.ok(telefone);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        telefoneService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
