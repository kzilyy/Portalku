package id.ac.polinema.lumajang.portalku.jurnal;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/jurnal")
@RequiredArgsConstructor
public class JurnalController {

    private final JurnalService jurnalService;

    @GetMapping
    public List<Jurnal> semua() {
        return jurnalService.cariSemua();
    }

    @GetMapping("/{id}")
    public Jurnal satu(@PathVariable Integer id) {
        return jurnalService.cariSatu(id);
    }

    @PostMapping
    public Jurnal tambah(@RequestBody Jurnal jurnal) {
        return jurnalService.tambah(jurnal);
    }

    @DeleteMapping("/{id}")
    public void hapus(@PathVariable Integer id) {
        jurnalService.hapus(id);
    }
}