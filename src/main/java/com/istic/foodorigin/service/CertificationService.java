package com.istic.foodorigin.service;

import com.istic.foodorigin.models.Certification;
import com.istic.foodorigin.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Class which calls {@link CertificationRepository} and processes information returned.
 */
@Service
public class CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    public Iterable<Certification> getAllCertifications() {
        Iterable<Certification> certifications = certificationRepository.findAll();
        return certifications;
    }

    public Certification getCertificationById(Long id) {
        Certification ret = null;
        if (id != null) {
            Optional<Certification> certification = certificationRepository.findById(id);
            if (certification.isPresent()) {
                ret = certification.get();
            }
        }
        return ret;
    }

}
