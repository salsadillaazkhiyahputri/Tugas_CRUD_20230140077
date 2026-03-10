package com.deploy.praktikum2.service.impl;


import com.deploy.praktikum2.mapper.KtpMapper;
import com.deploy.praktikum2.model.dto.KtpAddRequest;
import com.deploy.praktikum2.model.dto.KtpDto;
import com.deploy.praktikum2.model.entity.KtpEntity;
import com.deploy.praktikum2.repository.KtpRepository;
import com.deploy.praktikum2.service.KtpService;
import com.deploy.praktikum2.util.ValidationUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class KtpServiceImpl implements KtpService {

    private final KtpRepository ktpRepository;
    private final ValidationUtil validationUtil;
    private final KtpMapper ktpMapper;

    @Transactional
    @Override
    public KtpDto addKtp(KtpAddRequest request) {
        validationUtil.validate(request);

        if (ktpRepository.existsByNomorKtp(request.getNomorKtp())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nomor KTP sudah terdaftar");
        }

        KtpEntity entity = KtpEntity.builder()
                .nomorKtp(request.getNomorKtp())
                .namaLengkap(request.getNamaLengkap())
                .alamat(request.getAlamat())
                .tanggalLahir(LocalDate.parse(request.getTanggalLahir()))
                .jenisKelamin(request.getJenisKelamin())
                .build();

        return ktpMapper.toKtpDto(ktpRepository.save(entity));
    }

    @Override
    public List<KtpDto> getAllKtp() {
        return ktpRepository.findAll().stream()
                .map(ktpMapper::toKtpDto)
                .collect(Collectors.toList());
    }

    @Override
    public KtpDto getKtpById(Integer id) {
        KtpEntity entity = ktpRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KTP dengan ID " + id + " tidak ditemukan"));
        return ktpMapper.toKtpDto(entity);
    }

    @Transactional
    @Override
    public KtpDto updateKtp(Integer id, KtpAddRequest request) {
        validationUtil.validate(request);

        KtpEntity existing = ktpRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KTP tidak ditemukan"));

        existing.setNomorKtp(request.getNomorKtp());
        existing.setNamaLengkap(request.getNamaLengkap());
        existing.setAlamat(request.getAlamat());
        existing.setTanggalLahir(LocalDate.parse(request.getTanggalLahir()));
        existing.setJenisKelamin(request.getJenisKelamin());

        return ktpMapper.toKtpDto(ktpRepository.save(existing));
    }

    @Transactional
    @Override
    public void deleteKtp(Integer id) {
        KtpEntity entity = ktpRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "KTP tidak ditemukan"));
        ktpRepository.delete(entity);
    }
}
