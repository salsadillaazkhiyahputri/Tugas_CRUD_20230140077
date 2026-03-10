package com.deploy.praktikum2.mapper;

import com.deploy.praktikum2.model.dto.KtpDto;
import com.deploy.praktikum2.model.entity.KtpEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface KtpMapper {

    KtpMapper INSTANCE = Mappers.getMapper(KtpMapper.class);


    KtpDto toKtpDto(KtpEntity ktpEntity);


    KtpEntity toKtpEntity(KtpDto ktpDto);
}
