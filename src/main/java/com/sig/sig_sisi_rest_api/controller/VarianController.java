package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.Varian;
import com.sig.sig_sisi_rest_api.service.VarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/varians")
public class VarianController {

    @Autowired
    private VarianService varianService;

    @GetMapping
    public List<Varian> getAllVarians() {
        return varianService.getAllVarians();
    }

    @GetMapping("/{v_id}")
    public Varian getVarianById(@PathVariable Long v_id) {
        return varianService.getVarianById(v_id);
    }

    @PostMapping
    public Varian createVarian(@RequestBody Varian varian) {
        return varianService.saveVarian(varian);
    }

    @PutMapping("/{v_id}")
    public Varian updateVarian(@PathVariable Long v_id, @RequestBody Varian varianDetails) {
        Varian varian = varianService.getVarianById(v_id);
        if (varian != null) {
            varian.setV_name(varianDetails.getV_name());
            varian.setV_price(varianDetails.getV_price());
            varian.setV_stock(varianDetails.getV_stock());
            varian.setV_updated_at(varianDetails.getV_updated_at());
            varian.setV_updated_by(varianDetails.getV_updated_by());
            return varianService.saveVarian(varian);
        }
        return null;
    }

    @DeleteMapping("/{v_id}")
    public void deleteVarian(@PathVariable Long v_id) {
        varianService.deleteVarian(v_id);
    }
}
