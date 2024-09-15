package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.Varian;
import com.sig.sig_sisi_rest_api.repository.VarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarianService {

    @Autowired
    private VarianRepository varianRepository;

    public List<Varian> getAllVarians() {
        return varianRepository.findAll();
    }

    public Varian getVarianById(Long id) {
        return varianRepository.findById(id).orElse(null);
    }

    public Varian saveVarian(Varian varian) {
        return varianRepository.save(varian);
    }

    public void deleteVarian(Long v_id) {
        varianRepository.deleteById(v_id);
    }
}
